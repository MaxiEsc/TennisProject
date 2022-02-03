package model;

public class JugadorTennis extends Persona {
   
    private String rankingMundial;
    private boolean is_service = true;
    private Integer porcentajeVictoria;

    public JugadorTennis() {
    }

    public JugadorTennis(String rankingMundial, boolean is_service) {
        super();
        this.rankingMundial = rankingMundial;
        this.is_service = is_service;
    }
    

    public String getRankingMundial() {
        return rankingMundial;
    }

    public void setRankingMundial(String rankingMundial) {
        this.rankingMundial = rankingMundial;
    }

    public boolean isIs_service() {
        return is_service;
    }

    public void setIs_service(boolean is_service) {
        this.is_service = is_service;
    }
    
    public Integer getPorcentajeVictoria() {
        return porcentajeVictoria;
    }

    public void setPorcentajeVictoria(Integer porcentajeVictoria) {
        this.porcentajeVictoria = porcentajeVictoria;
    }
    
    @Override
    public String toString() {
        return "JugadorTennis{" + "rankingMundial=" + rankingMundial + ", is_service=" + is_service + '}';
    }

}
