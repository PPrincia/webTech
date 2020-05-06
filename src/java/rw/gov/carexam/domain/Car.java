/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rw.gov.carexam.domain;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Princia Pascale
 */

@Entity
public class Car {
    
    @Id
    private String plateNo;
    private String model;
    private String institution;
    private Integer manufacturingYear;
    @Temporal(TemporalType.DATE)
    private Date entranceDate;
    private Long purchasingCost;

    public String getPlateNo() {
        return plateNo;
    }

    public void setPlateNo(String plateNo) {
        this.plateNo = plateNo;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getInstitution() {
        return institution;
    }

    public void setInstitution(String institution) {
        this.institution = institution;
    }

    public Integer getManufacturingYear() {
        return manufacturingYear;
    }

    public void setManufacturingYear(Integer manufacturingYear) {
        this.manufacturingYear = manufacturingYear;
    }

    public Date getEntranceDate() {
        return entranceDate;
    }

    public void setEntranceDate(Date entranceDate) {
        this.entranceDate = entranceDate;
    }

    public Long getPurchasingCost() {
        return purchasingCost;
    }

    public void setPurchasingCost(Long purchasingCost) {
        this.purchasingCost = purchasingCost;
    }
    
    
}
