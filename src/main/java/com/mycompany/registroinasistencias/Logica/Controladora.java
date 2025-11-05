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
    

    public void guardarUsuario(String ci, String password) {
        Usuario usu = new Usuario();
        
        usu.setCi(ci);
        String hashed = BCrypt.hashpw(password, BCrypt.gensalt());
        usu.setPassword(hashed);
        
        controlPersis.guardarUsuario(usu);
        
    }

    public void crearDocente(String ciDocente, String nameDocente) {
        Docente doce = new Docente();
        
        doce.setCI(ciDocente);
        doce.setNombreDocente(nameDocente);
        controlPersis.crearDocente(doce);
    }

    public void crearAsignatura(String docente, String nameSubject, String group, String days, String turno) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void crearInasistencia(String docente, String desde, String hasta) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    public void borrarDocente(Docente doce){
        
    };
    
    public void borrarAsignatura(Asignatura materia){
        
    };
    
    public void borrarInasistencia(Inasistencia ina){
        
    };
    
    
    public List<Docente> traerDocentes() {
        return controlPersis.traerDocentes();
    }

    public List<Asignatura> traerAsignaturas() {
        return controlPersis.traerAsignaturas();
    }
    
    public List<Inasistencia> traerInasistencias() {
        return controlPersis.traerInasistencias();
    }
}
