package controller;

import controller.Partido.Partido;

import java.util.*;
import model.JugadorTennis;
import view.Marcador.Vista;

public class Principal {

    public static void main(String[] args) throws InterruptedException {

        Vista view = new Vista();

        //Datos por default
        Scanner in = new Scanner(System.in);
        JugadorTennis p1 = new JugadorTennis();
        JugadorTennis p2 = new JugadorTennis();
        p1.setNombre("Jugador 1");
        p2.setNombre("Jugador 2");
        p1.setNacionalidad("USA");
        p2.setNacionalidad("Germany");
        p1.setEdad(30);
        p2.setEdad(35);
        p1.setRankingMundial("26");
        p2.setRankingMundial("20");
        p1.setPorcentajeVictoria(80);
        p2.setPorcentajeVictoria(76);
        String nombreTorneo = "Open World Tennis";
        int set = 5;

        int opcion;

        do {

            view.menu();
            System.out.print("Opcion: ");
            opcion = in.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese el Apellido del Jugador 1");
                    String nombrej1 = in.next();
                    p1.setNombre(nombrej1);
                    System.out.println("Ingrese su Edad del Jugador 1");
                    int edadj1 = in.nextInt();
                    p1.setEdad(edadj1);
                    System.out.println("Ingrese su nacionalidad (Mas de 3 letras)");
                    String nacj1 = in.next();
                    p1.setNacionalidad(nacj1);
                    System.out.println("Ingrese el numero de su Ranking Mundial");
                    String rankj1 = in.next();
                    p1.setRankingMundial(rankj1);
                    System.out.println("Ingrese el numero de Probablidad de Victoria");
                    int vicj1 = in.nextInt();
                    p1.setPorcentajeVictoria(vicj1);

                    break;
                case 2:
                    System.out.println("Ingrese el Apellido del Jugador 2");
                    String nombrej2 = in.next();
                    p2.setNombre(nombrej2);
                    System.out.println("Ingrese su Edad del Jugador 2");
                    int edadj2 = in.nextInt();
                    p2.setEdad(edadj2);
                    System.out.println("Ingrese su nacionalidad (Mas de 3 letras)");
                    String nacj2 = in.next();
                    p2.setNacionalidad(nacj2);
                    System.out.println("Ingrese el numero de su Ranking Mundial");
                    String rankj2 = in.next();
                    p2.setRankingMundial(rankj2);
                    System.out.println("Ingrese el numero de Probablidad de Victoria");
                    int vicj2 = in.nextInt();
                    p2.setPorcentajeVictoria(vicj2);

                    break;
                case 3:
                    view.mostrarJugadores(p1, p2);
                    break;
                case 4:
                    System.out.println("Ingrese nombre del Torneo en cuestion");
                    System.out.println("");
                    System.out.print("Nombre del torneo: ");
                    nombreTorneo = in.next();
                    System.out.println("Cuantos set desea Jugar ");
                    set = control(3, 5);

                    boolean repetir = true;

                    while (repetir == true) {

                        Partido prueba = new Partido();
                        prueba.iniciar_Partido(set, p1, p2, nombreTorneo);
                        System.out.println("¿Desea realizar una revancha? entre los mismos jugadores | Si: 1 | No: 2 ");
                        int op = control(1, 2);
                        repetir = (op == 2) ? false : true;

                    }
                    break;
                default:
                    System.out.println("Ingrese una 'Opcion' valida Por favor");
                    break;
            }

        } while (opcion < 4);

        System.out.println("Fin del torneo Gracias por Usar el software");
        System.out.println("");
        System.out.println("");

    }

    public static int control(int opcionCorA, int opcionCorB) {

        Scanner in = new Scanner(System.in);
        int opcion_final = 0;

        while (!(opcion_final == opcionCorA || opcion_final == opcionCorB)) {

            System.out.println("Ingrese el numero deseado");
            System.out.print("Numero: ");
            opcion_final = in.nextInt();

            if (!(opcion_final == opcionCorA || opcion_final == opcionCorB)) {
                System.out.println("Por favor Ingrese alguna opcion valida");
            }
        }

        return opcion_final;
    }
}
