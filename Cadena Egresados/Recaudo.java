package CadenaEg;

public class Recaudo implements InterfaceAreaEg {

    private InterfaceAreaEg next;
    private boolean operando = false;

    @Override
    public void setNext(InterfaceAreaEg InterfaceAreaEg) {
        this.next = InterfaceAreaEg;
    }

    @Override
    public InterfaceAreaEg getNext() {
        return this.next;
    }

    @Override
    public void clasificacion1(int opcion) {
        if (opcion == 7) {
            System.out.println("Su petición sera atendida por Recaudo\n");
            operando = true;
        } else {
            System.out.println("Tu peticion no puede ser atendita");
        }
    }
    
    public boolean estado(){
        return operando;
    }
}
