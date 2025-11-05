package com.mycompany.registroinasistencias.Logica;

import java.util.ArrayList;
import java.util.List;

public class Docente {
    //esta clase es una herencia de la clase docente.

    private String CI;
    private String nombreDocente;
    private ArrayList<Asignatura> asignaturas;
    private List<String> grupos;

    public Docente() {
    }
    
    public String toString(){
        
        String nombre = getNombreDocente();
        return nombre;
    }
    
    

    public Docente(String CI, String nombreDocente, ArrayList<Asignatura> asignaturas) {
        this.CI = CI;
        this.nombreDocente = nombreDocente;
        this.asignaturas = asignaturas;
    }
    
    public Docente(String CI, String nombreDocente) {
        this.nombreDocente = nombreDocente;
        this.CI = CI;
    }

    
    
    public String getNombreDocente() {
        return nombreDocente;
    }

    public void setNombreDocente(String nombreDocente) {
        this.nombreDocente = nombreDocente;
    }

    public String getCI() {
        return CI;
    }

    public void setCI(String CI) {
        this.CI = CI;
    }

    public ArrayList<Asignatura> getAsignaturas() {
        return asignaturas;
    }

    public void setAsignaturas(ArrayList<Asignatura> asignaturas) {
        this.asignaturas = asignaturas;
    }
    
    
}