/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.absd.wear_me.dao;

import edu.ijse.absd.wear_me.model.MainCategoryModel;

/**
 *
 * @author Chathura Buddhika <cbuddhika3@gmail.com>
 */
public interface MainCategoryDao extends SuperDao<MainCategoryModel> {

    public boolean update(String oldValue, String newValue);
}
