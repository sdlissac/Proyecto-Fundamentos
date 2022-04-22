package Abstracciones;

import Implementaciones.Consejero;
import Implementaciones.Coordinador;
import Implementaciones.Decanos;
import Implementaciones.Directores;
import Implementaciones.Monitor;
import Implementaciones.Normal;
import Implementaciones.Representante;

public abstract class Usuario {
    
    protected Normal normal;
    protected Representante representante;
    protected Monitor monitor;
    protected Directores directores;
    protected Decanos decanos;
    protected Coordinador coordinador;
    protected Consejero consejero;
    
    public Usuario (Normal normal){
        this.normal = normal;
    }
    public abstract void normal1();
    
    public Usuario (Representante representante){
        this.representante = representante;
    }
    public abstract void representante1();
    
    public Usuario (Monitor monitor){
        this.monitor = monitor;
    }
    public abstract void monitor1();
        
    public void EstudianteNormal(Estudiante usuario){
        normal.normal1();
    }
    public void EstudianteRepresentante(Estudiante usuario){
        representante.representante1();
    }
    public void EstudianteMonitor(Estudiante usuario){
        monitor.monitor1();
    }
    
    /*public void Usuario (Directores directores){
        this.directores = directores;
    }
    public abstract void directores1();
    
    public void Usuario (Decanos decanos){
        this.decanos = decanos;
    }
    public abstract void decanos1();
    
    public void Usuario (Coordinador coordinador){
        this.coordinador = coordinador;
    }
    public abstract void coordinadores1();
    
    public void Usuario (Consejero consejero){
        this.consejero = consejero;
    }
    public abstract void consejero1();*/
    
}