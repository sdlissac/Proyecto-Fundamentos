package Abstracciones;

import Implementaciones.Monitor;
import Implementaciones.Normal;
import Implementaciones.Representante;

public class Estudiante extends Usuario{
    
    public Estudiante(Normal normal){
        super(normal);
    }
    public Estudiante(Representante representante){
        super(representante);
    }
    public Estudiante(Monitor monitor){
        super(monitor);
    }
    
    @Override
    public void normal1() {
        EstudianteNormal(this);
    }

    @Override
    public void representante1() {
        EstudianteRepresentante(this);
    }

    @Override
    public void monitor1() {
        EstudianteMonitor(this);
    }
}