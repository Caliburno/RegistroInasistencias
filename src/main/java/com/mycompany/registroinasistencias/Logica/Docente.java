package com.mycompany.registroinasistencias.Logica;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity
public class Docente {
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    private int id;
    private String nombreDocente;
    private int CI;
    @OneToMany
    private ArrayList<Asignatura> asignaturas;
    @ManyToMany
    private List<Grupo> grupos;

    public Docente(String nombreDocente, int CI, ArrayList<Asignatura> asignaturas) {
        this.nombreDocente = nombreDocente;
        this.CI = CI;
        this.asignaturas = asignaturas;
    }
    
    
    public String getNombreDocente() {
        return nombreDocente;
    }

    public void setNombreDocente(String nombreDocente) {
        this.nombreDocente = nombreDocente;
    }

    public int getCI() {
        return CI;
    }

    public void setCI(int CI) {
        this.CI = CI;
    }

    public ArrayList<Asignatura> getAsignaturas() {
        return asignaturas;
    }

    public void setAsignaturas(ArrayList<Asignatura> asignaturas) {
        this.asignaturas = asignaturas;
    }
}
