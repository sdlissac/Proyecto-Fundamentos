package CadenaEs;

public class DirectorPrograma implements InterfaceArea {

    private InterfaceArea next;
    
    private boolean operando = false;

    @Override
    public void setNext(InterfaceArea interfaceArea) {
        this.next = interfaceArea;
    }

    @Override
    public InterfaceArea getNext() {
        return this.next;
    }

    @Override
    public void clasificacion(int opcion) {
        if (opcion == 5 || opcion == 6) {
            System.out.println("Su petición sera atendida por el Director del Programa\n");
            operando = true;
        } else {
            this.next.clasificacion(opcion);
        }
    }
    
    public boolean estado(){
        return operando;
    }
}
