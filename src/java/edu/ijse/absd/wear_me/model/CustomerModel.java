/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.absd.wear_me.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 *
 * @author Chathura Buddhika <cbuddhika3@gmail.com>
 */
@Entity
public class CustomerModel extends SuperModel implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer customer_id;

    @OneToMany(targetEntity = OrderModel.class, cascade = CascadeType.ALL, mappedBy = "customerModel", fetch = FetchType.LAZY)
    private List<OrderModel> orderModels = new ArrayList<OrderModel>();

    private String first_name;
    private String last_name;
    private String user_name;
    private String dob;
    private String password;
    private String street_address1;
    private String street_address2;
    private String city;
    private String tel_no1;
    private String tel_no2;
    private String email;
    private boolean isActive;

    public CustomerModel() {
    }

    public CustomerModel(List<OrderModel> orderModels, String first_name, String last_name, String user_name, String dob, String password, String street_address1, String street_address2, String city, String tel_no1, String tel_no2, String email, boolean isActive) {
        this.orderModels = orderModels;
        this.first_name = first_name;
        this.last_name = last_name;
        this.user_name = user_name;
        this.dob = dob;
        this.password = password;
        this.street_address1 = street_address1;
        this.street_address2 = street_address2;
        this.city = city;
        this.tel_no1 = tel_no1;
        this.tel_no2 = tel_no2;
        this.email = email;
        this.isActive = isActive;
    }

    public CustomerModel(Integer customer_id, List<OrderModel> orderModels, String first_name, String last_name, String user_name, String dob, String password, String street_address1, String street_address2, String city, String tel_no1, String tel_no2, String email, boolean isActive) {
        this.customer_id = customer_id;
        this.orderModels = orderModels;
        this.first_name = first_name;
        this.last_name = last_name;
        this.user_name = user_name;
        this.dob = dob;
        this.password = password;
        this.street_address1 = street_address1;
        this.street_address2 = street_address2;
        this.city = city;
        this.tel_no1 = tel_no1;
        this.tel_no2 = tel_no2;
        this.email = email;
        this.isActive = isActive;
    }

    public Integer getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(Integer customer_id) {
        this.customer_id = customer_id;
    }

    public List<OrderModel> getOrderModels() {
        return orderModels;
    }

    public void setOrderModels(List<OrderModel> orderModels) {
        this.orderModels = orderModels;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getStreet_address1() {
        return street_address1;
    }

    public void setStreet_address1(String street_address1) {
        this.street_address1 = street_address1;
    }

    public String getStreet_address2() {
        return street_address2;
    }

    public void setStreet_address2(String street_address2) {
        this.street_address2 = street_address2;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getTel_no1() {
        return tel_no1;
    }

    public void setTel_no1(String tel_no1) {
        this.tel_no1 = tel_no1;
    }

    public String getTel_no2() {
        return tel_no2;
    }

    public void setTel_no2(String tel_no2) {
        this.tel_no2 = tel_no2;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isIsActive() {
        return isActive;
    }

    public void setIsActive(boolean isActive) {
        this.isActive = isActive;
    }


}
