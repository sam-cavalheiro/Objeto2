public class Grilo{
    
    private String id_grilo;
    private int tamanho_pulo;
    private int total_pulo;
    private int caminho_percorrido;
    private int contador_tempo;
    private int distancia_chegada;
    boolean chegada = true;
    public Grilo(String id_grilo) {
    	this.id_grilo = id_grilo;
    }
    
    public void atualiza() 
    { 
        this.contador_tempo -=1;
    }

}