package com.mycompany.registroinasistencias.Logica;

/**
 *
 * @author Dario
 */
public enum Turno {
    MATUTINO, VESPERTINO, NOCTURNO;
    
    @Override
    public String toString() {
        String name = this.name().toLowerCase();
        return name.substring(0, 1).toUpperCase() + name.substring(1);
    }
}
