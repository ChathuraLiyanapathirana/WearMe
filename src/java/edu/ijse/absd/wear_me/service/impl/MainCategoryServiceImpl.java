/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.absd.wear_me.service.impl;

import com.google.gson.Gson;
import edu.ijse.absd.wear_me.dao.MainCategoryDao;
import edu.ijse.absd.wear_me.model.MainCategoryModel;
import edu.ijse.absd.wear_me.service.MainCategoryService;
import java.io.Serializable;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Chathura Buddhika <cbuddhika3@gmail.com>
 */
@Transactional
@Service
public class MainCategoryServiceImpl implements MainCategoryService {

    @Autowired
    private MainCategoryDao categoryDao;

    public boolean addMainCategory(MainCategoryModel mcm) {
        Serializable add = categoryDao.add(mcm);
        return null != add;
    }

    public String viewMainCategory() {
        ArrayList<MainCategoryModel> models = (ArrayList<MainCategoryModel>) categoryDao.viewAll();
        if (!models.isEmpty()) {
            String jsonArray = new Gson().toJson(models);
            return jsonArray;
        }
        return "emptyList";
    }

    public boolean updateMainCategory(String oldValue, String newValue) {
        return categoryDao.update(oldValue, newValue);
    }

    public boolean deleteMainCategory(String value) {
        return categoryDao.delete(value);
    }

}
