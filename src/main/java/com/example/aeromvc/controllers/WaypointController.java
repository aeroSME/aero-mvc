package com.example.aeromvc.controllers;

import com.example.aeromvc.models.data.*;
import com.example.aeromvc.models.Wpt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Controller
@RequestMapping("waypoint")
public class WaypointController {

    @Autowired
    private WptDAO wptDao;
    @Autowired
    private IcaoRgnDAO icaoRgnDAO;
//    @Autowired
//    private DatumDAO datumDAO;
//    @Autowired
//    private LocalDatumDAO localDatumDAO;
//    @Autowired
//    private CoordAccDAO coordAccDAO;
//    @Autowired
//    private WptUsageDAO wptUsageDAO;
//    @Autowired
//    private WptTypeDAO wptTypeDAO;
//    @Autowired
//    private WptRvsmDAO wptRvsmDAO;
//    @Autowired
//    private InDafifDAO inDafifDAO;
//    @Autowired
//    private NameIndicatorDAO nameIndicatorDAO;
//    @Autowired
//    private ArincRgnDAO arincRgnDAO;


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
        model.addAttribute("icao_rgns", icaoRgnDAO.findAll());
//        model.addAttribute("datums", datumDAO.findAll());
//        model.addAttribute("local_datums", localDatumDAO.findAll());
//        model.addAttribute("coordACCs", coordAccDAO.findAll());
//        model.addAttribute("wpt_usages", wptUsageDAO.findAll());
//        model.addAttribute("wpt_types", wptTypeDAO.findAll());
//        model.addAttribute("wpt_rvsms", wptRvsmDAO.findAll());
//        model.addAttribute("in_dafifs", inDafifDAO.findAll());
//        model.addAttribute("name_inds", nameIndicatorDAO.findAll());
//        model.addAttribute("arincCustAreas", arincRgnDAO.findAll());
        return "waypoint/add";
    }

    @RequestMapping(value = "add", method = RequestMethod.POST)
    public String processAddWaypointForm(@ModelAttribute @Valid Wpt newWpt, Errors errors,Model model) {
//        if (errors.hasErrors()) {
//            model.addAttribute("title", "Add Waypoint");
//            model.addAttribute("icao_rgns", icaoRgnDAO.findAll());
//
//            return "waypoint/add";
//        }
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

//    @RequestMapping(value = "modify/{waypointID}", method = RequestMethod.GET)
//    public String processModifyWaypointForm(Model model, @PathVariable int waypointID) {
//        //check Cheese MVC to see if next line is right.
//        Wpt modWpt = wptDao.findOne(waypointID);
//        model.addAttribute(modWpt);
//        model.addAttribute("icao_rgns", icaoRgnDAO.findAll());
//        model.addAttribute("datums", datumDAO.findAll());
//        model.addAttribute("local_datums", localDatumDAO.findAll());
//        model.addAttribute("coordACCs", coordAccDAO.findAll());
//        model.addAttribute("wpt_usages", wptUsageDAO.findAll());
//        model.addAttribute("wpt_types", wptTypeDAO.findAll());
//        model.addAttribute("wpt_rvsms", wptRvsmDAO.findAll());
//        model.addAttribute("in_dafifs", inDafifDAO.findAll());
//        model.addAttribute("name_inds", nameIndicatorDAO.findAll());
//        model.addAttribute("arincCustAreas", arincRgnDAO.findAll());
//        return "waypoint/modify";
//    }

//    @RequestMapping(value = "modify/{waypointID}", method = RequestMethod.POST)
//    public String processModifyWaypointForm(@PathVariable int waypointID, Errors errors,
//                                            @ModelAttribute @Valid Wpt modWpt)
//    {
//        modWpt = wptDao.findOne(waypointID);
////        modWpt.setWpt_ident(wpt_ident);
////        modWpt.setIcao_rgn(icao_rgn);
////        modWpt.setLatitude(latitude);
////        modWpt.setLongitude(longitude);
////        modWpt.setDatum(datum);
////        modWpt.setLocal_datum(local_datum);
////        modWpt.setCoordacc(coordACC);
////        modWpt.setD_magvar(d_magvar);
////        modWpt.setVar(var);
////        modWpt.setVar_date(var_date);
////        modWpt.setWpt_usage(wpt_usage);
////        modWpt.setWpt_type(wpt_type);
////        modWpt.setWpt_rvsm(wpt_rvsm);
////        modWpt.setIn_dafif(in_dafif);
////        modWpt.setDrv_ident(drv_ident);
////        modWpt.setChart_text(chart_text);
////        modWpt.setName_ind(name_ind);
////        modWpt.setName_desc(name_desc);
////        modWpt.setPlace_name(place_name);
////        modWpt.setArincCustArea(arincCustArea);
//        return "redirect:/waypoint";
//    }

}
