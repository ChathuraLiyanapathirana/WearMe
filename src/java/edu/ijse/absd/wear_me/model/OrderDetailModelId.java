/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.absd.wear_me.model;

import java.io.Serializable;
import javax.persistence.Embeddable;

/**
 *
 * @author Chathura Buddhika <cbuddhika3@gmail.com>
 */
@Embeddable
public class OrderDetailModelId implements Serializable {

    private Integer order_id;
    private Integer product_id;

    public OrderDetailModelId() {
    }

    public OrderDetailModelId(Integer order_id, Integer product_id) {
        this.order_id = order_id;
        this.product_id = product_id;
    }

    public Integer getOrder_id() {
        return order_id;
    }

    public void setOrder_id(Integer order_id) {
        this.order_id = order_id;
    }

    public Integer getProduct_id() {
        return product_id;
    }

    public void setProduct_id(Integer product_id) {
        this.product_id = product_id;
    }
}
