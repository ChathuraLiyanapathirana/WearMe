/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.absd.wear_me.service.impl;

import com.google.gson.Gson;
import edu.ijse.absd.wear_me.dao.BrandDao;
import edu.ijse.absd.wear_me.model.BrandModel;
import edu.ijse.absd.wear_me.service.BrandService;
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
public class BrandServiceImpl implements BrandService {

    @Autowired
    private BrandDao brandDao;

    public boolean addBrand(BrandModel model) {
        Serializable add = brandDao.add(model);
        return null != add;
    }

    public String viewBrand() {
        ArrayList<BrandModel> allData = (ArrayList<BrandModel>) brandDao.viewAll();
        if (!allData.isEmpty()) {
            String toJson = new Gson().toJson(allData);
            return toJson;
        }
        return "emptyList";
    }

    public boolean deleteBrand(String value) {
        return brandDao.delete(value);
    }

    public boolean updateBrand(String oldValue, String newValue) {
        return brandDao.update(oldValue, newValue);
    }

}
