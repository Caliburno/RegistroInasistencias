/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.registroinasistencias.Persistence;

import com.mycompany.registroinasistencias.Logica.Asignatura;
import com.mycompany.registroinasistencias.Logica.Horario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author 56317473
 */
public class PersistenciaAsignatura {

    public PersistenciaAsignatura() {
    }
    
    private static final String SQL_GUARDAR_ASIGNATURA = ("INSERT INTO ausentbase.Asignatura(NAME)VALUES (?)");
    private static final String SQL_LEER_ASIGNATURAS = "";
    private static final String SQL_LEER_ASIGNATURA = "";
    private static final String SQL_ELIMINAR_ASIGNATURA = "";
    private static final String SQL_CREAR_ASIGNATURA = "";
    
    public Conexion cone = new Conexion();
    public PreparedStatement ps;
    public ResultSet rs;
    
    public void guardarAsignatura(Asignatura asignatura)throws SQLException, Exception{
        try{
            int resultado = 0;
            
            Connection con =  cone.getConnection();
            
            ps = (PreparedStatement) con.prepareStatement(SQL_GUARDAR_ASIGNATURA);
            //System.out.println(asignatura.getNombreAsignatura());
            ps.setString(1, asignatura.getNombreAsignatura());
            
           /* if (asignatura.getHorarios() != null && !asignatura.getHorarios().isEmpty()) {
            for (Horario horario : asignatura.getHorarios()) {
                
            }
        }*/
            
            
            resultado = ps.executeUpdate();
        }catch(SQLException e){
            throw new Exception("Error al conectarse con la Base de Datos" + e);
        }
    }
}
