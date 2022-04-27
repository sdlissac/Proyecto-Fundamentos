package Implementaciones;

import javax.swing.JOptionPane;

public class Monitor extends InterfazRol{

    static private Monitor instance = new Monitor();
    
    private Monitor(){}
    
    public static Monitor getIntance(){
        if (instance == null){
            instance = new Monitor();
        }return instance;
    }
    
    @Override
    public void elegirRol() {
       JOptionPane.showMessageDialog(null, "Eres un estudiante monitor\nDigita la opción de tu petición");
    }
}