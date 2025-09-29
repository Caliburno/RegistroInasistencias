package com.mycompany.registroinasistencias.Logica;
import java.util.ArrayList;
import java.util.List;



public class Docente {



    private int ci;
    private String name;
    private String mail;
    private int tel;
    private String grado;
    private List<Inasistencia> inasistencias;
    private List<Horario> horarios;

    public Docente() {
    }

    public Docente(int ci, String name, String mail, int tel, String grado, List<Inasistencia> inasistencias, List<Horario> horarios) {
        this.ci = ci;
        this.name = name;
        this.mail = mail;
        this.tel = tel;
        this.grado = grado;
        this.inasistencias = inasistencias;
        this.horarios = horarios;

    }

    public int getCi() {
        return ci;
    }

    public void setCi(int ci) {
        this.ci = ci;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMail() {
        return mail;
    }


    public void setMail(String mail) {
        this.mail = mail;
    }

    public int getTel() {
        return tel;
    }

    public void setTel(int tel) {
        this.tel = tel;
    }

    public String getGrado() {
        return grado;
    }

    public void setGrado(String grado) {
        this.grado = grado;
    }

    public List<Inasistencia> getInasistencias() {
        return inasistencias;
    }

    public void setInasistencias(List<Inasistencia> inasistencias) {
        this.inasistencias = inasistencias;
    }

    public List<Horario> getHorarios() {
        return horarios;
    }

    public void setHorarios(List<Horario> horarios) {
        this.horarios = horarios;
    }

   

   

}
