package Principal;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {

		Empresa e1 = new Empresa("A-123456","Entregados S.L");
		Conductor c1 = new Conductor("Juan Pérez");
		Conductor c2 = new Conductor("María López");
		Conductor c3 = new Conductor("Carlos Ruiz");
		e1.alta(new Camion("1234-ABC", "Volvo FH16", LocalDate.of(2020, 5, 10), c1, 12000.0f, 8000.0f));
		e1.alta(new Furgoneta("5678-DEF", "Ford Transit", LocalDate.of(2019, 3, 22), c2, 9, true));
		e1.alta(new Motocicleta("9012-GHI", "Yamaha MT-07", LocalDate.of(2021, 7, 15), c3, 689));
		
		System.out.println(e1);
		System.out.println(e1.imprimirCoste());
		System.out.println(e1.imprimirITV());
		
	}

}
