package Principal;

public class Alumno {
	
	
	private static int secuencia = 1; //Esto hace que todos los metodos de la clase utilicen este valor y esta variable de manera estatica, siempre que se llame será la misma
	private int codigo;
	private String nombre;
	
	//Encontraremos aplicaciones y webs con las siguientes estructuras. 
	
	//Sistema antiguo
	private int codigoGrupo; // en el caso de MODELO RELACIONAL //solamente relacionamos con su identificador
	
	//Sistema nuevo (más usual y lógico)
	private Grupo grupo; //en el caso de programación orientada A OBJETOS
	//LLAMAMOS DIRECTAMENTE A LA CLASE GRUPO TRAEMOS ENTERO EL GRUPO RELACIONADO
	

	//Constructor 1
	
	public Alumno (String nombre)
	{
	this.codigo = secuencia;
	secuencia++;
	this.nombre = nombre;
	}
	
	public String toString()
	{
		String resultado = "";
		resultado += "Código: "+this.codigo;
		resultado += "Nombre: "+this.nombre;
		resultado += "Grupo: "+((this.grupo==null)? "Sin grupo": grupo.getDenominacion());
		return resultado;

	}

	public void setGrupo(Grupo g) {
		
		this.grupo = g;
	}
	
	
}



