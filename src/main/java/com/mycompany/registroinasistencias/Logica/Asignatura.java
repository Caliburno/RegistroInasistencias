package com.mycompany.registroinasistencias.Logica;

import java.time.DayOfWeek;
import java.util.List;


public class Asignatura {

   
    
    private String nombreAsignatura;
    private List<Horario> horarios;


 

    public Asignatura() {
    }

    public Asignatura(String nombreAsignatura, List<Horario> horarios) {
        this.nombreAsignatura = nombreAsignatura;
        this.horarios = horarios;
    }
    
    


    public String getNombreAsignatura() {
        return nombreAsignatura;
    }

    public void setNombreAsignatura(String nombreAsignatura) {
        this.nombreAsignatura = nombreAsignatura;
    }

    public List<Horario> getHorarios() {
        return horarios;
    }

    public void setHorarios(List<Horario> horarios) {
        this.horarios = horarios;
    }


    

   
    
  
  
    

}
