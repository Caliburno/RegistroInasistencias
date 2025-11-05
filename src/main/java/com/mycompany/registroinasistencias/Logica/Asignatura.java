package com.mycompany.registroinasistencias.Logica;

import java.time.DayOfWeek;

public class Asignatura {

    private String nombreAsignatura;
    private String grupo;
    private DayOfWeek dia;
    private Turno turno;

    private Docente docente;

    public Asignatura() {
    }

    public Asignatura(String nombreAsignatura, String grupo, DayOfWeek dia, Turno turno, Docente docente) {
        this.nombreAsignatura = nombreAsignatura;
        this.grupo = grupo;
        this.dia = dia;
        this.turno = turno;
        this.docente = docente;
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