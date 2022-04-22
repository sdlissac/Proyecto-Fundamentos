package Implementaciones;

public abstract class IntefazRol {
    protected Normal normal;
    protected Representante representante;
    protected Monitor monitor;
    protected Directores directores;
    protected Decanos decanos;
    protected Coordinador coordinador;
    protected Consejero consejero;
    
    public IntefazRol(){
        normal = null;
        representante = null;
        monitor = null;
        directores = null;
        decanos = null; 
        coordinador = null; 
        consejero = null;
    }
    
    public abstract void normal1();
    public abstract void representante1();
    public abstract void monitor1();
    public abstract void directores1();
    public abstract void decanos1();
    public abstract void coordinador1();
    public abstract void consejero1();
}