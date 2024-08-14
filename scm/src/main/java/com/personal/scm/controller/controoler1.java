package com.personal.scm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class controoler1 {
 @RequestMapping("/home")
 public String home(Model model){
     model.addAttribute("name","Atul");
     model.addAttribute("github", "https://github.com/Rajath1091/Food-App");
        System.out.println("Home Page controller");
        return "home";
    }
}
