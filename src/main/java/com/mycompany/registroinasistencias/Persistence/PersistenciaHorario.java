/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.registroinasistencias.Persistence;

import com.mycompany.registroinasistencias.Logica.Horario;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author 56317473
 */
public class PersistenciaHorario {
    private final static String SQL_GUARDAR_HORARIO = "";
    private final static String SQL_LEER_HORARIOS = "";
    private final static String SQL_LEER_HORARIO = "";
    private final static String SQL_EDITAR_HORARIO = "";
    private final static String SQL_ELIMINAR_HORARIO = "";
    
    public Conexion cone = new Conexion();
    public PreparedStatement ps;
    public ResultSet rs;
    
    public void guardarHorario(Horario horario) throws SQLException, Exception{
        
    }
}
