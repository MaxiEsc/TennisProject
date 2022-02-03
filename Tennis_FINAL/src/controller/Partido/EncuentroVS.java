package controller.Partido;

import static java.lang.Math.abs;
import model.JugadorTennis;

import view.Marcador.Vista;

public class EncuentroVS {


    public int iniciarPartidoGamePoint(Vista mostrador, JugadorTennis p1, JugadorTennis p2) {

        //Cadena que maneja los valores del tennis... no es entera pues "Adv" no es un numero
        String jUno = "0";
        String jDos = "0";

        //Puntaje personal de cada jugador se usara de diferencia para salir de un "Deuce"
        double juegoUno = 0;
        double juegoDos = 0;
        boolean finGame = false;
        //Numero Aleatorio que coincidira con la probabilidad para cada judador
        Integer aleatorioUno = 0;
        Integer aleatorioDos = 0;
        //Numero aleatorio para cada partido con el que deben coincidir los numeros de los jugadores
        
        //numero aleatorio para decidir el saque
        int saque = generadorRandom(10);
        mostrador.servicio(p1, p2, saque);

        //numero que se devolvera que identificara el jugador victorioso
        int victoria = 0;

        while (finGame == false && !(juegoUno >= 4 && ((juegoUno - juegoDos) >= 2)
                || (juegoDos >= 4 && ((juegoDos - juegoUno) >= 2)))) {

            aleatorioUno = generadorRandom(100 - p1.getPorcentajeVictoria());
            aleatorioDos = generadorRandom(100 - p2.getPorcentajeVictoria());

            Integer partido = generadorRandom((p1.getPorcentajeVictoria() * p2.getPorcentajeVictoria() / 100));

            if (aleatorioDos != aleatorioUno) {

                if (partido == aleatorioUno || partido == aleatorioDos) {

                    if (juegoUno >= 3 && juegoDos >= 3) {

                        if (partido == aleatorioUno && juegoUno >= 3) {

                            if (jDos.equals("Adv")) {
                                jDos = "40";
                            }

                            jUno = "Adv";
                            juegoUno++;

                            mostrador.puntoPara(p1, p2, 1, 0);

                            //Partido con Ventaja jugador 2
                            if (juegoUno >= 3 && (juegoUno - juegoDos) == 1) {

                                mostrador.juego_Game_Point(p1, p2, 1, 0);
                                mostrador.interfaz_jugador(p1, p2, jUno, jDos);

                                //Partido con Game Point jugador 1
                            } else if (juegoUno == juegoDos) {
                                jDos = "40";
                                jUno = "40";

                                mostrador.juego_Deuce();
                                mostrador.interfaz_jugador(p1, p2, jUno, jDos);

                                //Partido con Deuce
                            }

                            finGame = (juegoUno - juegoDos) == 2;
                            // si finGame es verdad GAME POINT para jugador 1

                        } else if (partido == aleatorioDos && juegoDos >= 3) {

                            if (jUno.equals("Adv")) {
                                jUno = "40";
                            }

                            jDos = "Adv";
                            juegoDos++;

                            mostrador.puntoPara(p1, p2, 0, 1);

                            //Partido con Ventaja jugador 2
                            if (juegoDos >= 3 && (juegoDos - juegoUno) == 1) {

                                mostrador.juego_Game_Point(p1, p2, 0, 1);
                                mostrador.interfaz_jugador(p1, p2, jUno, jDos);

                                //Advertencia con Game Point jugador 2
                            } else if (juegoUno == juegoDos) {
                                jDos = "40";
                                jUno = "40";

                                mostrador.juego_Deuce();
                                mostrador.interfaz_jugador(p1, p2, jUno, jDos);

                                //Partido con Deuce
                            }

                            finGame = (juegoDos - juegoUno) == 2;
                            // si finGame es verdad GAME POINT para jugador 2

                        }

                        //Partido con Deuce
                    }

                    if (partido == aleatorioUno && juegoUno == 3 && ((juegoUno - juegoDos) == 1)) {
                        jUno = " GAME!! ";
                        jDos = " ------ ";

                        juegoUno++;
                        mostrador.puntoPara(p1, p2, 1, 0);
                        mostrador.interfaz_jugador(p1, p2, jUno, jDos);

                        finGame = (juegoUno - juegoDos) == 2;
                        //Punto Game para jugador 1

                    } else if (partido == aleatorioDos && juegoDos == 3 && (juegoDos - juegoUno) == 1) {
                        jUno = " ------ ";
                        jDos = " GAME!! ";

                        juegoDos++;
                        mostrador.puntoPara(p1, p2, 1, 0);
                        mostrador.interfaz_jugador(p1, p2, jUno, jDos);

                        finGame = (juegoDos - juegoUno) == 2;
                        //Punto Game para jugador 2
                        
                    }

                    if (partido == aleatorioUno && juegoUno == 2) {

                        jUno = "40";
                        juegoUno++;
                        mostrador.puntoPara(p1, p2, 1, 0);

                        if (juegoUno >= 3 && ((juegoUno - juegoDos) >= 1)) {

                            mostrador.juego_Game_Point(p1, p2, 1, 0);
                            mostrador.interfaz_jugador(p1, p2, jUno, jDos);

                            //Advertencia GAME POINT para jugador 1
                        } else if (juegoUno == juegoDos) {

                            mostrador.juego_Deuce();
                            mostrador.interfaz_jugador(p1, p2, jUno, jDos);

                            //Juego DEUCE para jugador 1
                        }

                        // Punto 40 para jugador 1
                    } else if (partido == aleatorioDos && juegoDos == 2) {

                        jDos = "40";
                        juegoDos++;
                        mostrador.puntoPara(p1, p2, 0, 1);

                        if (juegoDos >= 3 && (juegoDos - juegoUno) >= 1) {

                            mostrador.juego_Game_Point(p1, p2, 0, 1);
                            mostrador.interfaz_jugador(p1, p2, jUno, jDos);

                            //Advertencia GAME POINT para jugador 2
                        } else if (juegoUno == juegoDos) {

                            mostrador.juego_Deuce();
                            mostrador.interfaz_jugador(p1, p2, jUno, jDos);

                            //Juego DEUCE para jugador 2
                        }

                        mostrador.interfaz_jugador(p1, p2, jUno, jDos);

                        // Punto 40 para jugador 2
                    }

                    if (partido == aleatorioUno && juegoUno == 1) {
                        jUno = "30";
                        juegoUno++;
                        mostrador.puntoPara(p1, p2, 1, 0);

                        mostrador.interfaz_jugador(p1, p2, jUno, jDos);

                        // Punto 30 para jugador 1
                    } else if (partido == aleatorioDos && juegoDos == 1) {
                        jDos = "30";
                        juegoDos++;
                        mostrador.puntoPara(p1, p2, 0, 1);

                        mostrador.interfaz_jugador(p1, p2, jUno, jDos);

                        // Punto 30 para jugador 2
                    }

                    if (partido == aleatorioUno && juegoUno == 0) {
                        jUno = "15";
                        juegoUno++;
                        mostrador.puntoPara(p1, p2, 1, 0);

                        mostrador.interfaz_jugador(p1, p2, jUno, jDos);

                        // Punto 15 para jugador 1
                    } else if (partido == aleatorioDos && juegoDos == 0) {
                        jDos = "15";
                        juegoDos++;
                        mostrador.puntoPara(p1, p2, 0, 1);

                        mostrador.interfaz_jugador(p1, p2, jUno, jDos);

                        // Punto 15 para jugador 1
                    }

                    //if del if (partido == aleatorioUno || partido == aleatorioDos){}
                }

                //fin del if (aleatorioDos != aleatorioUno){}
            }

            //Fin del While
        }

        if (juegoUno - juegoDos == 2) {

            mostrador.victoria_Game_Point(p1, p2, 1, 0);
            victoria = 1;

            //Victoria de GAME para jugador 1
        }

        if (juegoDos - juegoUno == 2) {
            mostrador.victoria_Game_Point(p1, p2, 0, 1);
            victoria = 2;

            //Victoria de GAME para jugador 2
        }

        //Si la victoria es 1 es GAME para jugador 1... Si es 2 es GAME para el jugador 2
        return victoria;
    }

