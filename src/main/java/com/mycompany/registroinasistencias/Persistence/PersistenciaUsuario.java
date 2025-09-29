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
public class PersistenciaUsuario {
    private final static String SQL_GUARDAR_USURIO = "";
    private final static String SQL_LEER_USUARIOS = "";
    private final static String SQL_LEER_USUARIO = "";
    private final static String SQL_EDITAR_USUARIO = "";
    private final static String SQL_ELIMINAR_USUARIO = "";
    
    public Conexion cone = new Conexion();
    public PreparedStatement ps;
    public ResultSet rs;
}
