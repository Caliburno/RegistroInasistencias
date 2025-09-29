package com.mycompany.registroinasistencias.Logica;

import java.time.LocalDate;
import java.time.LocalTime;



public class Inasistencia {
 
    private int id;
    private Docente docente;
    private boolean isParcial;
    private LocalDate fechaDesde;
    private LocalDate fechaHasta;
    private LocalTime horaDesde;
    private LocalTime horaHasta;

    public Inasistencia() {
    }

    public Inasistencia(int id, Docente docente, boolean isParcial, LocalDate fechaDesde, LocalDate fechaHasta, LocalTime horaDesde, LocalTime horaHasta) {
        this.id = id;
        this.docente = docente;
        this.isParcial = isParcial;
        this.fechaDesde = fechaDesde;
        this.fechaHasta = fechaHasta;
        this.horaDesde = horaDesde;
        this.horaHasta = horaHasta;
    }

    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Docente getDocente() {
        return docente;
    }

    public void setDocente(Docente docente) {
        this.docente = docente;
    }

    public boolean isIsParcial() {
        return isParcial;
    }

    public void setIsParcial(boolean isParcial) {
        this.isParcial = isParcial;
    }

    
    
    public LocalDate getFechaDesde() {
        return fechaDesde;
    }


   

    public void setFechaDesde(LocalDate fechaDesde) {
        this.fechaDesde = fechaDesde;
    }

    public LocalDate getFechaHasta() {
        return fechaHasta;
    }

    public void setFechaHasta(LocalDate fechaHasta) {
        this.fechaHasta = fechaHasta;
    }

    public LocalTime getHoraDesde() {
        return horaDesde;
    }

    public void setHoraDesde(LocalTime horaDesde) {
        this.horaDesde = horaDesde;
    }

    public LocalTime getHoraHasta() {
        return horaHasta;
    }

    public void setHoraHasta(LocalTime horaHasta) {
        this.horaHasta = horaHasta;
    }

   

}
