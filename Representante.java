package Implementaciones;

import javax.swing.JOptionPane;

public class Representante extends InterfazRol{

    static private Representante instance = new Representante();
    
    private Representante(){}
    
    public static Representante getInstances(){
        if (instance == null){
        instance = new Representante();
        }return instance;
    }
    @Override
    public void elegirRol() {
       JOptionPane.showMessageDialog(null, "Eres un estudiante representante\nDigita la opción de tu petición");
    }
    
}
