package CadenaResponsabilidad;

public class Representante implements UsuarioCadena {

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
        if (opcion == 2) {
            System.out.println("Su peticion sera leida por un representante");
        } else {
            System.out.println("Tu peticion no puede ser atentida por un representante");
            this.next.clasificacion(opcion);
        }
    }

}
