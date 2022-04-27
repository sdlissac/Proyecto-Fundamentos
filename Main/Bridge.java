package Main;

import Abstracciones.Estudiante;
import Abstracciones.Usuario;
import CadenaResponsabilidad.Universidad;
import Implementaciones.Monitor;
import Implementaciones.Normal;
import Implementaciones.Representante;
import javax.swing.JOptionPane;

public class Bridge {

    public static void opcionMenu() {
        Usuario usuario;
        Universidad universidad = new Universidad();
        int opcion;
        String[] botones = {"Normal", "Monitor", "Representante"};
        opcion = JOptionPane.showOptionDialog(null, "¿Que tipo de estudiante eres?", "Menu principal", 0, JOptionPane.QUESTION_MESSAGE, null, botones, "Representante");
        switch (opcion) {
            case 0:
                usuario = new Estudiante(Normal.getIntance());
                usuario.elegirUsuario();
                try {
                    do {
                        opcion = Integer.parseInt(JOptionPane.showInputDialog("Menu de peticiones\n"
                                + "\n1. Solicitar material para una practica."
                                + "\n2. Daño a un material/elementos de la universidad."
                                + "\n3. Ayuda para una dificultad de alguna materia."
                                + "\n4. Ayuda para cambiar el horario."
                                + "\n5. Problemas de conducta."
                                + "\n6. Solicitar segunda calificacion."
                                + "\n7. Solicitar un descuento."
                                + "\n8. Cancelar materia"
                                + "\n9. Solicitar beca"
                                + "\n10. Finalizar programa"
                                + "\n"
                                + "\n"));
                        if (opcion != 10) {
                            universidad.clasificacion(opcion);
                        }
                    } while (opcion != 10);
                    System.out.println("Programa finalizado con exito.....");
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Error " + e);
                }
                break;
            

            case 1:
                usuario = new Estudiante(Monitor.getIntance());
                usuario.elegirUsuario();
                try {
                    do {
                        opcion = Integer.parseInt(JOptionPane.showInputDialog("Menu de peticiones\n"
                                + "\n1. Solicitar material para una practica."
                                + "\n2. Daño a un material/elementos de la universidad."
                                + "\n3. Ayuda para una dificultad de alguna materia."
                                + "\n4. Ayuda para cambiar el horario."
                                + "\n5. Problemas de conducta."
                                + "\n6. Solicitar segunda calificacion."
                                + "\n7. Solicitar un descuento."
                                + "\n8. Cancelar materia"
                                + "\n9. Solicitar beca"
                                + "\n10. Finalizar programa"
                                + "\n"
                                + "\n"));
                        if (opcion != 10) {
                            universidad.clasificacion(opcion);
                        }
                    } while (opcion != 10);
                    System.out.println("Programa finalizado con exito.....");
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Error " + e);
                }
                break;
            
            case 2:
                usuario = new Estudiante(Representante.getInstances());
                usuario.elegirUsuario();
                try {
                    do {
                        opcion = Integer.parseInt(JOptionPane.showInputDialog("Menu de peticiones\n"
                                + "\n1. Solicitar material para una practica."
                                + "\n2. Daño a un material/elementos de la universidad."
                                + "\n3. Ayuda para una dificultad de alguna materia."
                                + "\n4. Ayuda para cambiar el horario."
                                + "\n5. Problemas de conducta."
                                + "\n6. Solicitar segunda calificacion."
                                + "\n7. Solicitar un descuento."
                                + "\n8. Cancelar materia"
                                + "\n9. Solicitar beca"
                                + "\n10. Finalizar programa"
                                + "\n"
                                + "\n"));
                        if (opcion != 10) {
                            universidad.clasificacion(opcion);
                        }
                    } while (opcion != 10);
                    System.out.println("Programa finalizado con exito.....");
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Error " + e);
                }
                break;

            
            default:
                System.out.println("Programa finalizado con exito....");
            }
    }
   
    public static void main(String[] args) {
        opcionMenu();
    }
}
