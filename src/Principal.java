
public class Principal {

	public static void main(String[] args) {
		
		
		Grilo grilo = new Grilo("Grilo1");
		
		int numeroGrilos = 5;
		while(numeroGrilos > 0) {
			System.out.println(numeroGrilos);
			new Grilo("Grilo_" + numeroGrilos);
			numeroGrilos --;
		}
		
		
		
			
		// TODO Auto-generated method stub

	}

}
