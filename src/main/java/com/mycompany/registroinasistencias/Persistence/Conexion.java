/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.registroinasistencias.Persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author 56317473
 */
public class Conexion {
     public static Connection getConnection() throws Exception {
        Connection con=null;
        try{
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ausentbase?serverTimezone=UTC","root","root");
        }catch(SQLException sqle){
        throw new Exception("Error de conexion");
    }
        return con;
            
    }
}
