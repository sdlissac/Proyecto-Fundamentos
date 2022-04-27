package Implementaciones;

import javax.swing.JOptionPane;

public class Normal extends InterfazRol{

    static private Normal instance = new Normal();
    
    private Normal(){}
    
    public static Normal getIntance(){
        if (instance == null){
            instance = new Normal();
        }return instance;
    }
    
    @Override
    public void elegirRol() {
       JOptionPane.showMessageDialog(null, "Eres un estudiante normal\nDigita la opción de tu petición");
    }    
  
}
