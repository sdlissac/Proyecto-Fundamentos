package CadenaResponsabilidad;

public class Universidad implements UsuarioCadena {

    private UsuarioCadena next;

    @Override
    public void setNext(UsuarioCadena usuarioCadena) {
        this.next = usuarioCadena;
    }

    @Override
    public UsuarioCadena getNext() {
        return this.next;
    }

    @Override
    public void clasificacion(int opcion) {
        Monitor monitor = new Monitor();
        Representante representante = new Representante();
        ProfesorNormal profesorNormal = new ProfesorNormal();
        Consejero consejero = new Consejero();
        Coordinador coordinador = new Coordinador();
        Decano decano = new Decano();
        Director director = new Director();
        
        this.next = monitor;
        monitor.setNext(representante);
        representante.setNext(profesorNormal);
        profesorNormal.setNext(consejero);
        consejero.setNext(coordinador);
        coordinador.setNext(decano);
        decano.setNext(director);
        director.setNext(monitor);
        this.next.clasificacion(opcion);
        
    }

}
