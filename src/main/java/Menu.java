import Desastresnaturales.Geofisicos;

import java.util.Scanner;

public class Menu {
        public static void iniciarPrograma() {
            boolean a;
            do {
                menuPrincipal();
                a = opcionSeleccionada(ingresarRespuesta());
            } while (!a);
        }

        public static String ingresarRespuesta() {
            Scanner teclado = new Scanner(System.in);
            return teclado.next();
        }

        public static void menuPrincipal() {
            System.out.println("**********************************************************");
            System.out.println("*             Bienvenido            *");
            System.out.println("**********************************************************");
            System.out.println("Por favor, seleccione una de las opcíones");
            System.out.println("[1] Ver Desastres Geológicos");
            System.out.println("[2] Ver Desastres Climatológicos");
            System.out.println("[3] Ver Desastres Meteorológicos");
            System.out.println("[4] Ver Desastres Biológicos");
            System.out.println("[5] Salir");
        }

        public static boolean salir() {
            boolean a = true;
            int b = 0;
            do {
                String respuesta = ingresarRespuesta();
                switch (respuesta) {
                    case "1":
                        System.out.println("Gracias por ocupar el programa ");
                        a = true;
                        b = 1;
                        break;
                    case "2":
                        a = false;
                        b = 2;
                        break;
                    default:
                        System.out.println("Ingrese una opcion valida");
                        b = 0;
                        break;
                }
            } while (b == 0);
            return a;
        }

        public static void textoSalida() {
            System.out.println("[1] Si");
            System.out.println("[2] No");
        }

        public static boolean opcionSeleccionada(String ingresoDatos) {
            boolean a = false;
            switch (ingresoDatos) {
                case "1" -> {
                    do {
                        Geofisicos l = new Geofisicos();
                        System.out.println("Agregar Productos");
                        a = true;
                        System.out.println("¿Desea ver otro ?");
                        textoSalida();
                        a = salir();
                    } while (a == true);
                }
                case "2" -> {
                    do {
                        System.out.println("Quitar Productos");
                        a = true;
                        System.out.println("Desea ver mas ?");
                        textoSalida();
                        a = salir();
                    } while (a == true);
                    break;
                }
                case "3" -> {
                    do {
                        System.out.println("Modificar el estado del camion");
                        a = true;
                        System.out.println("Desea ver mas opciones?");
                        textoSalida();
                        a = salir();
                    } while (a == true);
                    break;
                }
                case "4" -> {
                    do {
                        System.out.println("Agregar Camiones");
                        a = true;
                        System.out.println("Desea ver mas opciones?");
                        textoSalida();
                        a = salir();
                    } while (a == true);
                    break;
                }

                case "5" -> {
                    System.out.println("Desea Salir?");
                    textoSalida();
                    a=salir();
                    break;
                }
                default -> {
                    System.out.println("opción no válida");
                    a = false;
                    break;
                }
            }
            return a;
        }
    }

