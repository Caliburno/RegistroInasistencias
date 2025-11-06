package com.mycompany.registroinasistencias.Logica;



import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.ArrayList;

public class GestorInasistencia {
     
    Controladora control = new Controladora();
    
    public ArrayList<String> calcularGruposAfectados(Inasistencia inasistencia) {
        ArrayList<String> gruposAfectados = new ArrayList<>();
        
        // Obtener el docente COMPLETO con sus asignaturas desde la BD
        Docente docente = control.traerDocente(inasistencia.getDocente().getCI());
        
        if (docente == null || docente.getAsignaturas() == null) {
            return gruposAfectados; // Retornar lista vacía si no hay datos
        }
        
        LocalDate desde = inasistencia.getDesde();
        LocalDate hasta = inasistencia.getHasta();
        LocalDate fecha = desde;
        
        while (!fecha.isAfter(hasta)) {
            DayOfWeek dia = fecha.getDayOfWeek(); 
            
            for (Asignatura asignatura : docente.getAsignaturas()) {
                if (asignatura.getDia().equals(dia)) {
                    String grupo = asignatura.getGrupo();
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