package view.Marcador;

import controller.Partido.Partido;
import model.JugadorTennis;

public class Vista implements IVista {

    String[] cadenaJugador1 = new String[6];
    String[] cadenaJugador2 = new String[6];
    private String nombreTorneo = "";

    public String getNombreTorneo() {
        return nombreTorneo;
    }

    public void setNombreTorneo(String nombreTorneo) {
        this.nombreTorneo = nombreTorneo;
    }

    @Override
    public void juego_Game_Point(JugadorTennis a, JugadorTennis b, Integer ptj_jugadorA, Integer ptj_jugadorB) {

        System.out.println(" __________________________________________________________________________________");
        System.out.println("|----------------------------------------------------------------------------------|");
        System.out.print("| Proximo punto de: ");
        System.out.println((ptj_jugadorA.intValue() > ptj_jugadorB.intValue()) ? a.getNombre() : b.getNombre());
        System.out.println(", es un GAME POINT");
        System.out.println("|----------------------------------------------------------------------------------|");
        System.out.println(" __________________________________________________________________________________ ");
    }

    @Override
    public void victoria_Game_Point(JugadorTennis a, JugadorTennis b, Integer ptj_jugadorA, Integer ptj_jugadorB) {

        System.out.println(" __________________________________________________________________________________");
        System.out.println("|----------------------------------------------------------------------------------|");
        System.out.print("|     GAME POINT para : ");
        System.out.println((ptj_jugadorA.intValue() > ptj_jugadorB.intValue()) ? a.getNombre() : b.getNombre());
        System.out.println("|----------------------------------------------------------------------------------|");
        System.out.println(" __________________________________________________________________________________ ");

    }

    @Override
    public void juego_Break_Point(JugadorTennis a, JugadorTennis b, Integer ptj_jugadorA, Integer ptj_jugadorB) {

        System.out.println(" __________________________________________________________________________________");
        System.out.println("|----------------------------------------------------------------------------------|");
        System.out.print("| Proximo punto de: ");
        System.out.println((ptj_jugadorA.intValue() > ptj_jugadorB.intValue()) ? a.getNombre() : b.getNombre());
        System.out.println(", es un BREAK POINT");
        System.out.println("|----------------------------------------------------------------------------------|");
        System.out.println(" __________________________________________________________________________________ ");
    }

    @Override
    public void juego_Deuce() {

        System.out.println(" __________________________________________________________________________________ ");
        System.out.println("|----------------------------------------------------------------------------------|");
        System.out.println("|                                     DEUCE                                         ");
        System.out.println("|----------------------------------------------------------------------------------|");
        System.out.println(" __________________________________________________________________________________ ");
    }

    @Override
    public void juego_Set_Point(JugadorTennis a, JugadorTennis b, Integer ptj_jugadorA, Integer ptj_jugadorB) {

        System.out.println(" __________________________________________________________________________________");
        System.out.println("|----------------------------------------------------------------------------------|");
        System.out.print("| Proximo GAME POINT de: ");
        System.out.print((ptj_jugadorA.intValue() > ptj_jugadorB.intValue()) ? a.getNombre() : b.getNombre());
        System.out.println(", Gana un SET POINT");
        System.out.println("|----------------------------------------------------------------------------------|");
        System.out.println(" __________________________________________________________________________________ ");
    }

    @Override
    public void victoria_Set_Point(JugadorTennis a, JugadorTennis b, Integer ptj_jugadorA, Integer ptj_jugadorB) {

        System.out.println(" __________________________________________________________________________________");
        System.out.println("|----------------------------------------------------------------------------------|");
        System.out.print("| SET POINT para : ");
        System.out.println((ptj_jugadorA.intValue() > ptj_jugadorB.intValue()) ? a.getNombre() : b.getNombre());
        System.out.println("|----------------------------------------------------------------------------------|");
        System.out.println(" __________________________________________________________________________________ ");
    }

    @Override
    public void juego_Match_Point(JugadorTennis a, JugadorTennis b, Integer ptj_jugadorA, Integer ptj_jugadorB) {

        System.out.println(" __________________________________________________________________________________");
        System.out.println("|----------------------------------------------------------------------------------|");
        System.out.print("| Proximo GAME POINT de: ");
        System.out.print((ptj_jugadorA.intValue() > ptj_jugadorB.intValue()) ? a.getNombre() : b.getNombre());
        System.out.println(", Gana el MATCH POINT");
        System.out.println("|----------------------------------------------------------------------------------|");
        System.out.println(" __________________________________________________________________________________ ");
    }

    @Override
    public void juego_Tie_Break() {

        System.out.println(" __________________________________________________________________________________ ");
        System.out.println("|----------------------------------------------------------------------------------|");
        System.out.println("|                                     TIEBREAK                                      ");
        System.out.println("|----------------------------------------------------------------------------------|");
        System.out.println(" __________________________________________________________________________________ ");
    }

    @Override
    public void victoria_jugador(JugadorTennis a, JugadorTennis b, Integer ptj_jugadorA, Integer ptj_jugadorB) {

        System.out.println(" __________________________________________________________________________________");
        System.out.println("|----------------------------------------------------------------------------------|");
        System.out.print("| Ganador del partido es : ");
        System.out.println((ptj_jugadorA.intValue() > ptj_jugadorB.intValue()) ? a.getNombre() : b.getNombre());
        System.out.println("|----------------------------------------------------------------------------------|");
        System.out.println(" __________________________________________________________________________________ ");

    }

