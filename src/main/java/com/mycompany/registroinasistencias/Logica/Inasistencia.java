/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.registroinasistencias.Logica;
import java.time.LocalDate;

/**
 *
 * @author massi
 */

public class Inasistencia {

    private int id;
    private Docente docente;
    private LocalDate desde;
    private LocalDate hasta;

    public Inasistencia(Docente docente, LocalDate desde, LocalDate hasta) {
        this.docente = docente;
        this.desde = desde;
        this.hasta = hasta;
    }
    
    public Docente getDocente() {
        return docente;
    }

    public void setDocente(Docente docente) {
        this.docente = docente;
    }

    public LocalDate getDesde() {
        return desde;
    }

    public void setDesde(LocalDate desde) {
        this.desde = desde;
    }

    public LocalDate getHasta() {
        return hasta;
    }

    public void setHasta(LocalDate hasta) {
        this.hasta = hasta;
    }
    
    
    
}
