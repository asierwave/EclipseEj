package hechoPorJoaquin;

public class Main 
{
	public static void main(String[] args) 
	{
		CCAA c1 = new CCAA("Galicia","Santiago de compostela");
		Provincia p1 = new Provincia ("La Coruña",1125623);
		Provincia p2 = new Provincia ("Pontevedra",947870);
		
		p1.setComunidadAutonoma(c1);
		p2.setComunidadAutonoma(c1);
		
		System.out.println(c1); // Imprimimos una CCAA
		System.out.println(p1); // Imprimimos un par de Provincias
		System.out.println(p2);
	}
}
