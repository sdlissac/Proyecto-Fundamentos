package CadenaEg;

public class AreaAdministrativa implements InterfaceAreaEg{
    
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
        if (opcion == 4 || opcion == 5 || opcion == 6) {
            System.out.println("Su petición sera atendida por el Area Administrativa");
            this.next.clasificacion1(opcion);
            operando = true;
        } else {
            this.next.clasificacion1(opcion);
        }
    }
    
    public boolean estado(){
        return operando;
    }
}
