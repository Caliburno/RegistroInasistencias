package com.mycompany.registroinasistencias.Logica;

public class Usuario {
    private String ci;
    private String password;

    public Usuario() {
    }

    public Usuario(String ci, String password) {
        this.ci = ci;
  
        this.password = password;
    }

    public String getCi() {
        return ci;
    }

    public void setCi(String ci) {
        this.ci = ci;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    
}
