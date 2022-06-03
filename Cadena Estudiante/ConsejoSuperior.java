package CadenaEs;

public class ConsejoSuperior implements InterfaceArea {

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
        if (opcion == 10 || opcion == 11) {
            System.out.println("Su petición sera atendida por el consejo superior\n");
            operando =true;
        } else {
            this.next.clasificacion(opcion);
        }
    }
    
    public boolean estado (){
        return operando;
    }
}
