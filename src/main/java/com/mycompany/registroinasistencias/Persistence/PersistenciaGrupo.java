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
public class PersistenciaGrupo {

    public PersistenciaGrupo() {
    }
    
    private final static String SQL_GUARDAR_GRUPO = "";
    private final static String SQL_LEER_GRUPOS = "";
    private final static String SQL_LEER_GRUPO = "";
    private final static String SQL_EDITAR_GRUPO = "";
    private final static String SQL_ELIMINAR_GRUPO = "";
    
    public Conexion cone = new Conexion();
    public PreparedStatement ps;
    public ResultSet rs;
}
