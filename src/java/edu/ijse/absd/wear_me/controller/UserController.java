/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.absd.wear_me.controller;

import edu.ijse.absd.wear_me.model.UserModel;
import edu.ijse.absd.wear_me.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Chathura Buddhika <cbuddhika3@gmail.com>
 */
@Controller
@SessionAttributes("logedUser")
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public ModelAndView loginUser(@ModelAttribute("model") UserModel model) {
        String loginUser = userService.loginUser(model);
        ModelAndView mav = new ModelAndView();
        if (loginUser.equals("firstUse")) {
            mav.setViewName("admin/adminConfigure");
            return mav;
        } else if (loginUser.equals("validUser")) {
            mav.addObject("logedUser", model);
            mav.setViewName("admin/home");
            return mav;
        } else {
            mav.setViewName("test/Test");
            return mav;
        }
    }

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public String registerUser(@ModelAttribute("model") UserModel model) {
        if (userService.registerUser(model)) {
            return "admin/home";
        }
        return "test/Test";
    }
}
