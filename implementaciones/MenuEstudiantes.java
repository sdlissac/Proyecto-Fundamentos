package Implementaciones;

import javax.swing.JOptionPane;

public class MenuEstudiantes extends TipoMenu {

    static private MenuEstudiantes instance = new MenuEstudiantes();

    public static MenuEstudiantes getInstances() {
        if (instance == null) {
            instance = new MenuEstudiantes();
        }
        return instance;
    }

    @Override
    public void elegirMenu() {
        JOptionPane.showMessageDialog(null, "Haz elegido el menu de estudiantes.");
    }
}
