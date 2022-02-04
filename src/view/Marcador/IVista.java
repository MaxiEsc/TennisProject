package view.Marcador;

import controller.Partido.Partido;
import model.JugadorTennis;

public interface IVista {

    public void iniciar(String nombre);
    
    public void juego_Game_Point(JugadorTennis a, JugadorTennis b, Integer ptj_jugadorA, Integer ptj_jugadorB );

    public void victoria_Game_Point(JugadorTennis a, JugadorTennis b, Integer ptj_jugadorA, Integer ptj_jugadorB);

    public void juego_Break_Point(JugadorTennis a, JugadorTennis b, Integer ptj_jugadorA, Integer ptj_jugadorB);

    public void juego_Deuce();

    public void juego_Set_Point(JugadorTennis a, JugadorTennis b, Integer ptj_jugadorA, Integer ptj_jugadorB);

    public void victoria_Set_Point(JugadorTennis a, JugadorTennis b, Integer ptj_jugadorA, Integer ptj_jugadorB);

    public void juego_Match_Point(JugadorTennis a, JugadorTennis b, Integer ptj_jugadorA, Integer ptj_jugadorB);

    public void juego_Tie_Break();

    public void victoria_jugador(JugadorTennis a, JugadorTennis b, Integer ptj_jugadorA, Integer ptj_jugadorB);

    public void interfaz_jugador(JugadorTennis a, JugadorTennis b, String ptj_jugadorA, String ptj_jugadorB);
    
    public void cargarGames(Integer ptj_jugadorA, Integer ptj_jugadorB, Integer numero_Set);
        
    public void puntoPara(JugadorTennis a, JugadorTennis b, Integer ptj_jugadorA, Integer ptj_jugadorB);
    
    public void servicio(JugadorTennis a, JugadorTennis b, int servicio);
    
    public void menu();
    
    public void mostrarJugadores(JugadorTennis a, JugadorTennis b);
    
    public void mostrarSetsInicio(int sets);

}
