package com.mycompany.registroinasistencias.Main;

import com.mycompany.registroinasistencias.Logica.Asignatura;
import com.mycompany.registroinasistencias.Logica.Docente;
import com.mycompany.registroinasistencias.Logica.GestorInasistencia;
import com.mycompany.registroinasistencias.Logica.Grupo;
import com.mycompany.registroinasistencias.Logica.Horario;
import com.mycompany.registroinasistencias.Logica.Inasistencia;
import com.mycompany.registroinasistencias.Logica.Turno;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class TestingGestorInasistencia {
    public static void main(String[] args) {
        testearGestorInasistencia();
    }
    
    public static void testearGestorInasistencia() {
        System.out.println("=== TESTING GESTOR DE INASISTENCIAS ===\n");
        
        // 1. Crear grupos
        Grupo grupo1A = new Grupo("1°A", Turno.MATUTINO, new ArrayList<>());
        Grupo grupo2B = new Grupo("2°B", Turno.VESPERTINO, new ArrayList<>());
        Grupo grupo3C = new Grupo("3°C", Turno.MATUTINO, new ArrayList<>());
        
        // 2. Crear asignaturas
        Asignatura matematica = new Asignatura("Matemática", new ArrayList<>());
        Asignatura historia = new Asignatura("Historia", new ArrayList<>());
        Asignatura fisica = new Asignatura("Física", new ArrayList<>());
        
        // 3. Crear docente
        List<Horario> horariosDocente = new ArrayList<>();
        List<Inasistencia> inasistenciasDocente = new ArrayList<>();
        Docente docente = new Docente(12345678, "Juan Pérez", "juan.perez@email.com", 
                                     99123456, "Licenciado", inasistenciasDocente, horariosDocente);
        
        // 4. Crear horarios para el docente
        // El docente da clases los lunes, miércoles y viernes
        Horario horario1 = new Horario(1, DayOfWeek.MONDAY, LocalTime.of(8, 0), 
                                      docente, matematica, grupo1A, Turno.MATUTINO);
        Horario horario2 = new Horario(2, DayOfWeek.WEDNESDAY, LocalTime.of(14, 0), 
                                      docente, historia, grupo2B, Turno.VESPERTINO);
        Horario horario3 = new Horario(3, DayOfWeek.FRIDAY, LocalTime.of(9, 0), 
                                      docente, fisica, grupo3C, Turno.MATUTINO);
        
        // Agregar horarios al docente
        horariosDocente.add(horario1);
        horariosDocente.add(horario2);
        horariosDocente.add(horario3);
        
        // Establecer las relaciones bidireccionales
        grupo1A.getHorarios().add(horario1);
        grupo2B.getHorarios().add(horario2);
        grupo3C.getHorarios().add(horario3);
        
        matematica.getHorarios().add(horario1);
        historia.getHorarios().add(horario2);
        fisica.getHorarios().add(horario3);
        
        System.out.println("Docente creado: " + docente.getName());
        System.out.println("CI: " + docente.getCi());
        System.out.println("Horarios del docente:");
        for(Horario horario : docente.getHorarios()) {
            System.out.println("- " + horario.getAnAsignatura().getNombreAsignatura() + 
                             " en grupo " + horario.getaGrupo().getName() + 
                             " los " + horario.getDiaSemana() + 
                             " a las " + horario.getHora());
        }
        System.out.println();
        
        // 5. Crear inasistencia que cubra varios días
        // Por ejemplo: falta desde el lunes 16 de septiembre hasta el viernes 20 de septiembre de 2024
        LocalDate desde = LocalDate.of(2024, 9, 16); // Lunes
        LocalDate hasta = LocalDate.of(2024, 9, 20);  // Viernes
        
        Inasistencia inasistencia = new Inasistencia(1, docente, false, desde, hasta, null, null);
        
        System.out.println("Inasistencia creada:");
        System.out.println("Desde: " + inasistencia.getFechaDesde());
        System.out.println("Hasta: " + inasistencia.getFechaHasta());
        System.out.println("Es parcial: " + inasistencia.isIsParcial());
        System.out.println();
        
        // 6. Testear el GestorInasistencia
        GestorInasistencia gestor = new GestorInasistencia();
        ArrayList<Grupo> gruposAfectados = gestor.calcularGruposAfectados(inasistencia);
        
        // 7. Mostrar resultados
        System.out.println("=== RESULTADOS ===");
        System.out.println("Grupos afectados por la inasistencia:");
        
        if(gruposAfectados.isEmpty()) {
            System.out.println("No hay grupos afectados.");
        } else {
            for(Grupo grupo : gruposAfectados) {
                System.out.println("- " + grupo.getName() + " (Turno: " + grupo.getTurno() + ")");
            }
        }
        
        System.out.println("\nTotal de grupos afectados: " + gruposAfectados.size());
        
        // 8. Mostrar análisis detallado
        System.out.println("\n=== ANÁLISIS DETALLADO ===");
        LocalDate fechaAnalisis = desde;
        while (!fechaAnalisis.isAfter(hasta)) {
            DayOfWeek diaAnalisis = fechaAnalisis.getDayOfWeek();
            System.out.println("Día " + fechaAnalisis + " (" + diaAnalisis + "):");
            
            boolean tieneClases = false;
            for(Horario horario : docente.getHorarios()) {
                if(horario.getDiaSemana().equals(diaAnalisis)) {
                    System.out.println("  - " + horario.getAnAsignatura().getNombreAsignatura() + 
                                     " con " + horario.getaGrupo().getName() + 
                                     " a las " + horario.getHora());
                    tieneClases = true;
                }
            }
            if(!tieneClases) {
                System.out.println("  - Sin clases programadas");
            }
            
            fechaAnalisis = fechaAnalisis.plusDays(1);
        }
    }
}