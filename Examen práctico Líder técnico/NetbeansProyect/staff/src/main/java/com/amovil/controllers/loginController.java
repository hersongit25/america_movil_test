/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.amovil.controllers;

import com.amovil.jpa.user;
import com.amovil.service.loginServiceImp;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author herso
 */
@RestController
public class loginController {
    
    @Autowired
    loginServiceImp loginService;
    
    @RequestMapping(value="/testdb", method=RequestMethod.GET,
            produces=MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<user>> testDataBase(){
        System.out.println("login usuario 2");
        
        List<user> userList = loginService.getLogin();
        return ResponseEntity.ok(userList);
    }
    
}
