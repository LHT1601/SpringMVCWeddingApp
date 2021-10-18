/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lht.pojos;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author LHT
 */
@Entity
@Table(name="menu_dishesanddrink")
public class MenuDishesAndDrinks implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String num;
    @Column(name = "unit_price")
    private BigDecimal unitPrice;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_menu")
    private Menu menuId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_dishesanddrink")
    private DishesAndDrinks dishesAndDrinksId;

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
     * @return the num
     */
    public String getNum() {
        return num;
    }

    /**
     * @param num the num to set
     */
    public void setNum(String num) {
        this.num = num;
    }

    /**
     * @return the unitPrice
     */
    public BigDecimal getUnitPrice() {
        return unitPrice;
    }

    /**
     * @param unitPrice the unitPrice to set
     */
    public void setUnitPrice(BigDecimal unitPrice) {
        this.unitPrice = unitPrice;
    }

    /**
     * @return the menuId
     */
    public Menu getMenuId() {
        return menuId;
    }

    /**
     * @param menuId the menuId to set
     */
    public void setMenuId(Menu menuId) {
        this.menuId = menuId;
    }

    /**
     * @return the dishesAndDrinksId
     */
    public DishesAndDrinks getDishesAndDrinksId() {
        return dishesAndDrinksId;
    }

    /**
     * @param dishesAndDrinksId the dishesAndDrinksId to set
     */
    public void setDishesAndDrinksId(DishesAndDrinks dishesAndDrinksId) {
        this.dishesAndDrinksId = dishesAndDrinksId;
    }

    
   
    
}
