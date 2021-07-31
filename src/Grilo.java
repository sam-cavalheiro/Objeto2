public class Grilo implements Runnable {
    
    private String idGrilo;
    private int tamanhoPulo;
    private int totalPulo;
    private int caminhoPercorrido;
    private int contadorTempo;
    private int distanciaChegada;
    boolean chegada = false;
    
    private Thread thread;

    public Grilo(String idGrilo) {
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
                //redefinir contador
                	
                }
             }
    }

	@Override
	public void run() {
		while (!chegada) {
			atualiza();
		}
	}

}