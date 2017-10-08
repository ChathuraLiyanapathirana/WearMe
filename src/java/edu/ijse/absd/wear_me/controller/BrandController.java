/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.absd.wear_me.controller;

import edu.ijse.absd.wear_me.model.BrandModel;
import edu.ijse.absd.wear_me.service.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author Chathura Buddhika <cbuddhika3@gmail.com>
 */
@Controller
@RequestMapping("brand")
public class BrandController {

    @Autowired
    private BrandService service;

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public @ResponseBody
    String addBrand(@ModelAttribute("model") BrandModel model) {
        if (service.addBrand(model)) {
            return "success";
        }
        return "error";
    }
    
    @RequestMapping(value = "/view", method = RequestMethod.GET)
    public @ResponseBody String viewBrand(){
        return service.viewBrand();
    }

}
