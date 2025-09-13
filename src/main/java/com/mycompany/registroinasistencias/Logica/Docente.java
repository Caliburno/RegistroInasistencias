package com.mycompany.registroinasistencias.Logica;
import java.util.ArrayList;
import java.util.List;



public class Docente {


    private int id;
    private String nombreDocente;
    private int CI;
 
    private ArrayList<Asignatura> asignaturas;

    private List<Grupo> grupos;

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
