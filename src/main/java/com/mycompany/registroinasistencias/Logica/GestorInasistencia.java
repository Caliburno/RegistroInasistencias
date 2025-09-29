package com.mycompany.registroinasistencias.Logica;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.ArrayList;


public class GestorInasistencia {
    public ArrayList<Grupo> calcularGruposAfectados(Inasistencia inasistencia) {
        ArrayList<Grupo> gruposAfectados = new ArrayList<>();

        Docente docente = inasistencia.getDocente();
        LocalDate desde = inasistencia.getFechaDesde();
        LocalDate hasta = inasistencia.getFechaHasta();

        LocalDate fecha = desde;
        while (!fecha.isAfter(hasta)) {
            DayOfWeek dia = fecha.getDayOfWeek(); 

            for (Horario horario : docente.getHorarios()) {
                if (horario.getDiaSemana().name().equals(dia.name())) {
                    Grupo grupo = horario.getaGrupo();
                    if (!gruposAfectados.contains(grupo)) {
                        gruposAfectados.add(grupo);
                    }
                }
            }
        
            fecha = fecha.plusDays(1);
        }
    
        return gruposAfectados;
    }
}
