package CadenaEs;

public class Recaudo implements InterfaceArea {

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
        if (opcion == 12) {
            System.out.println("Su petición sera atendida por Recaudo\n");
            operando = true;
        } else {
        }
    }
    
    public boolean estado(){
        return operando;
    }
}
