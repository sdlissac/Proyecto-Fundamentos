package CadenaEs;

import Implementaciones.MenuEstudiantes;
import static org.junit.Assert.*;

public class DocenteTest {

    public void testSingleton() {
        MenuEstudiantes result = MenuEstudiantes.getInstances();
        MenuEstudiantes result2 = MenuEstudiantes.getInstances();
        System.out.println("checking singleton objects equality");
        assertEquals(true, result == result2);
    }

    public void testCadenaResponsabilidad() {
        ProfesorConsejero profesorConsejero = new ProfesorConsejero();
        profesorConsejero.clasificacion(4);
        boolean valorEsperado = true, valorResultado = profesorConsejero.estado();
        assertEquals(true, valorEsperado == valorResultado);
    }

}
