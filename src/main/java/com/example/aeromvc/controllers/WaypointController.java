package com.example.aeromvc.controllers;

import com.example.aeromvc.models.Wpt;
import com.example.aeromvc.models.WptData;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
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
        return "waypoint/add";
    }

    @RequestMapping(value = "add", method = RequestMethod.POST)
    public String processAddWaypointForm(@ModelAttribute Wpt newWpt) {
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

//    @RequestMapping(value = "modify", method = RequestMethod.POST)
//    public String processModifyWaypointForm(int waypointId, String wpt_ident, String icao_rgn)

}
