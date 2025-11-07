package com.mycompany.registroinasistencias.Persistence;

import com.mycompany.registroinasistencias.Logica.Asignatura;
import com.mycompany.registroinasistencias.Logica.Docente;
import com.mycompany.registroinasistencias.Logica.Turno;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.DayOfWeek;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 56317473
 */
public class PersistenciaAsignatura {

    public PersistenciaAsignatura() {
    }
    
    private static final String SQL_CREAR_ASIGNATURA = ("INSERT INTO ausentbase.Asignatura(docente, nombre, grupo, dia, turno)VALUES (?,?,?,?,?)");
    private static final String SQL_LEER_ASIGNATURAS = ("SELECT * FROM ausentbase.Asignatura");
    private static final String SQL_ELIMINAR_ASIGNATURA = "Delete FROM ausentbase.Asignatura WHERE id=?";
    
    
    
    public Conexion cone = new Conexion();
    public PreparedStatement ps;
    public ResultSet rs;
    public PersistenciaDocente pd = new PersistenciaDocente();
    
    
    public void crearAsignatura(Asignatura materia) throws Exception, SQLException{
        try(Connection con = cone.getConnection();
            PreparedStatement ps = (PreparedStatement) con.prepareStatement(SQL_CREAR_ASIGNATURA);){
            
            int resultado = 0;
            
            ps.setString(1, materia.getDocente().getCI());
            System.out.println(materia.getDocente().getCI());
            ps.setString(2, materia.getNombreAsignatura());
            System.out.println(materia.getNombreAsignatura());
            ps.setString(3, materia.getGrupo());
            System.out.println(materia.getGrupo());
            ps.setString(4, materia.getDia().toString());
            System.out.println(materia.getDia().toString());
            ps.setString(5, materia.getTurno().toString());
            System.out.println(materia.getTurno().toString());
            resultado = ps.executeUpdate();
             
             con.close();
        }catch(SQLException e){
             throw new Exception(e);
        }
    } 
    
    public void eliminarAsignatura(int id) throws SQLException, Exception{

        try(Connection con = cone.getConnection();
            PreparedStatement ps = (PreparedStatement) con.prepareStatement(SQL_ELIMINAR_ASIGNATURA);) {
            

           
            ps.setInt(1, id);
            int resultado = ps.executeUpdate();

            if (resultado == 0) {
                throw new Exception("La asignatura con ID " + id + " no existe");
            } else {
                System.out.println("Asignatura eliminada: " + id);
            }
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        
}
    
    
   
    
    public List<Asignatura> traerAsignaturas() throws Exception, SQLException {
        List<Asignatura> listaAsignaturas = new ArrayList<>();
        
        try (Connection con = cone.getConnection();
             PreparedStatement ps = con.prepareStatement(SQL_LEER_ASIGNATURAS)) {
           
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()) {
                String ciDocente = rs.getString("docente");
                String id = rs.getString("id");
                String nombre = rs.getString("nombre");
                String grupo = rs.getString("grupo");
                String dia = rs.getString("dia");
                String turno = rs.getString("turno");
                
              
                Asignatura asignatura = new Asignatura();
                asignatura.setId(Integer.parseInt(id));
                asignatura.setNombreAsignatura(nombre);
                asignatura.setGrupo(grupo);
                asignatura.setDia(DayOfWeek.valueOf(dia));
                asignatura.setTurno(Turno.valueOf(turno));
                
               
                Docente docente = pd.leerDocenteSimple(ciDocente);
                asignatura.setDocente(docente);
                
                listaAsignaturas.add(asignatura);
            }
            rs.close();
            
        } catch (SQLException e) {
            System.out.println(e);
            throw new Exception("No se pudieron obtener las asignaturas");
        }
        
        return listaAsignaturas;
    }

    
}
