/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.registroinasistencias.Logica;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.ArrayList;
import javax.persistence.Entity;

/**
 *
 * @author massi
 */

public class GestorInasistencia {
    public ArrayList<Grupo> calcularGruposAfectados(Inasistencia inasistencia) {
    ArrayList<Grupo> gruposAfectados = new ArrayList<>();

    Docente docente = inasistencia.getDocente();
    LocalDate desde = inasistencia.getDesde();
    LocalDate hasta = inasistencia.getHasta();

    LocalDate fecha = desde;
    while (!fecha.isAfter(hasta)) {
        DayOfWeek dia = fecha.getDayOfWeek(); 

        for (Asignatura asignatura : docente.getAsignaturas()) {
            if (asignatura.getDia().name().equals(dia.name())) {
                Grupo grupo = asignatura.getGrupo();
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
