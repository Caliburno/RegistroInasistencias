/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.registroinasistencias.Persistence;

import com.mycompany.registroinasistencias.Logica.Asignatura;
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
    
    
}
