package Principal;

public class Main {

	public static void main(String[] args) {

		
		Repositorio empleados = new Repositorio();
		
		empleados.alta(new Comercial("1234", "Pepe", 1500, 10));
		empleados.alta(new Consultor("1234", "Jaime", 1300, 15, 25));

		
		
		
	}

}
