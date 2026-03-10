package intento;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//Enlace dinámico me garantiza que se va a crear el interior como objeto Camarote
		Camarote i = new Interior (12, "Pool", true);
		Camarote e = new Exterior (14, "Pool", false);
		
		
		System.out.println(i);
		System.out.println(e);
		
		
		
	}

}
