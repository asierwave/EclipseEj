package Principal;

public class Punto {
	
	// Atributos	
	
	private int valorX;
	private int valorY; 
	
	
	//Métodos constructor siempre tiene que ser público porque si no no podríamos crear los objetos
	
	public Punto (int valorX, int valorY) { 

		//Asignamos a los atributos esos argumentos
		this.valorX = valorX;
		this.valorY = valorY;

		
	}
	
	public void imprimir () {
		System.out.println (+this.valorX+":"+this.valorY);
	}
	
}
