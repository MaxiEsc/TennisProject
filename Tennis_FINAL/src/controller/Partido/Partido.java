package controller.Partido;

import static java.lang.Math.abs;
import model.JugadorTennis;
import view.Marcador.Vista;

public class Partido implements IPartido {

    private Integer puntos_JugadorUno = 0;
    private Integer puntos_JugadorDos = 0;
    private Integer game_JugadorUno = 0;
    private Integer game_JugadorDos = 0;
    private Integer set_JugadorUno = 0;
    private Integer set_JugadorDos = 0;

    private Integer cant_Sets_para_Victoria = 0;

    public Partido() {
    }

    public Partido(Integer sets) {
        this.cant_Sets_para_Victoria = sets;
    }

    public Integer getCant_Sets_para_Victoria() {
        return cant_Sets_para_Victoria;
    }

    public void setCant_Sets_para_Victoria(Integer cant_Sets_para_Victoria) {
        this.cant_Sets_para_Victoria = cant_Sets_para_Victoria;
    }

    public Integer getCant_Sets() {
        return cant_Sets_para_Victoria;
    }

    public void setCant_Sets(Integer aCant_Sets) {
        cant_Sets_para_Victoria = aCant_Sets;
    }

    public Integer getPuntos_JugadorUno() {
        return puntos_JugadorUno;
    }

    public void setPuntos_JugadorUno(Integer puntos_JugadorUno) {
        this.puntos_JugadorUno = puntos_JugadorUno;
    }

    public Integer getPuntos_JugadorDos() {
        return puntos_JugadorDos;
    }

    public void setPuntos_JugadorDos(Integer puntos_JugadorDos) {
        this.puntos_JugadorDos = puntos_JugadorDos;
    }

    public Integer getGame_JugadorUno() {
        return game_JugadorUno;
    }

    public void setGame_JugadorUno(Integer game_JugadorUno) {
        this.game_JugadorUno = game_JugadorUno;
    }

    public Integer getGame_JugadorDos() {
        return game_JugadorDos;
    }

    public void setGame_JugadorDos(Integer game_JugadorDos) {
        this.game_JugadorDos = game_JugadorDos;
    }

    public Integer getSet_JugadorUno() {
        return set_JugadorUno;
    }

    public void setSet_JugadorUno(Integer set_JugadorUno) {
        this.set_JugadorUno = set_JugadorUno;
    }

    public Integer getSet_JugadorDos() {
        return set_JugadorDos;
    }

    public void setSet_JugadorDos(Integer set_JugadorDos) {
        this.set_JugadorDos = set_JugadorDos;
    }

