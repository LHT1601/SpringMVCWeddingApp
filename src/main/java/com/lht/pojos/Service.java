/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lht.pojos;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;

/**
 *
 * @author LHT
 */
@Entity
@Table(name="service")
public class Service implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    @Column(name="sevice_images")
    private String serviceImages;
    private BigDecimal price;
    @Column(name="time_rent")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date timeRent;
    private boolean active;
    
    @OneToMany(mappedBy = "sevices", fetch = FetchType.EAGER)
    private List<WeddingService> weddingServices;

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the serviceImages
     */
    public String getServiceImages() {
        return serviceImages;
    }

    /**
     * @param serviceImages the serviceImages to set
     */
    public void setServiceImages(String serviceImages) {
        this.serviceImages = serviceImages;
    }

    /**
     * @return the price
     */
    public BigDecimal getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    /**
     * @return the timeRent
     */
    public Date getTimeRent() {
        return timeRent;
    }

    /**
     * @param timeRent the timeRent to set
     */
    public void setTimeRent(Date timeRent) {
        this.timeRent = timeRent;
    }

    /**
     * @return the active
     */
    public boolean getActive() {
        return active;
    }

    /**
     * @param active the active to set
     */
    public void setActive(boolean active) {
        this.active = active;
    }

    /**
     * @return the weddingServices
     */
    public List<WeddingService> getWeddingServices() {
        return weddingServices;
    }

    /**
     * @param weddingServices the weddingServices to set
     */
    public void setWeddingServices(List<WeddingService> weddingServices) {
        this.weddingServices = weddingServices;
    }
    
}
