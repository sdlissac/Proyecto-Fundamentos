package CadenaEg;

public class UniversidadEg implements InterfaceAreaEg {

    private InterfaceAreaEg next;

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
        AreaAcademica areaAcademica = new AreaAcademica();
        Docente docente = new Docente();
        ProfesorConsejero profesorConsejero = new ProfesorConsejero();
        DirectorPrograma directorPrograma = new DirectorPrograma();
        Decano decano = new Decano();
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
        decano.setNext(consejoSuperior);
        consejoSuperior.setNext(areaFinanciera);
        areaFinanciera.setNext(recaudo);
        this.next.clasificacion1(opcion);
    }
}
