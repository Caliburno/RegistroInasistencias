package com.mycompany.registroinasistencias.Logica;

import java.time.DayOfWeek;
import java.util.List;


public class Asignatura {

    private int id;
    
    private String nombreAsignatura;
    private Grupo grupo;
    private DayOfWeek dia;
    private Turno turno;

    private Docente docente;
 
    private List<Grupo> grupos;

    public String getNombreAsignatura() {
        return nombreAsignatura;
    }

    public void setNombreAsignatura(String nombreAsignatura) {
        this.nombreAsignatura = nombreAsignatura;
    }

    public Grupo getGrupo() {
        return grupo;
    }

    public void setGrupo(Grupo grupo) {
        this.grupo = grupo;
    }

    public DayOfWeek getDia() {
        return dia;
    }

    public void setDia(DayOfWeek dia) {
        this.dia = dia;
    }

    public Turno getTurno() {
        return turno;
    }

    public void setTurno(Turno turno) {
        this.turno = turno;
    }
    
    public Asignatura(String nombreAsignatura, Grupo grupo, DayOfWeek dia, Turno turno) {
        this.nombreAsignatura = nombreAsignatura;
        this.grupo = grupo;
        this.dia = dia;
        this.turno = turno;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
