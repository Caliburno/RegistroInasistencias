/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.registroinasistencias.Logica;
import java.util.ArrayList;
/**
 *
 * @author massi
 */
public class Docente {
    private String nombreDocente;
    private int CI;
    private ArrayList<Asignatura> asignaturas;

    public Docente(String nombreDocente, int CI, ArrayList<Asignatura> asignaturas) {
        this.nombreDocente = nombreDocente;
        this.CI = CI;
        this.asignaturas = asignaturas;
    }

    
    
    public String getNombreDocente() {
        return nombreDocente;
    }

    public void setNombreDocente(String nombreDocente) {
        this.nombreDocente = nombreDocente;
    }

    public int getCI() {
        return CI;
    }

    public void setCI(int CI) {
        this.CI = CI;
    }

    public ArrayList<Asignatura> getAsignaturas() {
        return asignaturas;
    }

    public void setAsignaturas(ArrayList<Asignatura> asignaturas) {
        this.asignaturas = asignaturas;
    }
    
    
}