    @Override
    public void interfaz_jugador(JugadorTennis a, JugadorTennis b, String ptj_jugadorA, String ptj_jugadorB) {

        cadenaJugador1[0] = ptj_jugadorA;
        cadenaJugador2[0] = ptj_jugadorB;

        System.out.println(" __________________________________________________________________________________");
        System.out.println("|----------------------------------------------------------------------------------|");
        System.out.print("| Torneo: " + nombreTorneo);
        System.out.println("        ");
        System.out.println("|----------------------------------------------------------------------------------|");
        System.out.print("| Set |");
        System.out.printf("%-30s", " ");
        for (int i = 0; i < 6; i++) {
            System.out.print("| " + i + " |");
        }
        System.out.println("");
        System.out.println("|----------------------------------------------------------------------------------|");
        System.out.print("| " + a.getNacionalidad().substring(0, 3) + " | " + a.getNombre());
        System.out.printf("%-20s", " ");
        for (int i = 0; i < 6; i++) {
            System.out.print("| " + cadenaJugador1[i] + " |");
        }
        System.out.println("   |Rank: " + a.getRankingMundial() + " |");
        System.out.println("|----------------------------------------------------------------------------------|");
        System.out.print("| " + b.getNacionalidad().substring(0, 3) + " | " + b.getNombre());
        System.out.printf("%-20s", " ");
        for (int i = 0; i < 6; i++) {
            System.out.print("| " + cadenaJugador2[i] + " |");
        }
        System.out.println("   |Rank: " + b.getRankingMundial() + " |");
        System.out.println("|----------------------------------------------------------------------------------|");
        System.out.println(" __________________________________________________________________________________ ");
        System.out.println("");
        System.out.println("");
    }

    @Override
    public void cargarGames(Integer ptj_jugadorA, Integer ptj_jugadorB, Integer numero_Set) {

        cadenaJugador1[numero_Set] = ptj_jugadorA.toString();
        cadenaJugador2[numero_Set] = ptj_jugadorB.toString();
    }

    @Override
    public void puntoPara(JugadorTennis a, JugadorTennis b, Integer ptj_jugadorA, Integer ptj_jugadorB) {

        System.out.println("|----------------------------------------------------------------------------------|");
        System.out.print("|  Punto para:  ");
        System.out.println((ptj_jugadorA > ptj_jugadorB) ? a.getNombre() : b.getNombre());
        System.out.println("|----------------------------------------------------------------------------------|");
    }

    @Override
    public void iniciar(String nombre) {
        for (int i = 0; i < 6; i++) {
            cadenaJugador1[i] = "0";
            cadenaJugador2[i] = "0";
        }

        setNombreTorneo(nombre);

        System.out.println(" __________________________________________________________________________________ ");
        System.out.println("|----------------------------------------------------------------------------------|");
        System.out.println("|                   Bienvenido al Gran Partido de Tennis                           |");
        System.out.println("|----------------------------------------------------------------------------------|");
        System.out.println("|----------------------------------------------------------------------------------|");
        System.out.println(" __________________________________________________________________________________ ");
        System.out.println("Torneo: " + getNombreTorneo());
    }

    @Override
    public void servicio(JugadorTennis a, JugadorTennis b, int servicio) {
        System.out.println("====================================================================================");
        
        System.out.print("Servicio de este Game es para: ");
        System.out.println( (servicio % 2 == 0) ? a.getNombre() : b.getNombre());
        System.out.println("====================================================================================");
    }

    @Override
    public void menu() {

        System.out.println("");
        System.out.println("|----------------------------------------------------------------------------------|");
        System.out.println("|              Bienvenido al Gran Torneo Partido de Tennis                         |");
        System.out.println("|----------------------------------------------------------------------------------|");
        System.out.println("Bienvenido al partido a nuestro toeneo oficial de Tennis");
        System.out.println("Ingrese Los datos de los jugadores en cuestion");
        System.out.println("Ingrese 1 - Para ingresar los datos del jugador 1 ");
        System.out.println("Ingrese 2 - Para ingresar los datos del jugador 2 ");
        System.out.println("Ingrese 3 - Mostrar los jugadores ");
        System.out.println("Ingrese 4 - Para Continuar ");

        System.out.println("");

    }

    @Override
    public void mostrarJugadores(JugadorTennis a, JugadorTennis b) {

        System.out.println("|----------------------------------------------------------------------------------|");
        System.out.println("Datos de los jugadores");
        System.out.println("|----------------------------------------------------------------------------------|");
        System.out.println("====================================================================================");
        System.out.print("Jugador 1: ");
        System.out.println("| " + a.getNombre() + " | Edad: " + a.getEdad() + " | NAC:" + a.getNacionalidad() + " | PorVic:" + a.getPorcentajeVictoria() + " | Rank:" + a.getRankingMundial());
        System.out.println("====================================================================================");
        System.out.print("Jugador 2: ");
        System.out.println("| " + b.getNombre() + " | Edad: " + b.getEdad() + " | NAC:" + b.getNacionalidad() + " | PorVic:" + b.getPorcentajeVictoria() + " | Rank:" + b.getRankingMundial());
        System.out.println("====================================================================================");

    }

    @Override
    public void mostrarSetsInicio(int sets) {
        System.out.println("|==================================================================================|");
        System.out.println("|                           Tennis - Singles                                       |");
        System.out.println("|                      Cantidad de Sets: " + sets + "                                         |");
        System.out.println("|==================================================================================|");

    }

}
