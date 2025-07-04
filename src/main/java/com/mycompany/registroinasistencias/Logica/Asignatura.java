/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.registroinasistencias.Logica;

/**
 *
 * @author Dario
 */
public class Asignatura {
    private String nombreAsignatura;
    private Grupo grupo;
    private DiaSemana dia;
    private Turno turno;

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

    public DiaSemana getDia() {
        return dia;
    }

    public void setDia(DiaSemana dia) {
        this.dia = dia;
    }

    public Turno getTurno() {
        return turno;
    }

    public void setTurno(Turno turno) {
        this.turno = turno;
    }

    
    
    public Asignatura(String nombreAsignatura, Grupo grupo, DiaSemana dia, Turno turno) {
        this.nombreAsignatura = nombreAsignatura;
        this.grupo = grupo;
        this.dia = dia;
        this.turno = turno;
    }
    
    
}
