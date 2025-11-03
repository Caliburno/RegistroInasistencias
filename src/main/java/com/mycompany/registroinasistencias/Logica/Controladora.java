/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.registroinasistencias.Logica;

import com.mycompany.registroinasistencias.Persistence.ControladoraPersistencia;
import java.time.DayOfWeek;
import java.time.LocalTime;
import java.util.List;
import org.mindrot.jbcrypt.BCrypt;



/**
 *
 * @author barbarasilvacampbell
 */
public class Controladora {
    ControladoraPersistencia controlPersis = new ControladoraPersistencia();
    

    public boolean verificarUsuario(String ci, String contraUsu) {
       // llama a una funcionn para traer la password que coincida con la clave primaria de Usuario
       String passwordDataBase =  controlPersis.traerPassword(ci, contraUsu);
        
       //Compara la contraseña en texto plano, con la contraseña que esta en la DB desescriptandola
        boolean comparation = BCrypt.checkpw(contraUsu, passwordDataBase);
        
        //se guarda el resultado de la comparacion y se devuelve al JFrame Login para que sepa que hacer
        return comparation;
    }
    
    public boolean verificarCI(String ci){
        return controlPersis.verificarCI(ci);
    }
    

    public void guardarUsuario(String name, String ci, String password) {
        Usuario usu = new Usuario();
        
        usu.setName(name);
        usu.setCi(ci);
        String hashed = BCrypt.hashpw(password, BCrypt.gensalt());
        usu.setPassword(hashed);
        
        controlPersis.guardarUsuario(usu);
        
    }

   
    
    
    
    
}
