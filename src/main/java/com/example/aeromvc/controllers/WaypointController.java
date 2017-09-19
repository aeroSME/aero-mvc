package com.example.aeromvc.controllers;

import com.example.aeromvc.models.Wpt;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.HashMap;

@Controller
@RequestMapping("waypoint")
public class WaypointController {

    //static ArrayList<String> waypoints = new ArrayList<>();
    //static HashMap<String, String> waypoints = new HashMap<>();
    static Wpt waypoints = new Wpt();
    @RequestMapping(value = "")

    public String index(Model model) {

        model.addAttribute("title", "Waypoints");
        model.addAttribute("waypoints", waypoints);

        return "waypoint/index";

    }

    @RequestMapping(value = "add", method = RequestMethod.GET)
    public String displayAddWaypointForm(Model model) {
        model.addAttribute("title", "Add Waypoint");
        return "waypoint/add";
    }

    @RequestMapping(value = "add", method = RequestMethod.POST)
    public String processAddWaypointForm(@RequestParam String wptIdent, @RequestParam String icaoRgn) {
        waypoints.setWpt_ident(wptIdent);
        waypoints.setIcao_rgn(icaoRgn);
        return "redirect:";
    }
}
