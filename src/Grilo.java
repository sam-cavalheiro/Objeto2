public class Grilo implements Runnable {
    
    private String idGrilo;
    private int tamanhoPulo = 1;
    private int totalPulo;
    private int caminhoPercorrido;
    //private int contadorTempo;
    private int distanciaChegada = 10;
    boolean chegada = false;
    
    private Thread thread;

    public Grilo(String idGrilo) {
    	this.idGrilo = idGrilo;
    	thread = new Thread(this, idGrilo);
    	thread.start();
    }
    
    public void pula() 
    { 
        totalPulo +=1;
        caminhoPercorrido = caminhoPercorrido+tamanhoPulo;
        System.out.println(idGrilo + " pulou " + tamanhoPulo + " e já percorreu " + caminhoPercorrido + ".");
        if (caminhoPercorrido>=distanciaChegada)
        {
            System.out.println(idGrilo + " chegou na linha de chegada com " + totalPulo + " pulos.");
        }
        else
        {
        	// redefinir contador
        	System.out.println(idGrilo + " resetou");
        	thread.run();
        }
    }

	@Override
	public void run() {
    	try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    	pula();
	}

}