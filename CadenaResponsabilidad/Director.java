package CadenaResponsabilidad;

public class Director implements UsuarioCadena{

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
        if (opcion == 7 || opcion == 9) {
            System.out.println("Su peticion sera leida por un director");
        } else {
            System.out.println("Tu peticion no puede ser atentida por un director");
            this.next.clasificacion(opcion);
        }
    }

}