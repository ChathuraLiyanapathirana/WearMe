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
public class BrandModel extends SuperModel implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer brand_id;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "brandModel", targetEntity = ProductModel.class, fetch = FetchType.LAZY)
    private List<ProductModel> productModels = new ArrayList<ProductModel>();

    private String brand_name;
    private String img_path;

    public BrandModel() {
    }

    public BrandModel(List<ProductModel> productModels, String brand_name, String img_path) {
        this.productModels = productModels;
        this.brand_name = brand_name;
        this.img_path = img_path;
    }

    public BrandModel(Integer brand_id, List<ProductModel> productModels, String brand_name, String img_path) {
        this.brand_id = brand_id;
        this.productModels = productModels;
        this.brand_name = brand_name;
        this.img_path = img_path;
    }

    public Integer getBrand_id() {
        return brand_id;
    }

    public void setBrand_id(Integer brand_id) {
        this.brand_id = brand_id;
    }

    public List<ProductModel> getProductModels() {
        return productModels;
    }

    public void setProductModels(List<ProductModel> productModels) {
        this.productModels = productModels;
    }

    public String getBrand_name() {
        return brand_name;
    }

    public void setBrand_name(String brand_name) {
        this.brand_name = brand_name;
    }

    public String getImg_path() {
        return img_path;
    }

    public void setImg_path(String img_path) {
        this.img_path = img_path;
    }

}
