package CadenaEs;

public class UniversidadEs implements InterfaceArea {

    private InterfaceArea next;

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
        AreaAcademica areaAcademica = new AreaAcademica();
        Docente docente = new Docente();
        ProfesorConsejero profesorConsejero = new ProfesorConsejero();
        DirectorPrograma directorPrograma = new DirectorPrograma();
        Decano decano = new Decano();
        Rectoria rectoria = new Rectoria();
        ConsejoSuperior consejoSuperior = new ConsejoSuperior();
        Recaudo recaudo = new Recaudo();
        AreaAdministrativa areaAdministrativa = new AreaAdministrativa();
        AreaFinanciera areaFinanciera = new AreaFinanciera();
        
        this.next = areaAcademica;
        areaAcademica.setNext(docente);
        docente.setNext(profesorConsejero);
        profesorConsejero.setNext(directorPrograma);
        directorPrograma.setNext(areaAdministrativa);
        areaAdministrativa.setNext(decano);
        decano.setNext(rectoria);
        rectoria.setNext(consejoSuperior);
        consejoSuperior.setNext(areaFinanciera);
        areaFinanciera.setNext(recaudo);
        this.next.clasificacion(opcion);

    }
}
