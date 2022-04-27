package CadenaResponsabilidad;

public class Decano implements UsuarioCadena{

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
        if (opcion == 6) {
            System.out.println("Su peticion sera leida por un decano");
        } else {
            System.out.println("Tu peticion no puede ser atentida por un decano");
            this.next.clasificacion(opcion);
        }
    }

}