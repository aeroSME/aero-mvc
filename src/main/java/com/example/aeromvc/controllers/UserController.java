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
    @RequestMapping(value = "add", method = RequestMethod.GET)
    public String add(Model model){
        User user = new User();
        model.addAttribute("title", "Add User");
        model.addAttribute("user", user);
        return "user/add";
    }

    @RequestMapping(value = "add", method = RequestMethod.POST)
    public String add(Model model, @ModelAttribute @Valid User user, Errors errors, String verify){
        model.addAttribute("verify", verify);

        if (!errors.hasErrors() && !verify.isEmpty() && user.getPassword().equals(verify)){
            model.addAttribute("username", user.getUsername());
            return "redirect: /main";
        }else{
            String verifyError = "";
            if(verify.isEmpty() || !user.getPassword().equals(verify)){
                verifyError = "Please enter a matching Password.";
            }
            model.addAttribute(user);
            model.addAttribute("verifyError", verifyError);
            return "/user/add";
        }
    }
}