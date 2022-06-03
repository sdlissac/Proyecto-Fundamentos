package Main;

import Abstracciones.Egresado;
import Abstracciones.Estudiante;
import Abstracciones.Usuario;
import CadenaEs.UniversidadEs;
import CadenaEg.UniversidadEg;
import Implementaciones.MenuEgresados;
import Implementaciones.MenuEstudiantes;
import java.awt.HeadlessException;
import javax.swing.JOptionPane;


//Clase main con el metodo main donde se llamaran las diferentes clases del software< 

public class Bridge {

    public static void opcionMenu() {

        Usuario usuario;
        UniversidadEs universidadEs = new UniversidadEs();
        universidadEs.getNext();
        UniversidadEg universidadEg = new UniversidadEg();
        int opcion;
        String[] botones = {"Estudiante", "Egresado"};
        opcion = JOptionPane.showOptionDialog(null, "¿Elige una opción?", "Menu principal", 0, JOptionPane.QUESTION_MESSAGE, null, botones, "");
        switch (opcion) {
            case 0: {
                usuario = new Estudiante(MenuEstudiantes.getInstances());
                usuario.elegirUsuario();
                try {
                    do {
                        opcion = Integer.parseInt(JOptionPane.showInputDialog("Menu de peticiones ESTUDIANTE\n"
                                + "\n1. Solicitar material para una practica."
                                + "\n2. Problemas de conducta."
                                + "\n3. Permiso para faltar a una clase"
                                //docente
                                + "\n4. Ayuda para una dificultad de alguna materia."
                                //consejero
                                + "\n5. Daño a un material/elementos de la universidad."
                                + "\n6. Solicitar creditos adicionales."
                                //director del programa
                                //academico

                                + "\n7. Solicitar segunda calificación."
                                //decano
                                + "\n8. Ayuda para cambiar el horario."
                                + "\n9. Cancelar una materia."
                                //Rectoria
                                + "\n10. Solicitar certificado."
                                + "\n11. Solicitar beca."
                                //consejosuperior
                                //administrativo

                                + "\n12. Solicitar un descuento."
                                //recaudo
                                //financiero

                                + "\n13. Finalizar programa"
                                + "\n"
                                + "\nDigita una opcion: "));
                        try {
                            if (opcion != 13) {
                                universidadEs.clasificacion(opcion);
                                if (opcion <= 0) {
                                    System.out.println("Usted cometió un error, vuelva a intentarlo.\n");
                                }
                                if (opcion > 13) {
                                    System.out.println("Usted cometió un error, vuelva a intentarlo.\n");
                                }
                            }
                        } catch (Exception e) {
                            JOptionPane.showMessageDialog(null, "El programa solo permite numeros enteros.");
                        }
                    } while (opcion != 13);
                    System.out.println("Programa finalizado con exito.....");
                } catch (HeadlessException | NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Error " + e);
                }
                break;
            }
            case 1:
                usuario = new Egresado(MenuEgresados.getInstances());
                usuario.elegirUsuario();
                try {
                    do {
                        opcion = Integer.parseInt(JOptionPane.showInputDialog("Menu de peticiones EGRESADO\n"
                                + "\n1. Certificado de notas."
                                //docente
                                + "\n2. Solicitar carnet de egresado."
                                //profesorconsejero
                                + "\n3. Solicitar contenidos programáticos."
                                //director del programa
                                //academico

                                + "\n4. Solicitud de validaciones de títulos/ validaciones académicas ."
                                //decano
                                + "\n5. Solicitud de Certificados académicos."
                                //Rectoria
                                + "\n6. Duplicado del diploma de grado."
                                //consejosuperior
                                //administrativo

                                + "\n7. Solicitar Paz y Salvo."
                                //recaudo
                                //financiero
                                + "\n8. Finalizar programa"
                                + "\n"
                                + "\nDigita una opcion: "));
                        
                        try {
                            if (opcion != 8) {
                                universidadEg.clasificacion1(opcion);
                                if (opcion <= 0) {
                                    System.out.println("Usted cometió un error, vuelva a intentarlo.\n");
                                }
                                if (opcion > 8) {
                                    System.out.println("Usted cometió un error, vuelva a intentarlo.\n");
                                }
                            }
                        } catch (Exception e) {
                            JOptionPane.showMessageDialog(null, "El programa solo permite numeros enteros.");
                        }   
                    } while (opcion != 8);
                    System.out.println("Programa finalizado con exito.....");
                } catch (HeadlessException | NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Error " + e);
                }
                break;
        }
    }

    public static void main(String[] args) {
        opcionMenu();
    }
}
