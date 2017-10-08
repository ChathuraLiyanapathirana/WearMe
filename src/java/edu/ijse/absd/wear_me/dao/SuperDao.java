/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.absd.wear_me.dao;

import edu.ijse.absd.wear_me.model.SuperModel;
import java.io.Serializable;
import java.util.List;

/**
 *
 * @author Chathura Buddhika <cbuddhika3@gmail.com>
 */
public interface SuperDao<T extends SuperModel> {

    public Serializable add(T model);

    public boolean delete(String value);

    public T search(String value);

    public boolean update(T model);

    public List<T> viewAll();

}
