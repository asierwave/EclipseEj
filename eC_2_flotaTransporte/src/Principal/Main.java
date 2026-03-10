package Principal;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		Vehiculo m2=null; //para que me deje llamarlo fuera del try
		
		empresaTransporte flota = new empresaTransporte(4);
		

		Vehiculo m1 = new Motos("1234F", "Yamagata", new Conductor("Asier"), LocalDate.of(2022, 12, 8), true,false);

		

		flota.añadirVehiculo(m1);
		
		try {
			m2 = (Vehiculo)m1.clone();
			m2.setModelo("Clon");
//			Conductor c2 = m2.getC();
//			c2 = new Conductor ("Pedrito");
//			m2.setC(c2);
			m2.setFechaFabricacion(LocalDate.of(2019, 11, 8));
			
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
		
		
		
		
		flota.añadirVehiculo(new Furgoneta("asdASF", "fofofo", new Conductor("Lan"), LocalDate.of(2022, 12, 8)));
		flota.añadirVehiculo(new Camion("32123f", "accaca", new Conductor("Jaime"), LocalDate.of(2022, 12, 8),999));
		
		flota.añadirVehiculo(m2);
		
	

		System.out.println(flota);
		
		System.out.println(m1.compareTo(m2));
		
		m1.setModelo("Takamoto");
		
		System.out.println(m1.equals(m2));

		
		String comparacion = m1.compareTo(m2)==0 ? "La moto 1 es igual de reciente que la moto 2": ((m1.compareTo(m2)<0)? "La moto es mas reciente que la moto 2": "La moto es mas antigua que la moto 2"); 
		System.out.println(comparacion);
		
	}

}
