/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.registroinasistencias.Logica;

import java.util.List;


/**
 *
 * @author Dario
 */

public class Grupo {

    private int id;
    private String nombreGrupo;
    private Turno turno;
  
    private List<Docente> docentes;
 
    private List<Asignatura>asignaturas;
    
    public Grupo(String nombreGrupo) {
        this.nombreGrupo = nombreGrupo;
    }
    
    public Turno getTurno() {
        return turno;
    }

    public void setTurno(Turno turno) {
        this.turno = turno;
    }
    
    public String getNombreGrupo() {
        return nombreGrupo;
    }

    public void setNombreGrupo(String nombreGrupo) {
        this.nombreGrupo = nombreGrupo;
    }
}
