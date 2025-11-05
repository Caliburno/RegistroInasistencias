package com.mycompany.registroinasistencias.Persistence;

import com.mycompany.registroinasistencias.Logica.Asignatura;
import com.mycompany.registroinasistencias.Logica.Docente;
import com.mycompany.registroinasistencias.Logica.Inasistencia;
import com.mycompany.registroinasistencias.Logica.Usuario;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author massi
 */
public class ControladoraPersistencia {

    public ControladoraPersistencia() {
    }
    
    
    PersistenciaAsignatura perAsig = new PersistenciaAsignatura();
    PersistenciaDocente perDoce = new PersistenciaDocente();
    PersistenciaInasistencia perIna = new PersistenciaInasistencia();
    PersistenciaUsuario perUsu = new PersistenciaUsuario();

    public void guardarUsuario(Usuario usu) {
        try {
            perUsu.guardarUsuario(usu);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public String traerPassword(String ci, String password) {
        String result = "";
        try {
            if(verificarCI(ci)){
                result = perUsu.traerPasword(ci, password);
            }
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
        return result;
    }

    
   public boolean verificarCI(String ci){
       boolean result = false;
        try {
            result = perUsu.verificarCI(ci);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
       return result;
   }

    public void crearDocente(Docente doce) {
        try {
            perDoce.crearDocente(doce);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    
    public void borrarDocente(Docente doce){
        
    };
    
    public List<Docente> traerDocentes() {
        try {
            return perDoce.traerDocentes();
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
        
    }

     public void crearAsignatura(Asignatura materia) {
        try {
            perAsig.crearAsignatura(materia);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void borrarAsignatura(Asignatura materia){
        
    };
     
    public List<Asignatura> traerAsignaturas() {
        try {
            return perAsig.traerAsignaturas();
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public void crearInasistencia(Inasistencia materia) {
        try {
            perIne.crearInasistencia(materia);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    
    public void borrarInasistencia(Docente doce){
        
    };
    
    public List<Inasistencia> traerInasistencias() {
        try {
            return perIna.traerInasistencia();
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
        
    }


    

    
  
  

    
}
