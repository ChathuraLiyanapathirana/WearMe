/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.absd.wear_me.dao.impl;

import edu.ijse.absd.wear_me.dao.CustomerDao;
import edu.ijse.absd.wear_me.model.CustomerModel;
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
public class CustomerDaoImpl implements CustomerDao {

    @Autowired
    private SessionFactory factory;

    public Serializable add(CustomerModel model) {
        return factory.getCurrentSession().save(model);
    }

    public CustomerModel search(String value) {
        Query createQuery = factory.getCurrentSession().createQuery("from CustomerModel where user_name=:n");
        createQuery.setParameter("n", value);
        CustomerModel model = (CustomerModel) createQuery.uniqueResult();
        return model;
    }

    public boolean update(CustomerModel model) {
        factory.getCurrentSession().update(model);
        return true;
    }

    public List<CustomerModel> viewAll() {
        Query createQuery = factory.getCurrentSession().createQuery("from CustomerModel");
        ArrayList<CustomerModel> list = (ArrayList<CustomerModel>) createQuery.list();
        return list;
    }

    public boolean delete(String value) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
