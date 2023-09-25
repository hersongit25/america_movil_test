/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.amovil.service;

import com.amovil.dao.loginDAOImp;
import com.amovil.jpa.user;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author herso
 */
@Service("loginService")
public class loginServiceImp implements loginService {
    
    @Autowired
    loginDAOImp loginDao;
    
    @Override
    public List<user> getLogin() {
        System.out.println("Enter loginServiceImp");
        
        return loginDao.getListUser();
    }
    
}
