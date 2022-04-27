package CadenaResponsabilidad;

public class Coordinador implements UsuarioCadena{

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
        if (opcion == 5 || opcion == 8) {
            System.out.println("Su peticion sera leida por un coordinador");
        } else {
            System.out.println("Tu peticion no puede ser atentida por un coordinador");
            this.next.clasificacion(opcion);
        }
    }

}