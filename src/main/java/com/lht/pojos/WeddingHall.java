/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lht.pojos;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;
import org.springframework.web.multipart.MultipartFile;

/**
 *
 * @author LHT
 */
@Entity
@Table(name="weddinghall")
public class WeddingHall implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  int id;
    @Size(min = 5, max = 100, message = "{weddinghall.name.lenErr}")
    private String name;
    @Column(name = "time_wedding")
    private String timeWedding;
    @Column(name = "wedding_hall_images")
    private String weddingHallImages;
    private String location;
    private String capacity;
    @Column(name = "date_time_rent")
    private String dateTimeRent;
    @Min(value = 1000000, message = "{weddinghall.weddingHallPrice.minErr}")
    @Max(value = 15000000, message = "{weddinghall.weddingHallPrice.maxErr}")
    @Column(name = "wedding_hall_price")
    private BigDecimal weddingHallPrice;
    private String description;
    private boolean active;
    
    @OneToMany(mappedBy = "weddingHall", fetch = FetchType.EAGER)
    private List<Wedding> weddings;
    
    @Transient
    private MultipartFile file;
    
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
        this.setName(name);
    }

    /**
     * @return the timeWedding
     */
    public String getTimeWedding() {
        return timeWedding;
    }

    /**
     * @param timeWedding the timeWedding to set
     */
    public void setTimeWedding(String timeWedding) {
        this.timeWedding = timeWedding;
    }

    /**
     * @return the location
     */
    public String getLocation() {
        return location;
    }

    /**
     * @param location the location to set
     */
    public void setLocation(String location) {
        this.location = location;
    }

    /**
     * @return the capacity
     */
    public String getCapacity() {
        return capacity;
    }

    /**
     * @param capacity the capacity to set
     */
    public void setCapacity(String capacity) {
        this.capacity = capacity;
    }

    /**
     * @return the dateTimeRent
     */
    public String getDateTimeRent() {
        return dateTimeRent;
    }

    /**
     * @param dateTimeRent the dateTimeRent to set
     */
    public void setDateTimeRent(String dateTimeRent) {
        this.dateTimeRent = dateTimeRent;
    }

    /**
     * @return the weddingHallPrice
     */
    public BigDecimal getWeddingHallPrice() {
        return weddingHallPrice;
    }

    /**
     * @param weddingHallPrice the weddingHallPrice to set
     */
    public void setWeddingHallPrice(BigDecimal weddingHallPrice) {
        this.setWeddingHallPrice(weddingHallPrice);
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return the active
     */
    public boolean isActive() {
        return active;
    }

    /**
     * @param active the active to set
     */
    public void setActive(boolean active) {
        this.active = active;
    }

    /**
     * @return the weddings
     */
    public List<Wedding> getWeddings() {
        return weddings;
    }

    /**
     * @param weddings the weddings to set
     */
    public void setWeddings(List<Wedding> weddings) {
        this.weddings = weddings;
    }

    /**
     * @return the file
     */
    public MultipartFile getFile() {
        return file;
    }

    /**
     * @param file the file to set
     */
    public void setFile(MultipartFile file) {
        this.file = file;
    }

    /**
     * @return the weddingHallImages
     */
    public String getWeddingHallImages() {
        return weddingHallImages;
    }

    /**
     * @param weddingHallImages the weddingHallImages to set
     */
    public void setWeddingHallImages(String weddingHallImages) {
        this.weddingHallImages = weddingHallImages;
    }
    
}
