/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lht.controllers;

import com.cloudinary.Cloudinary;
import com.cloudinary.utils.ObjectUtils;
import com.lht.pojos.WeddingHall;
import com.lht.service.WeddingHallService;
import java.io.IOException;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

/**
 *
 * @author LHT
 */
@Controller
public class WeddingHallController {
   @Autowired
   private WeddingHallService weddingHallService;
    
    @GetMapping("/admin/weddinghalls")
    public String list(Model model){
        model.addAttribute("weddinghall", new WeddingHall());
        return "weddinghall";
    }
    
    @PostMapping("/admin/weddinghalls")
    public String add(Model model, @ModelAttribute(value = "weddinghall") @Valid WeddingHall weddinghall, BindingResult result){
        if (!result.hasErrors()) {
            if (this.weddingHallService.addOrUpdate(weddinghall) == true)
                return "redirect:/";
            else 
                model.addAttribute("errMgs", "Something wrong!!");
        }
        return "weddinghall";
    }
}
