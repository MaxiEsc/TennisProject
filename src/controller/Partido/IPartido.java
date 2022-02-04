package controller.Partido;

import model.JugadorTennis;
import view.Marcador.Vista;

public interface IPartido {

    public int iniciar_SetPoint(Vista muestra, JugadorTennis p1, JugadorTennis p2,Integer set_muestra);

    public void iniciar_Partido(Integer cant_sets_Partido,JugadorTennis j1, JugadorTennis j2,String nombreTorneo);
    
    public int iniciar_TieBreak(Vista muestra, JugadorTennis p1, JugadorTennis p2);

}
