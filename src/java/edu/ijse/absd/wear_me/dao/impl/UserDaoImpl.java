/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.absd.wear_me.dao.impl;

import edu.ijse.absd.wear_me.dao.UserDao;
import edu.ijse.absd.wear_me.model.UserModel;
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
public class UserDaoImpl implements UserDao {

    @Autowired
    private SessionFactory factory;

    public UserModel search(UserModel model) {
        Query createQuery = factory.getCurrentSession().createQuery("from UserModel where role=:x and name=:y");
        createQuery.setParameter("x", model.getRole());
        createQuery.setParameter("y", model.getName());
        UserModel um = (UserModel) createQuery.uniqueResult();
        return um;
    }

    public Serializable add(UserModel model) {
        return factory.getCurrentSession().save(model);
    }

    public UserModel search(String value) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public boolean update(UserModel model) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public List<UserModel> viewAll() {
        Query createQuery = factory.getCurrentSession().createQuery("from UserModel");
        ArrayList<UserModel> list = (ArrayList<UserModel>) createQuery.list();
        return list;
    }

    public boolean delete(String value) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
