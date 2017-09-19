package com.example.aeromvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;

@Controller
@RequestMapping("waypoint")
public class WaypointController {

    static         ArrayList<String> waypoints = new ArrayList<>();
    @RequestMapping(value = "")
//    @ResponseBody
//    public String index(HttpServletRequest request) {
//
//        String ident = request.getParameter("ident");
//
//        return "Waypoint " + ident;
//    }
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
    public String processAddWaypointForm(@RequestParam String wptIdent) {
        waypoints.add(wptIdent);
        return "redirect:";
    }
}
