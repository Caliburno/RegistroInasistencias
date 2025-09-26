package com.mycompany.registroinasistencias.Main;

import com.mycompany.registroinasistencias.GUI.RegistroInasistencias;
import com.mycompany.registroinasistencias.GUI.OpcionesDeCuenta;
import com.mycompany.registroinasistencias.GUI.CrearCuenta;
import com.mycompany.registroinasistencias.GUI.Display;
import com.mycompany.registroinasistencias.GUI.Login;
import com.mycompany.registroinasistencias.GUI.MenuPrincipal;
import com.mycompany.registroinasistencias.GUI.RegistroDocentes;

public class AbsentAppMain {
    public static void main(String[] args){
        RegistroInasistencias absenceRegistry = new RegistroInasistencias();
        OpcionesDeCuenta accountOptions = new OpcionesDeCuenta();
        CrearCuenta createAccount = new CrearCuenta();
        Display display = new Display();
        Login login = new Login();
        MenuPrincipal mainMenu = new MenuPrincipal();
        RegistroDocentes teacherRegistry = new RegistroDocentes();
     
        mainMenu.setAccountOptions(accountOptions);
        mainMenu.setAbsenceRegistry(absenceRegistry);
        mainMenu.setTeacherRegistry(teacherRegistry);
        mainMenu.setDisplay(display);
        accountOptions.setMainMenu(mainMenu);
        accountOptions.setCreateAccount(createAccount);
        absenceRegistry.setMainMenu(mainMenu);
        absenceRegistry.setDisplay(display);
        createAccount.setAccountOptions(accountOptions);
        createAccount.setLogin(login);
        login.setMainMenu(mainMenu);
        login.setCreateAccount(createAccount);
        login.setDisplay (display);
        teacherRegistry.setMainMenu(mainMenu);
        
        login.setVisible(true);
        
    }
}
