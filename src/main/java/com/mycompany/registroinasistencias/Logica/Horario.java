/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.registroinasistencias.Logica;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalTime;

/**
 *
 * @author 56317473
 */
public class Horario {
    private int id;
    private DayOfWeek diaSemana;
    private LocalTime hora;
    private Docente aDocente;
    private Asignatura anAsignatura;
    private Grupo aGrupo;
    private Turno turno;

    public Horario() {
    }

    public Horario(int id, DayOfWeek diaSemana, LocalTime hora, Docente aDocente, Asignatura anAsignatura, Grupo aGrupo, Turno turno) {
        this.id = id;
        this.diaSemana = diaSemana;
        this.hora = hora;
        this.aDocente = aDocente;
        this.anAsignatura = anAsignatura;
        this.aGrupo = aGrupo;
        this.turno = turno;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public DayOfWeek getDiaSemana() {
        return diaSemana;
    }

    public void setDiaSemana(DayOfWeek diaSemana) {
        this.diaSemana = diaSemana;
    }

    public LocalTime getHora() {
        return hora;
    }

    public void setHora(LocalTime hora) {
        this.hora = hora;
    }

    public Docente getaDocente() {
        return aDocente;
    }

    public void setaDocente(Docente aDocente) {
        this.aDocente = aDocente;
    }

    public Asignatura getAnAsignatura() {
        return anAsignatura;
    }

    public void setAnAsignatura(Asignatura anAsignatura) {
        this.anAsignatura = anAsignatura;
    }

    public Grupo getaGrupo() {
        return aGrupo;
    }

    public void setaGrupo(Grupo aGrupo) {
        this.aGrupo = aGrupo;
    }

    public Turno getTurno() {
        return turno;
    }

    public void setTurno(Turno turno) {
        this.turno = turno;
    }
    
    
}