    @Override
    public int iniciar_SetPoint(Vista muestra, JugadorTennis p1, JugadorTennis p2, Integer set_muestra) {

        EncuentroVS partido = new EncuentroVS();

        int ptsJugador1 = 0;
        //Set del jugador 1
        int ptsJugador2 = 0;
        //Set del jugador 2
        int ganador_set = 0;
        // Sirve para devolver el numero del jugador ganador de esta funcion
        int ganadorGame = 0;
        // sirve para cargar los games en la Vista
        boolean finSet = false;
        //Control para el while
        int saque = 0;
        //saque
        setGame_JugadorUno(0);
        setGame_JugadorDos(0);

        int ganador_tiebreak = 0;

        while (finSet == false
                && !((ptsJugador1 >= 6 || ptsJugador2 >= 6)
                && abs(ptsJugador1 - ptsJugador2) >= 2)) {
            
            

            if (ptsJugador2 == 6 && ptsJugador1 == 6) {

                ganador_tiebreak = iniciar_TieBreak(muestra, p1, p2);
                //Funcion devolvera el ganador del TieBreak 1 si es j1 / 2 si es j2

                if (ganador_tiebreak == 1) {

                    ptsJugador1++;

                    //Se incrementa el game del jugador ganador
                    muestra.victoria_Set_Point(p1, p2, 1, 0);
                    //Se muestra un mensaje del jugador ganador del set
                    setGame_JugadorUno(ptsJugador1);
                    setGame_JugadorDos(ptsJugador2);

                    //Se les asigna a los atributos game_jugador de la clase partido
                    muestra.cargarGames(ptsJugador1, ptsJugador2, set_muestra);

                    // se le asigna a la vista los games... Deben ser minimos 6 Games para cada uno de los dos jugadores si paso por aca
                    finSet = true;

                } else if (ganador_tiebreak == 2) {

                    ptsJugador2++;

                    muestra.victoria_Set_Point(p1, p2, 0, 1);
                    //Se incrementa el game del jugador ganador

                    setGame_JugadorUno(ptsJugador1);
                    setGame_JugadorDos(ptsJugador2);

                    //Se les asigna a los atributos game_jugador de la clase partido
                    muestra.cargarGames(ptsJugador1, ptsJugador2, set_muestra);

                    // se le asigna a la vista los games... Deben ser minimos 6 Games para cada uno de los dos jugadores si paso por aca
                    finSet = true;
                }

                // fin if (ptsJugador2 == 6 && ptsJugador1 == 6) {}
            }else{
                
                ganadorGame = partido.iniciarPartidoGamePoint(muestra, p1, p2);
            }

            if (ganadorGame == 1 && finSet == false) {

                ptsJugador1++;
                //Jugador 1 ha ganado un game se le incrementa y se muestra en la vista
                muestra.cargarGames(ptsJugador1, ptsJugador2, set_muestra);

                if (ptsJugador1 >= 6 && finSet == false) {

                    //advertencia de Set point para el jugador 1
                    muestra.juego_Set_Point(p1, p2, 1, 0);

                    finSet = (ptsJugador1 - ptsJugador2) == 2;
                }

            } else if (ganadorGame == 2 && finSet == false) {

                ptsJugador2++;
                //Jugador 2 ha ganado un game se le incrementa y se muestra en la vista
                muestra.cargarGames(ptsJugador1, ptsJugador2, set_muestra);

                if (ptsJugador2 >= 6 && finSet == false) {

                    //advertencia de Set point para el jugador 1
                    muestra.juego_Set_Point(p1, p2, 0, 1);

                    finSet = (ptsJugador2 - ptsJugador1) == 2;
                }
            }

            if (ptsJugador1 >= 5 && (ptsJugador1 - ptsJugador2 == 1) && finSet == false) {

                //advertencia de Break point para el jugador 1
                muestra.juego_Break_Point(p1, p2, 0, 1);

            } else if (ptsJugador2 >= 5 && (ptsJugador2 - ptsJugador1 == 1) && finSet == false) {

                //advertencia de Break point para el jugador 1
                muestra.juego_Break_Point(p1, p2, 1, 0);

            }
            //Se incrementa el saque para calcular quien sacara
            saque++;
        }

        setGame_JugadorUno(ptsJugador1);
        setGame_JugadorDos(ptsJugador2);

        if (ganador_tiebreak == 0) {

            if (ptsJugador1 >= 6 && (ptsJugador1 - ptsJugador2 >= 2)) {

                muestra.victoria_Set_Point(p1, p2, 1, 0);
                ganador_set = 1;

            } else if (ptsJugador2 >= 6 && (ptsJugador2 - ptsJugador1 >= 2)) {

                muestra.victoria_Set_Point(p1, p2, 0, 1);
                ganador_set = 2;

            }
        } else if (ganador_tiebreak == 1) {

            ganador_set = 1;
            muestra.interfaz_jugador(p1, p2, "TIEBREAK", " ------ ");

        } else if (ganador_tiebreak == 2) {

            ganador_set = 2;
            muestra.interfaz_jugador(p1, p2, " ------ ", "TIEBREAK");
        }

        muestra.interfaz_jugador(p1, p2, "0", "0");

        return ganador_set;
    }

    @Override
    public void iniciar_Partido(Integer cant_sets_Partido, JugadorTennis j1,
            JugadorTennis j2, String nombreTorneo
    ) {

        Vista muestra = new Vista();
        int set = 1;

        muestra.mostrarSetsInicio(cant_Sets_para_Victoria);
        muestra.iniciar(nombreTorneo);
        System.out.println("Iniciando Partido");
        setCant_Sets_para_Victoria(cant_sets_Partido);

        int pts1 = 0;
        int pts2 = 0;

        int setJugador = 0;

        while (!(getSet_JugadorUno() == ((cant_Sets_para_Victoria / 2) + 1)
                || getSet_JugadorDos() == ((cant_Sets_para_Victoria / 2) + 1))
                && set <= cant_Sets_para_Victoria) {

            setJugador = iniciar_SetPoint(muestra, j1, j2, set);
            System.out.println("Set en Juego: " + set);

            if (setJugador == 1) {
                pts1++;
                muestra.cargarGames(getGame_JugadorUno(), getGame_JugadorDos(), set);

            } else if (setJugador == 2) {
                pts2++;
                muestra.cargarGames(getGame_JugadorUno(), getGame_JugadorDos(), set);

            }

            setSet_JugadorUno(pts1);
            setSet_JugadorDos(pts2);

            set++;
        }

        if (getSet_JugadorUno() > getSet_JugadorDos()) {

            muestra.victoria_jugador(j1, j2, 1, 0);
        } else {
            muestra.victoria_jugador(j1, j2, 0, 1);
        }

    }

    @Override
    public int iniciar_TieBreak(Vista muestra, JugadorTennis p1,
            JugadorTennis p2
    ) {

        EncuentroVS a = new EncuentroVS();

        return a.tiebreak(muestra, p1, p2);
    }
}
