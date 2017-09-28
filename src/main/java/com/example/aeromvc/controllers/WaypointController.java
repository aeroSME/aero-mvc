package com.example.aeromvc.controllers;

import com.example.aeromvc.models.Wpt;
import com.example.aeromvc.models.data.WptDAO;
import com.example.aeromvc.models.enums.*;
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
        model.addAttribute("icao_rgns", IcaoRgn.values());
        model.addAttribute("datums", Datum.values());
        model.addAttribute("local_datums", LocalDatum.values());
        model.addAttribute("coordACCs", CoordACC.values());
        model.addAttribute("wpt_usages", WptUsage.values());
        model.addAttribute("wpt_types", WptType.values());
        model.addAttribute("wpt_rvsms", WptRVSM.values());
        model.addAttribute("in_dafifs", InDAFIF.values());
        model.addAttribute("name_inds", NameIndicator.values());
        model.addAttribute("arincCustAreas", ARINCcustArea.values());
        return "waypoint/add";
    }

    @RequestMapping(value = "add", method = RequestMethod.POST)
    public String processAddWaypointForm(@ModelAttribute @Valid Wpt newWpt, Errors errors, Model model) {
        if (errors.hasErrors()) {
            model.addAttribute("title", "Add Waypoint");
            model.addAttribute("icao_rgns", IcaoRgn.values());
            model.addAttribute("datums", Datum.values());
            model.addAttribute("local_datums", LocalDatum.values());
            model.addAttribute("coordACCs", CoordACC.values());
            model.addAttribute("wpt_usages", WptUsage.values());
            model.addAttribute("wpt_types", WptType.values());
            model.addAttribute("wpt_rvsms", WptRVSM.values());
            model.addAttribute("in_dafifs", InDAFIF.values());
            model.addAttribute("name_inds", NameIndicator.values());
            model.addAttribute("arincCustAreas", ARINCcustArea.values());
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
        model.addAttribute("icao_rgns", IcaoRgn.values());
        model.addAttribute("datums", Datum.values());
        model.addAttribute("local_datums", LocalDatum.values());
        model.addAttribute("coordACCs", CoordACC.values());
        model.addAttribute("wpt_usages", WptUsage.values());
        model.addAttribute("wpt_types", WptType.values());
        model.addAttribute("wpt_rvsms", WptRVSM.values());
        model.addAttribute("in_dafifs", InDAFIF.values());
        model.addAttribute("name_inds", NameIndicator.values());
        model.addAttribute("arincCustAreas", ARINCcustArea.values());
        return "waypoint/modify";
    }

    @RequestMapping(value = "modify/{waypointID}", method = RequestMethod.POST)
    public String processModifyWaypointForm(@PathVariable int waypointID, Errors errors,
                                            @ModelAttribute @Valid Wpt modWpt, String wpt_ident, String icao_rgn,
                                            float latitude, float longitude, Datum datum, LocalDatum local_datum,
                                            CoordACC coordACC, String d_magvar, Double var, java.sql.Date var_date,
                                            WptUsage wpt_usage, WptType wpt_type, WptRVSM wpt_rvsm, InDAFIF in_dafif,
                                            boolean drv_ident, String chart_text, NameIndicator name_ind,
                                            String name_desc, String place_name, ARINCcustArea arincCustArea)
    {
        modWpt = wptDao.findOne(waypointID);
        modWpt.setWpt_ident(wpt_ident);
        modWpt.setIcao_rgn(icao_rgn);
        modWpt.setLatitude(latitude);
        modWpt.setLongitude(longitude);
        modWpt.setDatum(datum);
        modWpt.setLocal_datum(local_datum);
        modWpt.setCoordACC(coordACC);
        modWpt.setD_magvar(d_magvar);
        modWpt.setVar(var);
        modWpt.setVar_date(var_date);
        modWpt.setWpt_usage(wpt_usage);
        modWpt.setWpt_type(wpt_type);
        modWpt.setWpt_rvsm(wpt_rvsm);
        modWpt.setIn_dafif(in_dafif);
        modWpt.setDrv_ident(drv_ident);
        modWpt.setChart_text(chart_text);
        modWpt.setName_ind(name_ind);
        modWpt.setName_desc(name_desc);
        modWpt.setPlace_name(place_name);
        modWpt.setArincCustArea(arincCustArea);
        return "redirect:/waypoint";
    }

}
