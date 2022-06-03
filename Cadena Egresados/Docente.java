package CadenaEg;

public class Docente implements InterfaceAreaEg{
    
    private InterfaceAreaEg next;
    
    private boolean operando = false;
    
    @Override
    public void setNext(InterfaceAreaEg InterfaceAreaEg){
        this.next = InterfaceAreaEg;
    }

    @Override
    public InterfaceAreaEg getNext() {
        return this.next;
    }

    @Override
    public void clasificacion1(int opcion) {
        if (opcion == 1) {
            System.out.println("Su petición sera atendida por un Docente\n");
            operando = true;
        } else {
            this.next.clasificacion1(opcion);
        }
    }
    
    public boolean estado(){
        return operando;
    }
}
