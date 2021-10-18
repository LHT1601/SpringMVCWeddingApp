/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lht.controllers;

import com.lht.pojos.User;
import com.lht.service.WeddingHallService;
import java.util.Map;
import javax.persistence.Query;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author LHT
 */
@Controller
@ControllerAdvice
public class HomeController {
   @Autowired
   private WeddingHallService weddingHallService;
    
    @RequestMapping("/")
    public String index(Model model, 
                        @RequestParam(value = "kw", required = false, defaultValue = "") String kw) {
        model.addAttribute("weddinghalls", this.weddingHallService.getWeddingHalls(kw));
                
        return "index";
    }
    
    
    
    @RequestMapping(path = "/cart")
    public String testRedirect(Model model){
        
        return "cart";
    }
    
//    @RequestMapping("/")
//    public String index(Model model, @RequestParam Map<String, String> params){
//            @RequestParam(value="first_name", required = false, defaultValue = "a") String firstName, 
//            @RequestParam(value="last_name", required = false, defaultValue = "b") String lastName){
//        String firstName = params.get("first_name");
//        String lastName = params.get("last_name");
//        
//        if (firstName != null && lastName != null)
//            model.addAttribute("name", String.format("%s %s", firstName, lastName));
//        else
//            model.addAttribute("name", "Trieu Handsome");
//        
//        model.addAttribute("user", new User());
        
//        return "index";
//    }
//    @RequestMapping("hello/{name}")
//    public String hello(Model model, @PathVariable(value="name") String name) {
//        model.addAttribute("massage", "welcome " + name + "!!!");
//        
//        return "hello";
//    }
//    
//    @RequestMapping(path = "/hello-post", method = RequestMethod.POST)
//    public String show(Model model, @ModelAttribute(value = "user") User user){
//        model.addAttribute("fullName", user.getFirstName() + " " + user.getLastName());
//        
//        return "index";
//    }
//    
//    @RequestMapping(path = "/test")
//    public String testRedirect(Model model){
//        model.addAttribute("testMsg", "wELLCOM REDIRECT!!!");
//        
//        return "forward:/hello/Trieu";
//    }
}
