package CadenaResponsabilidad;

public class ProfesorNormal implements UsuarioCadena{

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
        if (opcion == 3) {
            System.out.println("Su peticion sera leida por un profesor normal");
        } else {
            System.out.println("Tu peticion no puede ser atentida por un profesor normal");
            this.next.clasificacion(opcion);
        }
    }

}