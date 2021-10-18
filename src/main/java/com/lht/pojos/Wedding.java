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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;

/**
 *
 * @author LHT
 */
@Entity
@Table(name="wedding")
public class Wedding implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    @Column(name="number_desk")
    private int numberDesk;
    @Column(name="organize_date")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date organizeDate;
    @Column(name="total_price")
    private BigDecimal totalPrice;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "menu")
    private Menu menu;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "wedding_hall")
    private WeddingHall weddingHall;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User users;
    
    @OneToMany(mappedBy = "weddings", fetch = FetchType.EAGER)
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
     * @return the numberDesk
     */
    public int getNumberDesk() {
        return numberDesk;
    }

    /**
     * @param numberDesk the numberDesk to set
     */
    public void setNumberDesk(int numberDesk) {
        this.numberDesk = numberDesk;
    }

    /**
     * @return the organizeDate
     */
    public Date getOrganizeDate() {
        return organizeDate;
    }

    /**
     * @param organizeDate the organizeDate to set
     */
    public void setOrganizeDate(Date organizeDate) {
        this.organizeDate = organizeDate;
    }

    /**
     * @return the totalPrice
     */
    public BigDecimal getTotalPrice() {
        return totalPrice;
    }

    /**
     * @param totalPrice the totalPrice to set
     */
    public void setTotalPrice(BigDecimal totalPrice) {
        this.totalPrice = totalPrice;
    }

    /**
     * @return the menu
     */
    public Menu getMenu() {
        return menu;
    }

    /**
     * @param menu the menu to set
     */
    public void setMenu(Menu menu) {
        this.menu = menu;
    }

    /**
     * @return the weddingHall
     */
    public WeddingHall getWeddingHall() {
        return weddingHall;
    }

    /**
     * @param weddingHall the weddingHall to set
     */
    public void setWeddingHall(WeddingHall weddingHall) {
        this.weddingHall = weddingHall;
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

    /**
     * @return the users
     */
    public User getUsers() {
        return users;
    }

    /**
     * @param users the users to set
     */
    public void setUsers(User users) {
        this.users = users;
    }
    
    
}
