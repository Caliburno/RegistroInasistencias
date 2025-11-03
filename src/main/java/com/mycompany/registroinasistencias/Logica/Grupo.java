/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.registroinasistencias.Logica;

import java.util.List;

public class Grupo {

  
    private String nombreGrupo;
    private Turno turno;
  
    private List<Docente> docentes;
 
    private List<Asignatura>asignaturas;

    public Grupo() {
    }

    public Grupo(String nombreGrupo, Turno turno, List<Docente> docentes, List<Asignatura> asignaturas) {
        this.nombreGrupo = nombreGrupo;
        this.turno = turno;
        this.docentes = docentes;
        this.asignaturas = asignaturas;
    }

    public String getNombreGrupo() {
        return nombreGrupo;
    }

    public void setNombreGrupo(String nombreGrupo) {
        this.nombreGrupo = nombreGrupo;
    }

    public Turno getTurno() {
        return turno;
    }

    public void setTurno(Turno turno) {
        this.turno = turno;
    }

    public List<Docente> getDocentes() {
        return docentes;
    }

    public void setDocentes(List<Docente> docentes) {
        this.docentes = docentes;
    }

    public List<Asignatura> getAsignaturas() {
        return asignaturas;
    }

    public void setAsignaturas(List<Asignatura> asignaturas) {
        this.asignaturas = asignaturas;
    }
    
    
}
