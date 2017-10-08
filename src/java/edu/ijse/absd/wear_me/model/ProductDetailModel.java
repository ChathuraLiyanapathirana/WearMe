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
import javax.persistence.ManyToOne;

/**
 *
 * @author Chathura Buddhika <cbuddhika3@gmail.com>
 */
@Entity
public class ProductDetailModel extends SuperModel implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer pdm_id;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private ProductModel productModel;
    
    private String pdm_header;
    private String pdm_description;

    public Integer getPdm_id() {
        return pdm_id;
    }

    public void setPdm_id(Integer pdm_id) {
        this.pdm_id = pdm_id;
    }

    public ProductModel getProductModel() {
        return productModel;
    }

    public void setProductModel(ProductModel productModel) {
        this.productModel = productModel;
    }

    public String getPdm_header() {
        return pdm_header;
    }

    public void setPdm_header(String pdm_header) {
        this.pdm_header = pdm_header;
    }

    public String getPdm_description() {
        return pdm_description;
    }

    public void setPdm_description(String pdm_description) {
        this.pdm_description = pdm_description;
    }
    
    

}
