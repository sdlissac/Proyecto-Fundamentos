package CadenaResponsabilidad;

public class Consejero implements UsuarioCadena{

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
        if (opcion == 4) {
            System.out.println("Su peticion sera leida por un consejero");
        } else {
            System.out.println("Tu peticion no puede ser atentida por un consejero");
            this.next.clasificacion(opcion);
        }
    }

}