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
@Table(name="dishesanddrink")
public class DishesAndDrinks implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    @Column(name="dishes_drink_images")
    private String DishesDrinksImages;
    private BigDecimal price;
    private boolean active;
    
    @OneToMany(mappedBy = "dishesAndDrinksId", fetch = FetchType.EAGER)
    private List<MenuDishesAndDrinks> menuDishesAndDrinks;

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
     * @return the DishesDrinksImages
     */
    public String getDishesDrinksImages() {
        return DishesDrinksImages;
    }

    /**
     * @param DishesDrinksImages the DishesDrinksImages to set
     */
    public void setDishesDrinksImages(String DishesDrinksImages) {
        this.DishesDrinksImages = DishesDrinksImages;
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
     * @return the active
     */
    public boolean getActive() {
        return isActive();
    }

    /**
     * @param active the active to set
     */
    public void setActive(boolean active) {
        this.active = active;
    }

    /**
     * @return the active
     */
    public boolean isActive() {
        return active;
    }

    /**
     * @return the menuDishesAndDrinks
     */
    public List<MenuDishesAndDrinks> getMenuDishesAndDrinks() {
        return menuDishesAndDrinks;
    }

    /**
     * @param menuDishesAndDrinks the menuDishesAndDrinks to set
     */
    public void setMenuDishesAndDrinks(List<MenuDishesAndDrinks> menuDishesAndDrinks) {
        this.menuDishesAndDrinks = menuDishesAndDrinks;
    }

}
