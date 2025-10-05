/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.registroinasistencias.Persistence;

import com.mycompany.registroinasistencias.Logica.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author 56317473
 */
public class PersistenciaUsuario {

    public PersistenciaUsuario() {
    }
    
    private final static String SQL_GUARDAR_USUARIO =("INSERT INTO ausentbase.Usuario(name,ci,password) VALUES (?,?,?)");
    private final static String SQL_BUSCAR_USUARIO = ("SELECT password FROM ausentbase.Usuario WHERE ci = ? ");
    private final static String SQL_BUSCAR_CI = ("SELECT ci FROM ausentbase.Usuario WHERE ci = ?");
    private final static String SQL_LEER_USUARIOS = "";
    private final static String SQL_EDITAR_USUARIO = "";
    private final static String SQL_ELIMINAR_USUARIO = "";
    
    public Conexion cone = new Conexion();
    public ResultSet rs;
    
    
    public void guardarUsuario(Usuario usu) throws Exception, SQLException{
        try(Connection con = cone.getConnection();
            PreparedStatement ps = (PreparedStatement) con.prepareStatement(SQL_GUARDAR_USUARIO);){
            
            int resultado = 0;
            
            
            ps.setString(1, usu.getName()); 
            System.out.println(usu.getName());
            ps.setString(2, usu.getCi());
            System.out.println(usu.getCi());
             
             ps.setString(3, usu.getPassword());
             System.out.println(usu.getPassword());
             
             resultado = ps.executeUpdate();
             
             
             if (!con.getAutoCommit()) {
                con.commit();
            }
             
             con.close();
        }catch(SQLException e){
             throw new Exception(e);
        }
    } 
    
    
    
     public String traerPasword(String ci, String password) throws Exception, SQLException{
        try(Connection con = cone.getConnection();
            PreparedStatement ps = (PreparedStatement) con.prepareStatement(SQL_BUSCAR_USUARIO);){
            
            int resultado = 0;
            

             ps.setString(1, ci);
             
             try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {  
                    return rs.getString("password");
                }else {
                    throw new Exception("Usuario con CI: " + ci + " no encontrado");
                }
            }
 
        }catch(SQLException e){
            e.printStackTrace();
            throw new Exception("Error al buscar password: " + e.getMessage(), e);
        }
        
        
    }
     //Deuda tecnica, crear un procedimiento en SQL que devuelva un booleano si existe o no la CI
    public boolean verificarCI(String ci) throws Exception{
        try(Connection con = cone.getConnection();
            PreparedStatement ps = (PreparedStatement) con.prepareStatement(SQL_BUSCAR_CI);){
           
            int resultado = 0;
            

            ps.setString(1, ci);
             
            try (ResultSet rs = ps.executeQuery()) {
                  
                return rs.next();
                    
            }
 
            }catch(SQLException e){
                e.printStackTrace();
                throw new Exception("Error al buscar password: " + e.getMessage(), e);
            }
        
        
        
    }
    
}
