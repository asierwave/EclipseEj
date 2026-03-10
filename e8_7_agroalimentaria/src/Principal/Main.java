package Principal;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Producto c1 = new Congelado (LocalDate.of(2024, 12, 23), 123124, "Pescado", LocalDate.of(2024, 12, 23), 3F);
		
		
		System.out.println(c1);
	}

}
