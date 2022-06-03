package Abstracciones;

import Implementaciones.TipoMenu;

//Egresado hereda de mi clase abstracta Usuario
public class Egresado extends Usuario {

    //Constructor
    public Egresado(TipoMenu tipoMenu) {
        super(tipoMenu);
    }

    //Sobrescritura del metodo elegir usuario
    @Override
    public void elegirUsuario() {
        opcionEgresado(this);
    }

}
