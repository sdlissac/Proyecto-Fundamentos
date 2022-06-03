package Abstracciones;

import Implementaciones.TipoMenu;

/*
Se crea una clase abstracta Usuario que funcionara como una clase 
que declarará la existencia de métodos pero no su implementación
 */
public abstract class Usuario {

    //Atributo de tipo menu
    protected TipoMenu tipoMenu;

    //Constructor
    public Usuario(TipoMenu tipoMenu) {
        this.tipoMenu = tipoMenu;
    }

    //Metodo constructor
    public abstract void elegirUsuario();

    //Metodos
    
    public void opcionEstudiante(Estudiante usuario) {
        tipoMenu.elegirMenu();
    }

    public void opcionEgresado(Egresado usuario) {
        tipoMenu.elegirMenu();
    }
}
