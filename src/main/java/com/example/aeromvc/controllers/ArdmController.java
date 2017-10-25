package com.example.aeromvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("airport")
public class ArdmController {

    @RequestMapping(value = "")
    public String index(Model model) {
        model.addAttribute("title", "Airports");
    //            model.addAttribute("airports", .findAll());
        return "airport/index";
        }
    }
