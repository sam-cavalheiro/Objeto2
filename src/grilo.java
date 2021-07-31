public class Grilo{
    
    private String id_grilo;
    private int tamanho_pulo;
    private int total_pulo;
    private int caminho_percorrido;
    private int contador_tempo;
    private int distancia_chegada;
    boolean chegada = true;
    
    public void atualiza() 
    { 
        this.contador_tempo -=1;
    }

}