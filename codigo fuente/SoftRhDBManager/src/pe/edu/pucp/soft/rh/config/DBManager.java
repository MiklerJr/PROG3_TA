/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.pucp.soft.rh.config;

/**
 *
 * @author Fabián
 */

import java.sql.DriverManager;
import java.sql.Connection;

public class DBManager {
    
    private Connection conexion;
    private String url = "";
    private String user = "";
    private String password = "";
    private static DBManager dbManager = null;
    
    private DBManager(){};
    
    public static DBManager getInstance(){
        if(dbManager == null)
            createInstance();
        return dbManager;
    }
    
    private static void createInstance(){
        if (dbManager == null)
            dbManager = new DBManager();
    }  
    
    public Connection getConnection(){
        return this.conexion;
    }
    
}
