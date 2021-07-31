public class Grilo implements Runnable {
    
    private String id_grilo;
    private int tamanho_pulo;
    private int total_pulo;
    private int caminho_percorrido;
    private int contador_tempo;
    private int distancia_chegada;
    boolean chegada = false;
    public Grilo(String id_grilo) {
    	this.id_grilo = id_grilo;
    	run();
    }
    
    public void atualiza() 
    { 
    	System.out.println("Testando");
        this.contador_tempo -=1;
    }

	@Override
	public void run() {
		while (!chegada) {
			atualiza();
		}
	}

}