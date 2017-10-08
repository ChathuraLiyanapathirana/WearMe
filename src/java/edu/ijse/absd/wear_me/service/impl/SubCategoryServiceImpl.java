/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.absd.wear_me.service.impl;

import com.google.gson.Gson;
import edu.ijse.absd.wear_me.dao.SubCategoryDao;
import edu.ijse.absd.wear_me.model.SubCategoryModel;
import edu.ijse.absd.wear_me.service.SubCategoryService;
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
public class SubCategoryServiceImpl implements SubCategoryService {

    @Autowired
    private SubCategoryDao categoryDao;

    public boolean addSubCategory(SubCategoryModel model) {
        Serializable add = categoryDao.add(model);
        return null != add;
    }

    public String viewSubCategory() {
        ArrayList<SubCategoryModel> allData = (ArrayList<SubCategoryModel>) categoryDao.viewAll();
        if (!allData.isEmpty()) {
            String toJson = new Gson().toJson(allData);
            return toJson;
        }
        return "emptyList";
    }

}
