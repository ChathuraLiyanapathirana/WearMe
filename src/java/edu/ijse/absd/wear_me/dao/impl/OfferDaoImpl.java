/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.absd.wear_me.dao.impl;

import edu.ijse.absd.wear_me.dao.OfferDao;
import edu.ijse.absd.wear_me.model.OfferModel;
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
public class OfferDaoImpl implements OfferDao {

    @Autowired
    private SessionFactory factory;

    public Serializable add(OfferModel model) {
        return factory.getCurrentSession().save(model);
    }

    public boolean delete(String value) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public OfferModel search(String value) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public boolean update(OfferModel model) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public List<OfferModel> viewAll() {
        Query createQuery = factory.getCurrentSession().createQuery("from OfferModel");
        ArrayList<OfferModel> list = (ArrayList<OfferModel>) createQuery.list();
        return list;
    }

}
