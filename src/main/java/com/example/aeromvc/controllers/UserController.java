package com.example.aeromvc.controllers;

import com.example.aeromvc.models.forms.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;

@Controller
@RequestMapping("user")
public class UserController {
    @RequestMapping(value = "login", method = RequestMethod.GET)
    public String add(Model model){
        User user = new User();
        model.addAttribute("title", "Please Log In");
        model.addAttribute("login", user);
        return "login/login";
    }

    @RequestMapping(value = "login", method = RequestMethod.POST)
    public String add(Model model, @ModelAttribute @Valid User user, Errors errors, String verify){
        model.addAttribute("verify", verify);

        if (!errors.hasErrors() && !verify.isEmpty() && user.getPassword().equals(verify)){
            model.addAttribute("username", user.getUsername());
            return "redirect:welcome.html";
        }else{
            String verifyError = "";
            if(verify.isEmpty() || !user.getPassword().equals(verify)){
                verifyError = "Please enter a matching Password.";
            }
            model.addAttribute("title", "Please Log In");
            model.addAttribute(user);
            model.addAttribute("verifyError", verifyError);
            return "/login/login";
        }
    }
}