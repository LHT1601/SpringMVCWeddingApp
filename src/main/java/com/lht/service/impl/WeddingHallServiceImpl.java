/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lht.service.impl;

import com.cloudinary.Cloudinary;
import com.cloudinary.utils.ObjectUtils;
import com.lht.pojos.WeddingHall;
import com.lht.repository.WeddingHallRepository;
import com.lht.service.WeddingHallService;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author LHT
 */
@Service
public class WeddingHallServiceImpl implements WeddingHallService {
    @Autowired
    private WeddingHallRepository weddingHallRepository;
    @Autowired
    private Cloudinary cloudinary;

    @Override
    public List<WeddingHall> getWeddingHalls(String kw) {
        return this.weddingHallRepository.getWeddingHalls(kw);
    }

    @Override
    public boolean addOrUpdate(WeddingHall weddinghall) {
        try {
            Map r = this.cloudinary.uploader().upload(weddinghall.getFile().getBytes(),
                    ObjectUtils.asMap("resource_type", "auto"));
            
            weddinghall.setWeddingHallImages((String) r.get("secure_url"));
            
            return this.weddingHallRepository.addOrUpdate(weddinghall);
        } catch (IOException ex) {
            System.err.println("== ADD WEDDINGHALL ==" + ex.getMessage());
        }
        return false;
    }
}
