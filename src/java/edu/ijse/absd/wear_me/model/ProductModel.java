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
public class ProductModel extends SuperModel implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer product_id;

    @ManyToOne
    @JoinColumn(name = "brand_id")
    private BrandModel brandModel;

    @OneToMany(targetEntity = ProductDetailModel.class, cascade = CascadeType.ALL, mappedBy = "productModel")
    private List<ProductDetailModel> productDetailModels = new ArrayList<ProductDetailModel>();

    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinTable(name = "OfferDetail", joinColumns = {
        @JoinColumn(name = "product_id", nullable = false, updatable = false)}, inverseJoinColumns = {
        @JoinColumn(name = "offer_id", nullable = false, updatable = false)})
    private List<OfferModel> offerModels = new ArrayList<OfferModel>();

    @OneToMany(targetEntity = OrderDetailModel.class, cascade = CascadeType.ALL, mappedBy = "productModel")
    private List<OrderDetailModel> orderDetailModels = new ArrayList<OrderDetailModel>();

    @ManyToOne
    @JoinColumn(name = "garment_id")
    private GarmentModel garmentModel;

    private String product_code;
    private String product_name;
    private Double unit_price;

    public Integer getProduct_id() {
        return product_id;
    }

    public void setProduct_id(Integer product_id) {
        this.product_id = product_id;
    }

    public BrandModel getBrandModel() {
        return brandModel;
    }

    public void setBrandModel(BrandModel brandModel) {
        this.brandModel = brandModel;
    }

    public List<ProductDetailModel> getProductDetailModels() {
        return productDetailModels;
    }

    public void setProductDetailModels(List<ProductDetailModel> productDetailModels) {
        this.productDetailModels = productDetailModels;
    }

    public List<OfferModel> getOfferModels() {
        return offerModels;
    }

    public void setOfferModels(List<OfferModel> offerModels) {
        this.offerModels = offerModels;
    }

    public List<OrderDetailModel> getOrderDetailModels() {
        return orderDetailModels;
    }

    public void setOrderDetailModels(List<OrderDetailModel> orderDetailModels) {
        this.orderDetailModels = orderDetailModels;
    }

    public GarmentModel getGarmentModel() {
        return garmentModel;
    }

    public void setGarmentModel(GarmentModel garmentModel) {
        this.garmentModel = garmentModel;
    }

    public String getProduct_code() {
        return product_code;
    }

    public void setProduct_code(String product_code) {
        this.product_code = product_code;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public Double getUnit_price() {
        return unit_price;
    }

    public void setUnit_price(Double unit_price) {
        this.unit_price = unit_price;
    }

}
