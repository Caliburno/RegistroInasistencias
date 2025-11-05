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
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 56317473
 */
public class PersistenciaDocente {

    public PersistenciaDocente() {
    }
    
    private final static String SQL_GUARDAR_DOCENTE = ("INSERT INTO ausentbase.Docente(ci, nombre)VALUES (?,?)");
    private final static String SQL_LEER_DOCENTES = ("SELECT * FROM ausentbase.Docente");
    private final static String SQL_LEER_DOCENTE = ("SELECT * FROM ausentbase.Docente WHERE CI = (?)");
    //falta modificar este para actualizarlo
    private final static String SQL_EDITAR_DOCENTE = ("UPDATE  ausentbase.Docente  SET ci = (?), nombre = (?) WHERE CI = ");
    private final static String SQL_ELIMINAR_DOCENTE = ("Delete * FROM ausentbase.Docente WHERE ci=?");
    
    public Conexion cone = new Conexion();
    public PreparedStatement ps;
    public ResultSet rs;

    public void guardarDocente(Docente doce) throws Exception, SQLException{
        try(Connection con = cone.getConnection();
            PreparedStatement ps = (PreparedStatement) con.prepareStatement(SQL_GUARDAR_DOCENTE);){
            
            int resultado = 0;
            
            
            ps.setString(1, doce.getCI()); 
            System.out.println(doce.getCI());
            ps.setString(2, doce.getNombreDocente());
            System.out.println(doce.getNombreDocente());
             
             resultado = ps.executeUpdate();
             
             
            
             
             con.close();
        }catch(SQLException e){
             throw new Exception(e);
        }
    } 
    
    public void eliminarDocente(String ci) throws SQLException, Exception{

        try(Connection con = cone.getConnection();
            PreparedStatement ps = (PreparedStatement) con.prepareStatement(SQL_ELIMINAR_DOCENTE);) {
            

           String eliminacion = null;
            ps.setString(1, ci);
            int resultado = ps.executeUpdate();

            if (rs.next()) {
                eliminacion = "Persona Eliminada";

            } else {
                eliminacion = "La persona  que desea eliminar no se encuentra";
            }
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        
}
    
   public List<Docente> traerDocentes() throws SQLException, Exception{
       List<Docente> listaDocentes = new ArrayList<>();
       try(Connection con = cone.getConnection();
            PreparedStatement ps = (PreparedStatement) con.prepareStatement(SQL_LEER_DOCENTES);){
           
           ResultSet rs = ps.executeQuery();
           while (rs.next()) {
            String ci = rs.getString("ci");
            String nombre = rs.getString("Nombre");
            
            Docente docente = new Docente();
            docente.setCI(ci);
            docente.setNombreDocente(nombre);
            
            listaDocentes.add(docente);
        }
        rs.close();
        
        
    } catch (SQLException e) {
        System.out.println(e);
        throw new Exception("No se pudieron obtener los docentes");
    }
    
    return listaDocentes;
       }
     
       
      
   } 
    

