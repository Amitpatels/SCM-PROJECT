package com.scm.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {

    @RequestMapping("/home")
    public String home(Model model){
        System.out.println("Home page handler...");
        model.addAttribute("name","Amit Patel");
        model.addAttribute("Company", "Google california");
        model.addAttribute("AnnualPackage", "3.5cr");
        model.addAttribute("AcceptOffer", "https://www.google.com/about/careers/applications/");

        return "home";
    }

}
