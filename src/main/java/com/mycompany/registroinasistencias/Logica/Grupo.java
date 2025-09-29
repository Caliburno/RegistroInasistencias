package com.mycompany.registroinasistencias.Logica;

import java.util.List;



public class Grupo {
 
  

    private String name;
    private Turno turno;
    private List<Horario> horarios;

    public Grupo() {

    }

    public Grupo(String name, Turno turno, List<Horario> horarios) {
        this.name = name;
        this.turno = turno;
        this.horarios = horarios;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Turno getTurno() {
        return turno;
    }

    public void setTurno(Turno turno) {
        this.turno = turno;
    }

    public List<Horario> getHorarios() {
        return horarios;
    }

    public void setHorarios(List<Horario> horarios) {
        this.horarios = horarios;
    }
 
    
    
   
}
