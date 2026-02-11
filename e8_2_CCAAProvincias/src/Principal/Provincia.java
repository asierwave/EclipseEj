package Principal;

public class Provincia {

	
	private static int secuencia = 1; //Esto hace que todos los metodos de la clase utilicen este valor y esta variable de manera estatica, siempre que se llame será la misma
	private int codigo;
	private String nombre;
	private int poblacion;
	
	//Encontraremos aplicaciones y webs con las siguientes estructuras. 
	
	//Sistema antiguo
	private int codigoGrupo; // en el caso de MODELO RELACIONAL //solamente relacionamos con su identificador
	
	//Sistema nuevo (más usual y lógico)
	private CA ca; //en el caso de programación orientada A OBJETOS
	//LLAMAMOS DIRECTAMENTE A LA CLASE GRUPO TRAEMOS ENTERO EL GRUPO RELACIONADO
	

	//Constructor 1
	
	public Provincia (String nombre, int poblacion)
	{
	this.poblacion = poblacion;
	}
	
	public String toString()
	{
		String resultado = "";
		resultado += "Código: "+this.codigo;
		resultado += "Nombre: "+this.nombre;
		resultado += "Poblacion: "+this.poblacion;
		resultado += "Provincia: "+((this.ca==null)? "Sin provincia": ca.getDenominacion());
		return resultado;

	}

	public void setGrupo(CA ca) {
		
		this.ca = ca;
	}
	
	
}
