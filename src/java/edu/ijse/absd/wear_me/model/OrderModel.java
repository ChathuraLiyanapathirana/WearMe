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
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

/**
 *
 * @author Chathura Buddhika <cbuddhika3@gmail.com>
 */
@Entity
public class OrderModel extends SuperModel implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer order_id;

    @OneToOne(mappedBy = "orderModel", cascade = CascadeType.ALL)
    private PaymentModel paymentModel;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private CustomerModel customerModel;

    @OneToMany(targetEntity = OrderDetailModel.class, cascade = CascadeType.ALL, mappedBy = "orderModel")
    private List<OrderDetailModel> orderDetailModels = new ArrayList<OrderDetailModel>();

    private String order_date;
    private Double full_amount;

    public Integer getOrder_id() {
        return order_id;
    }

    public void setOrder_id(Integer order_id) {
        this.order_id = order_id;
    }

    public PaymentModel getPaymentModel() {
        return paymentModel;
    }

    public void setPaymentModel(PaymentModel paymentModel) {
        this.paymentModel = paymentModel;
    }

    public CustomerModel getCustomerModel() {
        return customerModel;
    }

    public void setCustomerModel(CustomerModel customerModel) {
        this.customerModel = customerModel;
    }

    public List<OrderDetailModel> getOrderDetailModels() {
        return orderDetailModels;
    }

    public void setOrderDetailModels(List<OrderDetailModel> orderDetailModels) {
        this.orderDetailModels = orderDetailModels;
    }

    public String getOrder_date() {
        return order_date;
    }

    public void setOrder_date(String order_date) {
        this.order_date = order_date;
    }

    public Double getFull_amount() {
        return full_amount;
    }

    public void setFull_amount(Double full_amount) {
        this.full_amount = full_amount;
    }
    
    

}
