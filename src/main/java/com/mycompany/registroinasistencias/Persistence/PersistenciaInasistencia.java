package com.mycompany.registroinasistencias.Persistence;

import com.mycompany.registroinasistencias.Logica.Inasistencia;
import com.mycompany.registroinasistencias.Logica.Docente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 56317473
 */
public class PersistenciaInasistencia {

    public PersistenciaInasistencia() {
    }
    
    private final static String SQL_CREAR_INASISTENCIA = "INSERT INTO ausentbase.Inasistencia (docente, desde, hasta) VALUES (?,?,?)";
    private final static String SQL_ELIMINAR_INASISTENCIA = "DELETE * FROM ausentbase.Inasistencia WHERE id=?";
    private final static String SQL_LEER_INASISTENCIAS = "SELECT * from ausentbase.Inasistencia";
    
    public Conexion cone = new Conexion();
    public PreparedStatement ps;
    public ResultSet rs;

public void crearInasistencia(Inasistencia ina) throws Exception, SQLException{
        try(Connection con = cone.getConnection();
            PreparedStatement ps = (PreparedStatement) con.prepareStatement(SQL_CREAR_INASISTENCIA);){
            
            int resultado = 0;
            
            ps.setString(1, ina.getDocente().toString());
            ps.setString(2, ina.getDesde().toString());
            ps.setString(3, ina.getHasta().toString());
             
            resultado = ps.executeUpdate();
             
             con.close();
        }catch(SQLException e){
             throw new Exception(e);
        }
    } 
    
    public void eliminarInasistencia(String ci) throws SQLException, Exception{

        try(Connection con = cone.getConnection();
            PreparedStatement ps = (PreparedStatement) con.prepareStatement(SQL_ELIMINAR_INASISTENCIA);) {
            

           String eliminacion = null;
            ps.setString(1, ci);
            int resultado = ps.executeUpdate();

            if (rs.next()) {
                eliminacion = "Inasistencia Eliminada";

            } else {
                eliminacion = "La Inasistencia  que desea eliminar no se encuentra";
            }
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        
}
    
   public List<Inasistencia> traerInasistencias() throws SQLException, Exception{
        List<Inasistencia> listaInasistencias = new ArrayList<>();
        PersistenciaDocente perDoce = new PersistenciaDocente(); 
    
        try(Connection con = cone.getConnection();
            PreparedStatement ps = (PreparedStatement) con.prepareStatement(SQL_LEER_INASISTENCIAS);){
       
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                String ci = rs.getString("Docente");
                String desde = rs.getString("Desde");
                String hasta = rs.getString("Hasta");
            
                Docente docente = perDoce.leerDocente(ci); 
            
                Inasistencia inasistencia = new Inasistencia();
                inasistencia.setDocente(docente); 
                inasistencia.setDesde(LocalDate.parse(desde)); 
                inasistencia.setHasta(LocalDate.parse(hasta)); 
            
                listaInasistencias.add(inasistencia); 
            }
            rs.close();
        
        } catch (SQLException e) {
            System.out.println(e);
            throw new Exception("No se pudieron obtener las inasistencias");
        }
    
        return listaInasistencias; 
    }

}
