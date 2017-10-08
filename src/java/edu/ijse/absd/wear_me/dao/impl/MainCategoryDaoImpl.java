/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.absd.wear_me.dao.impl;

import edu.ijse.absd.wear_me.dao.MainCategoryDao;
import edu.ijse.absd.wear_me.model.MainCategoryModel;
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
public class MainCategoryDaoImpl implements MainCategoryDao {

    @Autowired
    private SessionFactory factory;

    public Serializable add(MainCategoryModel model) {
        return factory.getCurrentSession().save(model);
    }

    public boolean delete(String value) {
        Query createQuery = factory.getCurrentSession().createQuery("delete from MainCategoryModel where mcm_name=:x");
        createQuery.setParameter("x", value);
        return createQuery.executeUpdate() > 0;
    }

    public MainCategoryModel search(String value) {
        Query createQuery = factory.getCurrentSession().createQuery("from MainCategoryModel where mcm_name=:x");
        createQuery.setParameter("x", value);
        return (MainCategoryModel) createQuery.uniqueResult();
    }

    public boolean update(MainCategoryModel model) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public List<MainCategoryModel> viewAll() {
        Query createQuery = factory.getCurrentSession().createQuery("from MainCategoryModel");
        ArrayList<MainCategoryModel> list = (ArrayList<MainCategoryModel>) createQuery.list();
        return list;
    }

    public boolean update(String oldValue, String newValue) {
        Query createQuery = factory.getCurrentSession().createQuery("update MainCategoryModel set mcm_name=:n where mcm_name=:o");
        createQuery.setParameter("o", oldValue);
        createQuery.setParameter("n", newValue);
        return 0 < createQuery.executeUpdate();
    }

}