    public Integer generadorRandom(Integer probabilidad) {

        Integer random = (int) (Math.random() * ((probabilidad == 0) ? 1 : probabilidad) + 1);

        return random;
    }

    public int tiebreak(Vista mostrador, JugadorTennis p1, JugadorTennis p2) {

        Integer aleatorioUno = 0;
        Integer aleatorioDos = 0;
        int puntos_j1 = 0;
        int puntos_j2 = 0;
        boolean finTieBreak = false;
        mostrador.juego_Tie_Break();

        while (!(abs((puntos_j1 - puntos_j2)) >= 2 && puntos_j1 >= 6)
                && finTieBreak == false) {

            aleatorioUno = generadorRandom(100 - p1.getPorcentajeVictoria());
            aleatorioDos = generadorRandom(100 - p2.getPorcentajeVictoria());

            Integer partido = generadorRandom((p1.getPorcentajeVictoria() * p2.getPorcentajeVictoria() / 100));

            if (aleatorioDos != aleatorioUno) {

                if (partido == aleatorioUno) {

                    puntos_j1++;

                    mostrador.interfaz_jugador(p1, p2, String.valueOf(puntos_j1), String.valueOf(puntos_j2));

                    //Punto para jugador 1
                } else if (partido == aleatorioDos) {

                    puntos_j2++;

                    mostrador.interfaz_jugador(p1, p2, String.valueOf(puntos_j1), String.valueOf(puntos_j2));

                    //Punto para jugador 1
                }

                if (puntos_j1 >= 6 && puntos_j1 == puntos_j2) {

                    //Mientras la diferencia de los puntos 
                    finTieBreak = abs(puntos_j1 - puntos_j2) == 2;

                }
                // fin del if (aleatorioDos != aleatorioUno){}
            }
            //fin del while
        }

        return (puntos_j1 > puntos_j2) ? 1 : 2;
    }

}
