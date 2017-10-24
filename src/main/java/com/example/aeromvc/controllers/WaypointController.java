package com.example.aeromvc.controllers;

import com.example.aeromvc.models.data.*;
import com.example.aeromvc.models.forms.Wpt;
import com.example.aeromvc.models.enums.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Date;

@Controller
@RequestMapping("waypoint")
public class WaypointController {

    @Autowired
    private WptDAO wptDao;
    @Autowired
    private IcaoRgnDAO icaoRgnDAO;
    @Autowired
    private DatumDAO datumDAO;
    @Autowired
    private LocalDatumDAO localDatumDAO;
    @Autowired
    private CoordAccDAO coordAccDAO;
    @Autowired
    private WptUsageDAO wptUsageDAO;
    @Autowired
    private WptTypeDAO wptTypeDAO;
    @Autowired
    private WptRvsmDAO wptRvsmDAO;
    @Autowired
    private NameIndicatorDAO nameIndicatorDAO;
    @Autowired
    private ArincRgnDAO arincRgnDAO;


    @RequestMapping(value = "")
    public String index(Model model) {
        model.addAttribute("title", "Waypoints");
        model.addAttribute("waypoints", wptDao.findAll());
        return "waypoint/index";

    }

    @RequestMapping(value = "add", method = RequestMethod.GET)
    public String displayAddWaypointForm(Model model) {
        model.addAttribute("title", "Add Waypoint");
        model.addAttribute( new Wpt());
        model.addAttribute("icaorgns", icaoRgnDAO.findAll());
        model.addAttribute("datums", datumDAO.findAll());
        model.addAttribute("localdatums", localDatumDAO.findAll());
        model.addAttribute("coordaccs", coordAccDAO.findAll());
        model.addAttribute("wptusages", wptUsageDAO.findAll());
        model.addAttribute("wpttypes", wptTypeDAO.findAll());
        model.addAttribute("wptrvsms", wptRvsmDAO.findAll());
        model.addAttribute("nameinds", nameIndicatorDAO.findAll());
        model.addAttribute("arincrgns", arincRgnDAO.findAll());
        return "waypoint/add";
    }

    @RequestMapping(value = "add", method = RequestMethod.POST)
    public String processAddWaypointForm(@ModelAttribute @Valid Wpt newWpt, Errors errors, Model model) {
        if (errors.hasErrors()) {
            model.addAttribute("title", "Add Waypoint");
            model.addAttribute("icaorgns", icaoRgnDAO.findAll());
            model.addAttribute("datums", datumDAO.findAll());
            model.addAttribute("localdatums", localDatumDAO.findAll());
            model.addAttribute("coordaccs", coordAccDAO.findAll());
            model.addAttribute("wptusages", wptUsageDAO.findAll());
            model.addAttribute("wpttypes", wptTypeDAO.findAll());
            model.addAttribute("wptrvsms", wptRvsmDAO.findAll());
            model.addAttribute("nameinds", nameIndicatorDAO.findAll());
            model.addAttribute("arincrgns", arincRgnDAO.findAll());
            return "waypoint/add";
        }
        wptDao.save(newWpt);
        return "redirect:";
    }

    @RequestMapping(value = "delete", method = RequestMethod.GET)
    public  String displayDeleteWaypointForm(Model model) {
        model.addAttribute("waypoints", wptDao.findAll());
        model.addAttribute("title", "Delete Waypoints");
        return "waypoint/delete";
    }

    @RequestMapping(value = "delete", method = RequestMethod.POST)
    public String processDeleteWaypointForm(@RequestParam int[] waypointIds) {
        for (int waypointId : waypointIds) {
            wptDao.delete(waypointId);
        }
        return "redirect:";
    }

    @RequestMapping(value = "modify/{waypointID}", method = RequestMethod.GET)
    public String processModifyWaypointForm(Model model, @PathVariable int waypointID) {
        //check Cheese MVC to see if next line is right.
        Wpt modWpt = wptDao.findOne(waypointID);
        model.addAttribute(modWpt);
        model.addAttribute("icaorgns", icaoRgnDAO.findAll());
        model.addAttribute("datums", datumDAO.findAll());
        model.addAttribute("localdatums", localDatumDAO.findAll());
        model.addAttribute("coordaccs", coordAccDAO.findAll());
        model.addAttribute("wptusages", wptUsageDAO.findAll());
        model.addAttribute("wpttypes", wptTypeDAO.findAll());
        model.addAttribute("wptrvsms", wptRvsmDAO.findAll());
        model.addAttribute("nameinds", nameIndicatorDAO.findAll());
        model.addAttribute("arincrgns", arincRgnDAO.findAll());
        return "waypoint/modify";
    }

    @RequestMapping(value = "modify/{waypointID}", method = RequestMethod.POST)
    public String processModifyWaypointForm(@PathVariable int waypointID, @Valid Wpt modWpt, Model model, Errors errors,
                                            String wpt_ident, IcaoRgn icaoRgn, float latitude, float longitude,
                                            Datum datum, LocalDatum localDatum, CoordAcc coordAcc, String d_magvar,
                                            Date var_date, UsageCd usageCd, WptType wptType, WptRvsm wptRvsm,
                                            boolean in_dafif, boolean drv_ident, String chart_text,
                                            NameIndicator nameIndicator, String name_desc, String place_name,
                                            ArincRgn arincRgn)
    {
//        if (errors.hasErrors()) {
            modWpt = wptDao.findOne(waypointID);
            modWpt.setWpt_ident(wpt_ident);
            modWpt.setIcaoRgn(icaoRgn);
            modWpt.setLatitude(latitude);
            modWpt.setLongitude(longitude);
            modWpt.setDatum(datum);
            modWpt.setLocalDatum(localDatum);
            modWpt.setCoordAcc(coordAcc);
            modWpt.setD_magvar(d_magvar);
//        modWpt.setVar_date(var_date);
            modWpt.setUsageCd(usageCd);
            modWpt.setWptType(wptType);
            modWpt.setWptRvsm(wptRvsm);
            modWpt.setIn_dafif(in_dafif);
            modWpt.setDrv_ident(drv_ident);
            modWpt.setChart_text(chart_text);
            modWpt.setNameIndicator(nameIndicator);
            modWpt.setName_desc(name_desc);
            modWpt.setPlace_name(place_name);
            modWpt.setArincRgn(arincRgn);
//            return "waypoint/modify";
//        }
        wptDao.save(modWpt);
        return "redirect:/waypoint";
    }

}
