/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.absd.wear_me.controller;

import edu.ijse.absd.wear_me.model.MainCategoryModel;
import edu.ijse.absd.wear_me.service.MainCategoryService;
import java.io.IOException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author Chathura Buddhika <cbuddhika3@gmail.com>
 */
@Controller
@RequestMapping("maincategory")
public class MainCategoryController {

    @Autowired
    private MainCategoryService categoryService;

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public void addMainCategory(@ModelAttribute("model") MainCategoryModel model, HttpServletRequest request, HttpServletResponse response) throws IOException {
        boolean isAdded = categoryService.addMainCategory(model);
        if (isAdded) {
            response.getWriter().write("success");
        } else {
            response.getWriter().write("error");
        }
    }

    @RequestMapping(value = "/getMCData", method = RequestMethod.GET)
    public void viewMainCategory(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String msg = categoryService.viewMainCategory();
        response.getWriter().write(msg);
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public void updateMainCategory(@RequestParam("mcm_new_name") String newValue, @RequestParam("mcm_name") String oldValue, HttpServletResponse response) throws IOException {
        boolean isUpdated = categoryService.updateMainCategory(oldValue, newValue);
        if (isUpdated) {
            response.getWriter().write("success");
        } else {
            response.getWriter().write("error");
        }
    }

    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    public void deleteMainCategory(@RequestParam("mcm_name") String value, HttpServletResponse response) throws IOException {
        System.out.println("123456"); 
        boolean isDeleted = categoryService.deleteMainCategory(value);
        if (isDeleted) {
            response.getWriter().write("success");
        } else {
            response.getWriter().write("error");
        }
    }
}
