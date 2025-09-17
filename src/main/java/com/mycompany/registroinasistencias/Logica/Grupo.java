package com.mycompany.registroinasistencias.Logica;

import java.util.List;

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
