package com.mycompany.registroinasistencias.Logica;

import com.mycompany.registroinasistencias.Persistence.ControladoraPersistencia;
import com.mycompany.registroinasistencias.Persistence.PersistenciaAsignatura;
import com.mycompany.registroinasistencias.Persistence.PersistenciaDocente;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import org.mindrot.jbcrypt.BCrypt;



/**
 *
 * @author barbarasilvacampbell
 */
public class Controladora {
    ControladoraPersistencia controlPersis = new ControladoraPersistencia();
    
PersistenciaDocente pd = new PersistenciaDocente();
    PersistenciaAsignatura pa = new PersistenciaAsignatura();
    
    public List<Docente> traerDocentes() {
        try {
            // Este método ya trae los docentes CON sus asignaturas cargadas
            return pd.traerDocentes();
        } catch (Exception e) {
            System.out.println("Error en controladora: " + e);
            return new ArrayList<>();
        }
    }
    
    public Docente traerDocente(String ci) {
        // Este método trae un docente CON sus asignaturas
        return pd.leerDocente(ci);
    }
    
    public List<Asignatura> traerAsignaturas() {
        try {
            return pa.traerAsignaturas();
        } catch (Exception e) {
            System.out.println("Error en controladora: " + e);
            return new ArrayList<>();
        }
    }
    
    //modificar lo de arriba
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

    public void crearAsignatura(Docente docente, String nameSubject, String group, String days, String turno) {
        Asignatura asi = new Asignatura();
        asi.setDocente(docente);
        asi.setNombreAsignatura(nameSubject);
        asi.setGrupo(group);
        asi.setDia(DayOfWeek.valueOf(days));
        asi.setTurno(Turno.valueOf(turno));
        controlPersis.crearAsignatura(asi);
    }

    public void crearInasistencia(String docenteCI, String desde, String hasta) {
        Inasistencia inas = new Inasistencia();
    
    Docente docente = controlPersis.leerDocente(docenteCI);
    
    if(docente == null) {
        System.out.println("Error: Docente no encontrado");
        return;
    }
    LocalDate fechaDesde = LocalDate.parse(desde);
    LocalDate fechaHasta = LocalDate.parse(hasta);
    
    inas.setDocente(docente);
    inas.setDesde(fechaDesde);
    inas.setHasta(fechaHasta);
    
    controlPersis.crearInasistencia(inas);
    }
    
    public void borrarDocente(Docente doce){
        
    };
    
    public void borrarAsignatura(Asignatura materia){
        
    };
    
    public void borrarInasistencia(Inasistencia ina){
        
    };
    
    
   /* public List<Docente> traerDocentes() {
        return controlPersis.traerDocentes();
    }

    public List<Asignatura> traerAsignaturas() {
        return controlPersis.traerAsignaturas();
    }*/
    
    public List<Inasistencia> traerInasistencias() {
        return controlPersis.traerInasistencias();
    }
}
