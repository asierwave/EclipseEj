package Principal;

public class Main {

	public static void main(String[] args) {
		
		Empleado e1 = new Empleado ("Pepe", 15, 2500);
		
		
		e1.setPermanencia(30);
		e1.aumentarSalario(10);
		
		System.out.println(e1);
		
	}

}
