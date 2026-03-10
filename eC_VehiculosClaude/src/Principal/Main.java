package Principal;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vehiculo c1 = new Coche("Toyota", 2020, 2);
		Vehiculo m1 = new Moto("Yamagata", 2020, 600);
		Vehiculo c2;
		
		flotaVehiculos flota = new flotaVehiculos();

		try {
			c2 = (Vehiculo) c1.clone();
			c2.setMarca("BYD");
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		
		}
		
		
		if (c1.equals(m1)) 
			System.out.println("Son iguales");
		else
			System.out.println("No son iguales");
		
		
		
		System.out.println(c1.hashCode());
		System.out.println(m1.hashCode());
		
		
		System.out.println(c1.describir());
		System.out.println(m1.describir());
		

		
		System.out.println(c1.compareTo(m1));
		
		flota.añadir(m1);
		flota.añadir(c1);
		
		System.out.println(flota.listar());
		

	}

}
