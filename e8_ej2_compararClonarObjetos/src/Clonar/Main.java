package Clonar;

public class Main 
{
	public static void main(String[] args) 
	{
		Persona p1 = new Persona ("Pepe");
		Persona p2;
		Mascota m1 = new Mascota ("Milú");
		
		p1.setMascota(m1);
		p2 = p1.clone();
		
		p2.setNombre("Ana");
		
		m1.setApodo("Snoopy");
		
		System.out.println(p1);
		System.out.println(p2);
	}

}
