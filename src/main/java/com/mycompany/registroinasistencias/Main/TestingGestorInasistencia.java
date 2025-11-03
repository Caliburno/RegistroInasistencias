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
        Grupo grupo1A = new Grupo();
        grupo1A.setNombreGrupo("1°A");
        Grupo grupo2B = new Grupo();
        grupo2B.setNombreGrupo("2°B");
        Grupo grupo3C = new Grupo();
        grupo3C.setNombreGrupo("3°C");
        
        // 2. Crear asignaturas para un docente
        ArrayList<Asignatura> asignaturas = new ArrayList<>();
        
        // El docente da clases los lunes, miércoles y viernes
        Asignatura matematica1A_lunes = new Asignatura();
        matematica1A_lunes.setNombreAsignatura("Matemática");
        matematica1A_lunes.setGrupo(grupo1A);
        matematica1A_lunes.setDia(DayOfWeek.MONDAY);
        matematica1A_lunes.setTurno(Turno.MATUTINO);
        
        Asignatura historia2B_miercoles = new Asignatura();
        historia2B_miercoles.setNombreAsignatura("Historia");
        historia2B_miercoles.setGrupo(grupo2B);
        historia2B_miercoles.setDia(DayOfWeek.WEDNESDAY);
        historia2B_miercoles.setTurno(Turno.VESPERTINO);
        
        Asignatura fisica3C_viernes = new Asignatura();
        fisica3C_viernes.setNombreAsignatura("Física");
        fisica3C_viernes.setGrupo(grupo3C);
        fisica3C_viernes.setDia(DayOfWeek.FRIDAY);
        fisica3C_viernes.setTurno(Turno.MATUTINO);
        
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