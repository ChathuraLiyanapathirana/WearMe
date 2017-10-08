/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.absd.wear_me.service;

import edu.ijse.absd.wear_me.model.MainCategoryModel;

/**
 *
 * @author Chathura Buddhika <cbuddhika3@gmail.com>
 */
public interface MainCategoryService {

    public boolean addMainCategory(MainCategoryModel mcm);

    public String viewMainCategory();

    public boolean updateMainCategory(String oldValue, String newValue);

    public boolean deleteMainCategory(String value);
}
