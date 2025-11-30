package Principal;

public class Main {
	
	//Todos los sumatorios serán siempre bucles for

	public static void main(String[] args) {

		Seno s = new Seno();
		double resultado;
		
		resultado = s.calcularSeno(Math.PI/4, 10); //Breakpoint para depuracion
		resultado = s.calcularCoseno(Math.PI/4, 10); //Breakpoint para depuracion

		
		System.out.println("El seno de Pi/4 vale "+resultado);
		System.out.println("Si lo calcula Java vale "+Math.sin(Math.PI/4));
	}

}


