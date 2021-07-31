public class Grilo implements Runnable {
    
    private String idGrilo;
    private int tamanhoPulo;
    private int totalPulo;
    private int caminhoPercorrido;
    private int contadorTempo = 2;
    private int distanciaChegada;
    boolean chegada = false;

    public Grilo(String id_grilo) {
    	this.id_grilo = id_grilo;
    	run();
    }
    
    public void atualiza() 
    { 

        this.contadorTempo -=1;
        
        if(contadorTempo <= 0)
             {
                totalPulo +=1;
                caminhoPercorrido = caminhoPercorrido+tamanhoPulo;
                                System.out.println("Grilo_"+idGrilo+"_pulou_"+tamanhoPulo+"_e_já_percorreu_"+caminhoPercorrido+".");
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