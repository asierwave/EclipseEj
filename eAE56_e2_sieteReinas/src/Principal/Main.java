package Principal;

public class Main {

	public static void main(String[] args) {

		
		Tablero prueba1 = new Tablero();
		
		System.out.println(prueba1);

		
	
		if(prueba1.encontrarSolucion()) 
			System.out.println(prueba1);
		
		
		System.out.println("Intentos de relleno: "+prueba1.getnRellenos());

	
		
	}

}
