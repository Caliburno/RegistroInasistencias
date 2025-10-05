/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.registroinasistencias.Persistence;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author 56317473
 */
public class PersistenciaDocente {

    public PersistenciaDocente() {
    }
    
    private final static String SQL_GUARDAR_DOCENTE = "";
    private final static String SQL_LEER_DOCENTES = "";
    private final static String SQL_LEER_DOCENTE = "";
    private final static String SQL_EDITAR_DOCENTE = "";
    private final static String SQL_ELIMINAR_DOCENTE = "";
    
    public Conexion cone = new Conexion();
    public PreparedStatement ps;
    public ResultSet rs;
    
    
}
