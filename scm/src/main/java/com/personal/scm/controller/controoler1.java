package com.personal.scm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;




@Controller
public class controoler1 {
 @RequestMapping("/home")
 public String home(){
    //  model.addAttribute("name","Atul");
    //  model.addAttribute("github", "https://github.com/Rajath1091/Food-App");
        System.out.println("Home Page controller");
        return "home";
    }
    @RequestMapping("/contect")
    public String contect(){
       //  model.addAttribute("name","Atul");
       //  model.addAttribute("github", "https://github.com/Rajath1091/Food-App");
           System.out.println("Contect Page controller");
           return "contect";
       }
    @RequestMapping("/about")
   public String about(){

   System.out.println("About page loading");
return "about";
    }
    @RequestMapping("/service")
   public String service(){
    return "service";

    }
    @RequestMapping("/login")
    public String login(){
    return "login";

    }
    @RequestMapping("/register")
    public String register(){
    return "register";

    }
    
}
