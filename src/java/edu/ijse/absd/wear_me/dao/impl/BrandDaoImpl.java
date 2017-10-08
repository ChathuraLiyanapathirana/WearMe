/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.absd.wear_me.dao.impl;

import edu.ijse.absd.wear_me.dao.BrandDao;
import edu.ijse.absd.wear_me.model.BrandModel;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 *
 * @author Chathura Buddhika <cbuddhika3@gmail.com>
 */
@Controller
public class BrandDaoImpl implements BrandDao {

    @Autowired
    private SessionFactory factory;

    public Serializable add(BrandModel model) {
        return factory.getCurrentSession().save(model);
    }

    public boolean delete(String value) {
        Query createQuery = factory.getCurrentSession().createQuery("delete from BrandModel where brand_name=:x");
        createQuery.setParameter("x", value);
        return createQuery.executeUpdate() > 0;
    }

    public BrandModel search(String value) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public boolean update(BrandModel model) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public List<BrandModel> viewAll() {
        Query createQuery = factory.getCurrentSession().createQuery("from BrandModel");
        ArrayList<BrandModel> list = (ArrayList<BrandModel>) createQuery.list();
        return list;
    }

    public boolean update(String oldValue, String newValue) {
        Query createQuery = factory.getCurrentSession().createQuery("update BrandModel set brand_name=:n where brand_name=:o");
        createQuery.setParameter("o", oldValue);
        createQuery.setParameter("n", newValue);
        return 0 < createQuery.executeUpdate();
    }
}
