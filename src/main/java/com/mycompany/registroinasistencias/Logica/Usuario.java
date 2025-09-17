/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.registroinasistencias.Logica;

/**
 *
 * @author 56317473
 */
public class Usuario {
    private int id;
    private String nombreUsuario;
    private String passwordUsuario;

    public Usuario() {
    }

    public Usuario(int id, String nombreUsuario, String passwordUsuario) {
        this.id = id;
        this.nombreUsuario = nombreUsuario;
        this.passwordUsuario = passwordUsuario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getPasswordUsuario() {
        return passwordUsuario;
    }

    public void setPasswordUsuario(String passwordUsuario) {
        this.passwordUsuario = passwordUsuario;
    }
    
    
}
