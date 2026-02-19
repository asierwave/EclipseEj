package Principal;

public class Criatura {
	
	private static int secuencia = 1;
	private int id;
	private String nombre;
	private int nivelEnergia;
	
	
	//Lo que queremos que solo senhaga una vez siempre en todas los métodos se puede poner así. Solo se va a ejecutar una vez
	//NO una vez por objeto, solo una vez
	
	static //Común para todos los objetos de la clase (tiene que estar construido al menos 1)
	{
		System.out.println("Holaaa");
	}

	//Ahora solo tenemos un solo constructor, por defecto
	
	public Criatura(String nombre)
	{
		this.id= secuencia++; //Linkamos el id del objeto a la secuencia (que es estática,por lo que se comparte en todos los objetos) sumamos 1 cada vez que se cree una criatura.
		this.nombre = nombre;
		this.nivelEnergia = 10; //Valor inicial por defecto de energía: 10 para todas las criaturas creadas
	}
	
	//Ahora tenemos un constructor, asi que no usa el de por defecto
	
	
	
	public String toString ()
	{
		String resultado = "";
		resultado += "id: "+this.id;
		resultado += " Nombre: "+this.nombre;
		resultado += " Energía: "+ this.nivelEnergia;
		return resultado;
	}

	
	
}