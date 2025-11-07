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
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ausentbase?serverTimezone=UTC","root","Benicio28975");
        }catch(SQLException sqle){
        throw new Exception("Error de conexion");
    }
        return con;
            
    }
}
