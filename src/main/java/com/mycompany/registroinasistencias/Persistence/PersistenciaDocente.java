/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.registroinasistencias.Persistence;

import com.mycompany.registroinasistencias.Logica.Docente;
import com.mycompany.registroinasistencias.Logica.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author 56317473
 */
public class PersistenciaDocente {

    public PersistenciaDocente() {
    }
    
    private final static String SQL_GUARDAR_DOCENTE = ("INSERT INTO ausentbase.Docente(CI,NAME)VALUES (?,?)");
    private final static String SQL_LEER_DOCENTES = "";
    private final static String SQL_LEER_DOCENTE = "";
    private final static String SQL_EDITAR_DOCENTE = "";
    private final static String SQL_ELIMINAR_DOCENTE = ("Delete * FROM ausentbase.Docente WHERE ci=?");
    
    public Conexion cone = new Conexion();
    public PreparedStatement ps;
    public ResultSet rs;

    public void guardarUsuario(Docente doce) throws Exception, SQLException{
        try(Connection con = cone.getConnection();
            PreparedStatement ps = (PreparedStatement) con.prepareStatement(SQL_GUARDAR_DOCENTE);){
            
           // int resultado = 0;
            
            
            ps.setString(1, doce.getCI()); 
            
            ps.setString(2, doce.getNombreDocente());
           
             
             //resultado = ps.executeUpdate();
             
             
            
             
             con.close();
        }catch(SQLException e){
             throw new Exception(e);
        }
    } 
    
    
    
}
