package com.example.aeromvc.controllers;

import com.example.aeromvc.models.forms.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
@RequestMapping("main")
public class MainController {
    @RequestMapping(value = "", method = RequestMethod.GET)
    public String add(Model model) {
        model.addAttribute("title", "Welcome to the AeroApp");
        //model.addAttribute("login", login);
        return "main/index";
    }
}




