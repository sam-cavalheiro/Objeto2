import java.util.Random;
public class Grilo implements Runnable {
    
	private static final int TAMANHO_MINIMO_PULO = 1;
	private static final int TAMANHO_MAXIMO_PULO = 10;
	
	private static final int RESETAR_TEMPO_MINIMO = 500;
	private static final int RESETAR_TEMPO_MAXIMO = 3000;
	
    private String idGrilo;
    private int tamanhoPulo;
    private int totalPulo;
    private int caminhoPercorrido;
    private int contadorTempo;
    private int distanciaChegada;
    boolean chegada = false;
    
    private Thread thread;

    public Grilo(String idGrilo) {
    	reseta();
    	this.idGrilo = idGrilo;
    	thread = new Thread(this, idGrilo);
    	//run();
    }
    
    public void atualiza() 
    { 
    	System.out.println(idGrilo + ": " + contadorTempo);
        this.contadorTempo -=1;
        
        if(contadorTempo <= 0)
             {
                totalPulo +=1;
                caminhoPercorrido = caminhoPercorrido+tamanhoPulo;
                System.out.println("Grilo_"+idGrilo+"_pulou_"+tamanhoPulo+"_e_j�_percorreu_"+caminhoPercorrido+".");
                if (caminhoPercorrido>=distanciaChegada)
                {
                    System.out.println("Grilo_"+idGrilo+"chegou_na_linha_de_chegada_com_"+totalPulo+"_pulos.");
                }
                else
                {
                	reseta();
                	
                //redefinir contador
                	
                }
             }
    }
    
    private void reseta()
    {
    	Random random = new Random();
		
		
    	tamanhoPulo = TAMANHO_MINIMO_PULO + random.nextInt(TAMANHO_MAXIMO_PULO - TAMANHO_MINIMO_PULO);
    	
    	contadorTempo = RESETAR_TEMPO_MINIMO + random.nextInt(RESETAR_TEMPO_MAXIMO - RESETAR_TEMPO_MINIMO);
    }

	@Override
	public void run() {
		while (!chegada) {
			atualiza();
		}
	}

}