/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.amovil.dao;

import com.amovil.utilities.Constants;
import java.sql.Connection;
import java.sql.DriverManager;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.springframework.stereotype.Repository;

/**
 *
 * @author herso
 */
@Repository("connection")
public class coneccionDAOImp implements connectionDAO {
    
    private static SessionFactory session;
    
//  =======  try open session to oracle data base ==============
    public SessionFactory getSessionFactory(){

        if( session == null ){
            StandardServiceRegistry registry = new StandardServiceRegistryBuilder()
                    .configure("hibernate.cfg.xml").build();
            Metadata meta = new MetadataSources(registry).getMetadataBuilder().build();
            session = meta.getSessionFactoryBuilder().build();
            
        }
        
        return session;
    }
    
    private Connection conn;
    
    public Connection getConnection(){
        System.out.print("Enter getConnection()");
        try{
            
            Class.forName("oracle.jdbc.OracleDriver");
            this.conn = DriverManager.getConnection(Constants.URL_DB, Constants.USER_DB, Constants.PASS_DB);
            System.out.println("Conection OK");
        }catch(Exception e){
            e.printStackTrace();
        }
        
        return conn;
    }
}
