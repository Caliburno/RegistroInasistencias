package com.mycompany.registroinasistencias.Main;

import com.mycompany.registroinasistencias.Logica.Asignatura;
import com.mycompany.registroinasistencias.Logica.Docente;
import com.mycompany.registroinasistencias.Logica.GestorInasistencia;
import com.mycompany.registroinasistencias.Logica.Grupo;
import com.mycompany.registroinasistencias.Logica.Inasistencia;
import com.mycompany.registroinasistencias.Logica.Turno;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.ArrayList;

public class TestingGestorInasistencia {
     public static void main(String[] args) {
        
         testearGestorInasistencia();
    }
    
    public static void testearGestorInasistencia() {
        System.out.println("=== TESTING GESTOR DE INASISTENCIAS ===\n");
        
        // 1. Crear grupos
        Grupo grupo1A = new Grupo("1°A");
        Grupo grupo2B = new Grupo("2°B");
        Grupo grupo3C = new Grupo("3°C");
        
        // 2. Crear asignaturas para un docente
        ArrayList<Asignatura> asignaturas = new ArrayList<>();
        
        // El docente da clases los lunes, miércoles y viernes
        Asignatura matematica1A_lunes = new Asignatura("Matemática", grupo1A, DayOfWeek.MONDAY, Turno.MATUTINO);
        Asignatura historia2B_miercoles = new Asignatura("Historia", grupo2B, DayOfWeek.WEDNESDAY, Turno.VESPERTINO);
        Asignatura fisica3C_viernes = new Asignatura("Física", grupo3C, DayOfWeek.FRIDAY, Turno.MATUTINO);
        
        asignaturas.add(matematica1A_lunes);
        asignaturas.add(historia2B_miercoles);
        asignaturas.add(fisica3C_viernes);
        
        // 3. Crear docente
        Docente docente = new Docente("Juan Pérez", 12345678, asignaturas);
        
        System.out.println("Docente creado: " + docente.getNombreDocente());
        System.out.println("Asignaturas del docente:");
        for(Asignatura asig : docente.getAsignaturas()) {
            System.out.println("- " + asig.getNombreAsignatura() + " en grupo " + 
                             asig.getGrupo().getNombreGrupo() + " los " + asig.getDia());
        }
        System.out.println();
        
        // 4. Crear inasistencia que cubra varios días
        // Por ejemplo: falta desde el lunes 16 de septiembre hasta el viernes 20 de septiembre de 2024
        LocalDate desde = LocalDate.of(2024, 9, 16); // Lunes
        LocalDate hasta = LocalDate.of(2024, 9, 20);  // Viernes
        
        Inasistencia inasistencia = new Inasistencia(docente, desde, hasta);
        
        System.out.println("Inasistencia creada:");
        System.out.println("Desde: " + inasistencia.getDesde());
        System.out.println("Hasta: " + inasistencia.getHasta());
        System.out.println();
        
        // 5. Testear el GestorInasistencia
        GestorInasistencia gestor = new GestorInasistencia();
        ArrayList<Grupo> gruposAfectados = gestor.calcularGruposAfectados(inasistencia);
        
        // 6. Mostrar resultados
        System.out.println("=== RESULTADOS ===");
        System.out.println("Grupos afectados por la inasistencia:");
        
        if(gruposAfectados.isEmpty()) {
            System.out.println("No hay grupos afectados.");
        } else {
            for(Grupo grupo : gruposAfectados) {
                System.out.println("- " + grupo.getNombreGrupo());
            }
        }
        
        System.out.println("\nTotal de grupos afectados: " + gruposAfectados.size());
    }
}
