package Principal;

public class Main {

	public static void main(String[] args) {

		Gato g1,g2;
		double costeXHora = 25;
		
		g1 = new Gato ("Minino",34,2);

		g1.calcularFactura(costeXHora); //se calcula el coste del gato
		System.out.println(g1); //llamamos directamente al método toString
		//aqui ya tiene el calculo adherido
		
		g2= new Gato ("Francisca",37,4);
		
		g2.calcularFactura(costeXHora); //se calcula el coste del gato
		System.out.println(g2); //llamamos directamente al método toString
		//aqui ya tiene el calculo adherido
		

		
	}

}
