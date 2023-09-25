/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.amovil.dao;

import com.amovil.jpa.user;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author herso
 */
@Repository
public class loginDAOImp implements loginDAO {

    @Autowired
    coneccionDAOImp connection;
    
    @Override
    public List<user> getListUser() {
        System.out.println("Entra a loginList");
        Session session = connection.getSessionFactory().openSession();
        CriteriaBuilder cb = session.getCriteriaBuilder();
        CriteriaQuery criteria = cb.createQuery( user.class );
        Root<user> root = criteria.from(user.class);
        criteria.select(root);
        Query query = session.createQuery(criteria);
        List list = query.getResultList();
        
        System.out.println("afther opensession");
        for(int i=0; i<list.size(); i++){
            user myUser = (user) list.get(i);
            System.out.println("email: "+myUser.getEmailUser());
        }
        
        return list;
    }
    
}
