/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.absd.wear_me.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

/**
 *
 * @author Chathura Buddhika <cbuddhika3@gmail.com>
 */
@Entity
public class PaymentModel extends SuperModel implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer payment_id;

    @OneToOne
    @JoinColumn(name = "order_id")
    private OrderModel orderModel;

    private double pay_amount;

    public PaymentModel() {
    }

    public PaymentModel(OrderModel orderModel, double pay_amount) {
        this.orderModel = orderModel;
        this.pay_amount = pay_amount;
    }

    public PaymentModel(Integer payment_id, OrderModel orderModel, double pay_amount) {
        this.payment_id = payment_id;
        this.orderModel = orderModel;
        this.pay_amount = pay_amount;
    }

    public Integer getPayment_id() {
        return payment_id;
    }

    public void setPayment_id(Integer payment_id) {
        this.payment_id = payment_id;
    }

    public OrderModel getOrderModel() {
        return orderModel;
    }

    public void setOrderModel(OrderModel orderModel) {
        this.orderModel = orderModel;
    }

    public double getPay_amount() {
        return pay_amount;
    }

    public void setPay_amount(double pay_amount) {
        this.pay_amount = pay_amount;
    }

}
