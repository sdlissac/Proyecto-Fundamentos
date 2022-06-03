package Abstracciones;

import Implementaciones.TipoMenu;

//Estudiante hereda de mi clase abstracta Usuario
public class Estudiante extends Usuario{

    //Constructor
    public Estudiante(TipoMenu tipoMenu){
        super(tipoMenu);
    }
    
    //Sobrescritura del metodo elegir usuario
    @Override
    public void elegirUsuario() {
        opcionEstudiante(this);
    }
    
}
