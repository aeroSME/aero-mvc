package com.example.aeromvc.controllers;

import com.example.aeromvc.models.data.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("navaid")
public class AerNavSvcController {

    @Autowired
    private AerNavSvcDAO aerNavSvcDAO;
    @Autowired
    private IcaoRgnDAO icaoRgnDAO;
    @Autowired
    private DatumDAO datumDAO;
    @Autowired
    private LocalDatumDAO localDatumDAO;
    @Autowired
    private CoordAccDAO coordAccDAO;
    @Autowired
    private WptUsageDAO wptUsageDAO;

    @RequestMapping(value = "")
    public String index(Model model) {
        model.addAttribute("title", "Navaids");
        model.addAttribute("navaids", aerNavSvcDAO.findAll());
        return "navaid/index";
    }
}