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

/**
 *
 * @author LHT
 */
@Entity
@Table(name="menu")
public class Menu implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    @Column(name="total_money")
    private BigDecimal totalMoney;
    @Column(name="menu_image")
    private String menuImage;
    
    @OneToMany(mappedBy = "menu", fetch = FetchType.EAGER)
    private List<Wedding> weddings;
    
//    @OneToMany(mappedBy = "menuId", fetch = FetchType.EAGER)
//    private List<MenuDishesAndDrinks> menuDishesAndDrinnks;

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
     * @return the totalMoney
     */
    public BigDecimal getTotalMoney() {
        return totalMoney;
    }

    /**
     * @param totalMoney the totalMoney to set
     */
    public void setTotalMoney(BigDecimal totalMoney) {
        this.totalMoney = totalMoney;
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
     * @return the menuImage
     */
    public String getMenuImage() {
        return menuImage;
    }

    /**
     * @param menuImage the menuImage to set
     */
    public void setMenuImage(String menuImage) {
        this.menuImage = menuImage;
    }

    /**
     * @return the menuDishesAndDrinnks
     */
//    public List<MenuDishesAndDrinks> getMenuDishesAndDrinnks() {
//        return menuDishesAndDrinnks;
//    }
//
//    /**
//     * @param menuDishesAndDrinnks the menuDishesAndDrinnks to set
//     */
//    public void setMenuDishesAndDrinnks(List<MenuDishesAndDrinks> menuDishesAndDrinnks) {
//        this.menuDishesAndDrinnks = menuDishesAndDrinnks;
//    }
}
