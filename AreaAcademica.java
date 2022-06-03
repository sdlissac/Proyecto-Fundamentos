package CadenaEs;

public class AreaAcademica implements InterfaceArea {

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
        if (opcion == 1 || opcion == 2 || opcion == 3 || opcion == 4 || opcion == 5 || opcion == 6) {
            System.out.println("Su petición sera atendida por el Area Academica");
            this.next.clasificacion(opcion);
            operando = true;
        } else {
            this.next.clasificacion(opcion);
        }
    }
    
    public boolean estado(){
        return operando;
    }
}
