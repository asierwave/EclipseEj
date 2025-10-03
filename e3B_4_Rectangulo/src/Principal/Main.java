package Principal;

public class Main {

	public static void main(String[] args) {

		
		Rectangulo r1 = new Rectangulo (0,0,5,5);
		Rectangulo r2= new Rectangulo (7,9,2,3);
		
		System.out.println ("El rectángulo r1 es "+r1);
		System.out.println ("El rectángulo r2 es "+r2);
		
		System.out.println ("El área de r1 vale "+r1.getArea()); // Hay que poner el método getArea con el rectángulo del que queremos calcular

	}

}
