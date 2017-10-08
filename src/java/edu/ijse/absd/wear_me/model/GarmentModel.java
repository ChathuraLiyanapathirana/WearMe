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
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 *
 * @author Chathura Buddhika <cbuddhika3@gmail.com>
 */
@Entity
public class GarmentModel extends SuperModel implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer garment_id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "scm_id")
    private SubCategoryModel scm;

    @ManyToMany
    @JoinTable(name = "GarmentDetailModel", joinColumns = {
        @JoinColumn(name = "garment_id", nullable = false, updatable = false)}, inverseJoinColumns = {
        @JoinColumn(name = "mcms_id", nullable = false, updatable = false)})
    private List<MainCategoryModel> mcms = new ArrayList<MainCategoryModel>();

    @OneToMany(targetEntity = ProductModel.class, cascade = CascadeType.ALL, mappedBy = "garmentModel")
    private List<ProductModel> productModels = new ArrayList<ProductModel>();

    public Integer getGarment_id() {
        return garment_id;
    }

    public void setGarment_id(Integer garment_id) {
        this.garment_id = garment_id;
    }

    public SubCategoryModel getScm() {
        return scm;
    }

    public void setScm(SubCategoryModel scm) {
        this.scm = scm;
    }

    public List<MainCategoryModel> getMcm() {
        return mcms;
    }

    public void setMcm(List<MainCategoryModel> mcms) {
        this.mcms = mcms;
    }

    public List<ProductModel> getProductModel() {
        return productModels;
    }

    public void setProductModel(List<ProductModel> productModels) {
        this.productModels = productModels;
    }

}
