/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.absd.wear_me.service;

import edu.ijse.absd.wear_me.model.SubCategoryModel;

/**
 *
 * @author Chathura Buddhika <cbuddhika3@gmail.com>
 */
public interface SubCategoryService {

    public boolean addSubCategory(SubCategoryModel model);
    
    public String viewSubCategory();
}
