/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lht.repository;

import com.lht.pojos.WeddingHall;
import java.util.List;



/**
 *
 * @author LHT
 */
public interface WeddingHallRepository {
    List<WeddingHall> getWeddingHalls (String kw);
    boolean addOrUpdate(WeddingHall weddinghall);
}
