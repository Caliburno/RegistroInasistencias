/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package com.mycompany.registroinasistencias.Logica;

/**
 *
 * @author Dario
 */
public enum Turno {
    MATUTINO, VESPERTINO, NOCTURNO;
    
    @Override
    public String toString() {
        String name = this.name().toLowerCase();
        return name.substring(0, 1).toUpperCase() + name.substring(1);
    }
}
