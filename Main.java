package Main;

import Abstracciones.Estudiante;
import Abstracciones.Usuario;
import Implementaciones.Monitor;
import Implementaciones.Normal;
import Implementaciones.Representante;
import java.util.Scanner;

public class Main {
    
    
    public static void main (String [] args){
        
        
            Usuario usuario;
            Scanner sc = new Scanner (System.in);
            int opcion =0;

            System.out.println("BIENVENIDO LIBERTADOR\n"
                    + "Ingrese su usuario: "
                    + "\n1. Estudiante\n"
                    + "2. Administrativo\n"
                    + "3. Docente");
            opcion = sc.nextInt();
            switch (opcion){
                case 1:
                    System.out.println("\n¿Qué rol como estudiante tiene?\n"
                            + "1. Normal\n"
                            + "2. Representante\n"
                            + "3. Monitor");
                    opcion = sc.nextInt();
                    switch (opcion){
                        case 1:
                            usuario = new Estudiante(new Normal());
                            usuario.normal1();
                            break;
                        case 2:
                            usuario = new Estudiante (new Representante());
                            usuario.representante1();
                            break;
                        case 3:
                            usuario = new Estudiante (new Monitor());
                            usuario.monitor1();
                            break;
                    }
                /*case 2:
                    System.out.println("\n¿Qué rol tiene como Administrativo?\n"
                            + "1. ....\n"
                            + "2. ....\n"
                            + "3. ....\n"
                            + "4. ....");
                    opcion = sc.nextInt();
                    /*switch (opcion){
                        case 1:
                            usuario = new Estudiante(new Normal());
                            usuario.normal1();
                            break;
                        case 2:
                            usuario = new Estudiante (new Representante());
                            usuario.representante1();
                            break;
                        case 3:
                            usuario = new Estudiante (new Monitor());
                            usuario.monitor1();
                            break;
                    }
                case 3:
                    System.out.println("\n¿Qué rol tiene como Docente?\n"
                            + "1. ....\n"
                            + "2. ....\n"
                            + "3. ....\n"
                            + "4. ....");
                    opcion = sc.nextInt();
                    /*switch (opcion){
                        case 1:
                            usuario = new Estudiante(new Normal());
                            usuario.normal1();
                            break;
                        case 2:
                            usuario = new Estudiante (new Representante());
                            usuario.representante1();
                            break;
                        case 3:
                            usuario = new Estudiante (new Monitor());
                            usuario.monitor1();
                            break;
                    }*/
            }
        }
    }