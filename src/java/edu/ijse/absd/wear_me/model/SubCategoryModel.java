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
import javax.persistence.OneToMany;

/**
 *
 * @author Chathura Buddhika <cbuddhika3@gmail.com>
 */
@Entity
public class SubCategoryModel extends SuperModel implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer scm_id;

    @OneToMany(targetEntity = GarmentModel.class, cascade = CascadeType.ALL, mappedBy = "scm")
    private List<GarmentModel> garmentModel = new ArrayList<GarmentModel>();

    private String scm_name;
    private String mcm_name;

    public Integer getScm_id() {
        return scm_id;
    }

    public void setScm_id(Integer scm_id) {
        this.scm_id = scm_id;
    }

    public List<GarmentModel> getGarmentModel() {
        return garmentModel;
    }

    public void setGarmentModel(List<GarmentModel> garmentModel) {
        this.garmentModel = garmentModel;
    }

    public String getScm_name() {
        return scm_name;
    }

    public void setScm_name(String scm_name) {
        this.scm_name = scm_name;
    }

    public String getMcm_name() {
        return mcm_name;
    }

    public void setMcm_name(String mcm_name) {
        this.mcm_name = mcm_name;
    }

}
