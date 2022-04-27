package CadenaResponsabilidad;

public class Monitor implements UsuarioCadena {

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
        if (opcion == 1) {
            System.out.println("Su peticion sera leida por un monitor");
        } else {
            System.out.println("Tu peticion no puede ser atentida por un monitor");
            this.next.clasificacion(opcion);
        }
    }

}
