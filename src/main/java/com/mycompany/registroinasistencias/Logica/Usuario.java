package com.mycompany.registroinasistencias.Logica;

public class Usuario {
    private String name;
    private String ci;
    private String nameUser;
    private String password;

    public Usuario() {
    }

    public Usuario(String name, String ci, String nameUser, String password) {
        this.name = name;
        this.ci = ci;
        this.nameUser = nameUser;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCi() {
        return ci;
    }

    public void setCi(String ci) {
        this.ci = ci;
    }

    public String getNameUser() {
        return nameUser;
    }

    public void setNameUser(String nameUser) {
        this.nameUser = nameUser;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    
}
