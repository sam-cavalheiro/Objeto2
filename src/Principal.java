
public class Principal {
	
	public static final int CHEGADA = 30;

	public static void main(String[] args) {
		
		
		int numeroGrilos = 5;
		while(numeroGrilos > 0) {
			System.out.println(numeroGrilos);
			new Grilo("Grilo_" + numeroGrilos);
			numeroGrilos --;
		}
		
		
		
			
		// TODO Auto-generated method stub

	}

}
