/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.absd.wear_me.dao.impl;

import edu.ijse.absd.wear_me.dao.SubCategoryDao;
import edu.ijse.absd.wear_me.model.SubCategoryModel;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Chathura Buddhika <cbuddhika3@gmail.com>
 */
@Repository
public class SubCategoryDaoImpl implements SubCategoryDao {

    @Autowired
    private SessionFactory factory;

    public Serializable add(SubCategoryModel model) {
        return factory.getCurrentSession().save(model);
    }

    public boolean delete(String value) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public SubCategoryModel search(String value) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public boolean update(SubCategoryModel model) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public List<SubCategoryModel> viewAll() {
        Query createQuery = factory.getCurrentSession().createQuery("from SubCategoryModel");
        ArrayList<SubCategoryModel> list = (ArrayList<SubCategoryModel>) createQuery.list();
        return list;
    }

}
