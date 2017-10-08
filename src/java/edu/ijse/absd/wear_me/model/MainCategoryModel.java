/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.absd.wear_me.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

/**
 *
 * @author Chathura Buddhika <cbuddhika3@gmail.com>
 */
@Entity
public class MainCategoryModel extends SuperModel implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer mcm_id;

    @ManyToMany
    @JoinTable(name = "GarmentDetailModel", joinColumns = {
        @JoinColumn(name = "mcms_id", nullable = false, updatable = false)}, inverseJoinColumns = {
        @JoinColumn(name = "garment_id", nullable = false, updatable = false)})
    private List<GarmentModel> garmentModels = new ArrayList<GarmentModel>();

    private String mcm_name;

    public Integer getMcm_id() {
        return mcm_id;
    }

    public void setMcm_id(Integer mcm_id) {
        this.mcm_id = mcm_id;
    }

    public List<GarmentModel> getGarmentModels() {
        return garmentModels;
    }

    public void setGarmentModels(List<GarmentModel> garmentModels) {
        this.garmentModels = garmentModels;
    }

    public String getMcm_name() {
        return mcm_name;
    }

    public void setMcm_name(String mcm_name) {
        this.mcm_name = mcm_name;
    }
}
