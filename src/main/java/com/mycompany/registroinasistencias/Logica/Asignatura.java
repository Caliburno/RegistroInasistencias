package com.mycompany.registroinasistencias.Logica;

import java.time.DayOfWeek;

public class Asignatura {

    private int id;
    private Docente docente;
    private String nombreAsignatura;
    private String grupo;
    private DayOfWeek dia;
    private Turno turno;

    public Asignatura() {
    }

    public Asignatura(int id,Docente docente, String nombreAsignatura, String grupo, DayOfWeek dia, Turno turno) {
        this.id = id;
        this.docente = docente;
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

    
    public String getNombreAsignatura() {
        return nombreAsignatura;
    }

    public void setNombreAsignatura(String nombreAsignatura) {
        this.nombreAsignatura = nombreAsignatura;
    }

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
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

    public Docente getDocente() {
        return docente;
    }

    public void setDocente(Docente docente) {
        this.docente = docente;
    }

    
   
    
  


    
}