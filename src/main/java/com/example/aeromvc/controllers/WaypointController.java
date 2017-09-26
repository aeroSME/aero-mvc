package com.example.aeromvc.controllers;

import com.example.aeromvc.models.Wpt;
import com.example.aeromvc.models.WptData;
import com.example.aeromvc.models.enums.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

@Controller
@RequestMapping("waypoint")
public class WaypointController {

    //static ArrayList<String> waypoints = new ArrayList<>();
    //static HashMap<String, String> waypoints = new HashMap<>();
    //static Wpt waypoints = new Wpt();
//    static ArrayList<Wpt> waypoints = new ArrayList<>();

    @RequestMapping(value = "")
    public String index(Model model) {

        model.addAttribute("title", "Waypoints");
        model.addAttribute("waypoints", WptData.getAll());

        return "waypoint/index";

    }

    @RequestMapping(value = "add", method = RequestMethod.GET)
    public String displayAddWaypointForm(Model model) {
        model.addAttribute("title", "Add Waypoint");
        model.addAttribute( new Wpt());
        model.addAttribute("icao_rgn", IcaoRgn.values());
        model.addAttribute("datum", Datum.values());
        model.addAttribute("local_datum", LocalDatum.values());
        model.addAttribute("geo_acc", CoordACC.values());
        model.addAttribute("usage_cd", WptUsage.values());
        model.addAttribute("wpt_type", WptType.values());
        model.addAttribute("wpt_rvsm", WptRVSM.values());
        model.addAttribute("in_dafif", InDAFIF.values());
        model.addAttribute("custarea", ARINCcustArea.values());


        return "waypoint/add";
    }

    @RequestMapping(value = "add", method = RequestMethod.POST)
    public String processAddWaypointForm(@ModelAttribute @Valid Wpt newWpt, Errors errors, Model model) {
        if (errors.hasErrors()) {
            model.addAttribute("title", "Add Waypoint");
            return "waypoint/add";
        }
        WptData.add(newWpt);
        return "redirect:";
    }

    @RequestMapping(value = "delete", method = RequestMethod.GET)
    public  String displayDeleteWaypointForm(Model model) {
        model.addAttribute("waypoints", WptData.getAll());
        model.addAttribute("title", "Delete Waypoints");
        return "waypoint/delete";
    }

    @RequestMapping(value = "delete", method = RequestMethod.POST)
    public String processDeleteWaypointForm(@RequestParam int[] waypointIds) {
        for (int waypointId : waypointIds) {
            WptData.remove(waypointId);
        }
        return "redirect:";
    }

    @RequestMapping(value = "modify/{waypointID}", method = RequestMethod.GET)
    public String processModifyWaypointForm(Model model, @PathVariable int waypointID) {
        Wpt modWpt = WptData.getById(waypointID);
        model.addAttribute("modded", modWpt);
        return "waypoint/modify";
    }

    @RequestMapping(value = "modify/{waypointID}", method = RequestMethod.POST)
    public String processModifyWaypointForm(@PathVariable int waypointID, String wpt_ident, String icao_rgn,
                                            float latitude, float longitude, Datum datum, LocalDatum local_datum,
                                            CoordACC geo_acc, String d_magvar, Double var, java.sql.Date var_date,
                                            WptUsage usage_cd, WptType wpt_type, WptRVSM wpt_rvsm) {
        Wpt modWpt = WptData.getById(waypointID);
        modWpt.setWpt_ident(wpt_ident);
        modWpt.setIcao_rgn(icao_rgn);
        modWpt.setLatitude(latitude);
        modWpt.setLongitude(longitude);
        modWpt.setDatum(datum);
        modWpt.setLocalDatum(local_datum);
        modWpt.setCoordACC(geo_acc);
        modWpt.setD_magvar(d_magvar);
        modWpt.setVar(var);
        modWpt.setVar_date(var_date);

        return "redirect:/waypoint";
    }

}
