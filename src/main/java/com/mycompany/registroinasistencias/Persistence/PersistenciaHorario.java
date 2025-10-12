/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.registroinasistencias.Persistence;

import com.mycompany.registroinasistencias.Logica.Horario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author 56317473
 */
public class PersistenciaHorario {

    public PersistenciaHorario() {
    }
    
    private final static String SQL_GUARDAR_HORARIO = ("INSERT INTO Horario (dia_semana, ci_docente, nombre_asignatura, nombre_grupo, turno) VALUES (?, ?, ?, ?, ?)");
    private final static String SQL_LEER_HORARIOS = "";
    private final static String SQL_LEER_HORARIO = "";
    private final static String SQL_EDITAR_HORARIO = "";
    private final static String SQL_ELIMINAR_HORARIO = "";
    
    public Conexion cone = new Conexion();
    public PreparedStatement ps;
    public ResultSet rs;
    
    public void guardarHorario(Horario horario) throws SQLException, Exception{
        try{
            int resultado = 0;
            
            Connection con =  cone.getConnection();
            
            ps = (PreparedStatement) con.prepareStatement(SQL_GUARDAR_HORARIO);
            //System.out.println(asignatura.getNombreAsignatura());
            ps.setString(1, horario.getDiaSemana().toString());
            ps.setString(2, horario.getaDocente().getCi());
            ps.setString(3, horario.getAnAsignatura().getNombreAsignatura());
            ps.setString(4, horario.getaGrupo().getName());
            ps.setString(5, horario.getTurno().toString());
            
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
