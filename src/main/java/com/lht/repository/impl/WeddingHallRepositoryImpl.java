/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lht.repository.impl;

import com.lht.pojos.WeddingHall;
import com.lht.repository.WeddingHallRepository;
import java.util.List;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author LHT
 */
@Repository
@Transactional
public class WeddingHallRepositoryImpl implements WeddingHallRepository{
    @Autowired
    private LocalSessionFactoryBean sessionFactory;
    
    @Override
    public List<WeddingHall> getWeddingHalls(String kw) {
        Session session = this.sessionFactory.getObject().getCurrentSession();
        CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery<WeddingHall> query = builder.createQuery(WeddingHall.class);
        Root root = query.from(WeddingHall.class);
        query = query.select(root);
        
        if (!kw.isEmpty() && kw != null) {
            Predicate p = builder.like(root.get("name").as(String.class), String.format("%%%s%%", kw));
            query = query.where(p);
        }
        
        Query q = session.createQuery(query);
        return q.getResultList();
//        Session s = sessionFactory.getObject().getCurrentSession();
//        Query q = s.createQuery("From WeddingHall");
//        return q.getResultList();
    }

    @Override
    public boolean addOrUpdate(WeddingHall weddinghall) {
        Session session = this.sessionFactory.getObject().getCurrentSession();
        try {
            session.save(weddinghall);

            return true;
        } catch (Exception ex){
            System.err.println("==ADD WEDDING HALL ERROR ==" + ex.getMessage());
            ex.printStackTrace();
        }
        return false;
    }
    
}
