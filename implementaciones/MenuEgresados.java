package Implementaciones;

import javax.swing.JOptionPane;

public class MenuEgresados extends TipoMenu {

    static private MenuEgresados instance = new MenuEgresados();

    public static MenuEgresados getInstances() {
        if (instance == null) {
            instance = new MenuEgresados();
        }
        return instance;
    }

    @Override
    public void elegirMenu() {
        JOptionPane.showMessageDialog(null, "Haz elegido el menu de egresados..");
    }

}
