package com.mycompany.registroinasistencias.Main;
import com.mycompany.registroinasistencias.GUI.AbsenceRegistry;
import com.mycompany.registroinasistencias.GUI.CreateAccount;
import com.mycompany.registroinasistencias.GUI.Display;
import com.mycompany.registroinasistencias.GUI.Login;
import com.mycompany.registroinasistencias.GUI.MainMenu;
import com.mycompany.registroinasistencias.GUI.TeacherRegistry;
/**
 *
 * @author massi
 */
public class AbsentAppMain {
    public static void main(String[] args){
        AbsenceRegistry absenceRegistry = new AbsenceRegistry();
        CreateAccount createAccount = new CreateAccount();
        Display display = new Display();
        Login login = new Login();
        MainMenu mainMenu = new MainMenu();
        TeacherRegistry teacherRegistry = new TeacherRegistry();
        
        mainMenu.setAbsenceRegistry(absenceRegistry);
        mainMenu.setTeacherRegistry(teacherRegistry);
        mainMenu.setDisplay(display);
        absenceRegistry.setMainMenu(mainMenu);
        absenceRegistry.setDisplay(display);
        createAccount.setLogin(login);
        login.setMainMenu(mainMenu);
        login.setCreateAccount(createAccount);
        login.setDisplay (display);
        teacherRegistry.setMainMenu(mainMenu);
        
        login.setVisible(true);
        
    }
}
