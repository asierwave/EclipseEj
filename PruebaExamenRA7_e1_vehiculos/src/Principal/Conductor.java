package Principal;

public class Conductor {
	
	private static int secuencia = 1;
	private int id;
	private String nombre;
	
	
	public Conductor(String nombre) {
		super();
		this.id = secuencia++;
		this.nombre = nombre;
	}



	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	public String toString() {
		String respuesta = "";
		respuesta += this.nombre;
		return respuesta;
	}
	
	

}
