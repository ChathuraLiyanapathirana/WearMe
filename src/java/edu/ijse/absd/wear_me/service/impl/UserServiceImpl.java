/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.absd.wear_me.service.impl;

import edu.ijse.absd.wear_me.dao.UserDao;
import edu.ijse.absd.wear_me.model.UserModel;
import edu.ijse.absd.wear_me.service.UserService;
import java.io.Serializable;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Chathura Buddhika <cbuddhika3@gmail.com>
 */
@Transactional
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    public String loginUser(UserModel model) {
        List<UserModel> viewAll = userDao.viewAll();
        if (viewAll.isEmpty()) {
            return "firstUse";
        } else if (!viewAll.isEmpty()) {
            UserModel user = userDao.search(model);
            if (null != user) {
                return "validUser";
            }
        }
        return "invalidUser";
    }

    public boolean registerUser(UserModel model) {
        Serializable add = userDao.add(model);
        return null != add;
    }
}
