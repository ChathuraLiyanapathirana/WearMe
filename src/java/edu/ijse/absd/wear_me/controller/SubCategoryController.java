/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.absd.wear_me.controller;

import edu.ijse.absd.wear_me.model.SubCategoryModel;
import edu.ijse.absd.wear_me.service.SubCategoryService;
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
@RequestMapping("subcategory")
public class SubCategoryController {

    @Autowired
    private SubCategoryService categoryService;

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public @ResponseBody
    String addSubCategory(@ModelAttribute("model") SubCategoryModel model) {
        if (categoryService.addSubCategory(model)) {
            return "success";
        }
        return "error";
    }

    @RequestMapping(value = "/view", method = RequestMethod.GET)
    public @ResponseBody
    String viewSubCategory() {
        return categoryService.viewSubCategory();
    }
}
