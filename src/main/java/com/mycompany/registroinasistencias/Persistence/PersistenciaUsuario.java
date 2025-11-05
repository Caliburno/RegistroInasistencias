package com.mycompany.registroinasistencias.Persistence;

import com.mycompany.registroinasistencias.Logica.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author 56317473
 */
public class PersistenciaUsuario {

    public PersistenciaUsuario() {
    }
    
    private final static String SQL_GUARDAR_USUARIO =("INSERT INTO ausentbase.Usuario(ci,password) VALUES (?,?)");
    private final static String SQL_BUSCAR_USUARIO = ("SELECT password FROM ausentbase.Usuario WHERE ci = ? ");
    private final static String SQL_BUSCAR_CI = ("SELECT ci FROM ausentbase.Usuario WHERE ci = ?");
    
    public Conexion cone = new Conexion();
    public ResultSet rs;
    
    
    public void guardarUsuario(Usuario usu) throws Exception, SQLException{
        try(Connection con = cone.getConnection();
            PreparedStatement ps = (PreparedStatement) con.prepareStatement(SQL_GUARDAR_USUARIO);){
            
            int resultado = 0;
            
            ps.setString(1, usu.getCi());             
            ps.setString(2, usu.getPassword());             
            resultado = ps.executeUpdate();
             
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
