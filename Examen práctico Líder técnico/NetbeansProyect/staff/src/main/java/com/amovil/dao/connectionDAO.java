/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.amovil.dao;

import java.sql.Connection;
import org.hibernate.SessionFactory;

/**
 *
 * @author herso
 */
public interface connectionDAO {
    
    public SessionFactory getSessionFactory();
    
    public Connection getConnection();
    
}
