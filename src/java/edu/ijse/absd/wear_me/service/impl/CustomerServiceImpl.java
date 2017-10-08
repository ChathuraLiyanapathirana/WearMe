/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.absd.wear_me.service.impl;

import edu.ijse.absd.wear_me.dao.CustomerDao;
import edu.ijse.absd.wear_me.model.CustomerModel;
import edu.ijse.absd.wear_me.service.CustomerService;
import java.io.Serializable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Chathura Buddhika <cbuddhika3@gmail.com>
 */
@Transactional
@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerDao customerDao;

    public String registerCustomer(CustomerModel model) {
        Serializable add = customerDao.add(model);
        if (null != add) {
            return "ok";
        }
        return "error";
    }

}
