package Principal;

public class Punto {
	
	// Atributos	
	
	private int valorX;
	private int valorY; 
	
	
	//Métodos constructor siempre tiene que ser público porque si no no podríamos crear los objetos
	
	public Punto (int valorX, int valorY) { 

		//Asignamos a los atributos esos argumentos (canales)
		this.valorX = valorX;
		this.valorY = valorY;

		
	}
	
	// Método específico para hacer una tarea, en este caso imprimir
	
	public void imprimir () {
		System.out.println (+this.valorX+":"+this.valorY);
	}
	
	//Método generado para exclusivamente imprimir desde Source > GenerateToString()...

	//@Override //Comentario
	//public String toString() {
		//return "Punto [valorX=" + valorX + ", valorY=" + valorY + "]";
	//}
	
	
	//Método toString, método exclusivamente para imprimir, que se llama cuando hay que convertir un objeto en una cadena, si no te da la ubicación del objeto
	public String toString() {
		return "(" + this.valorX+","+this.valorY+")";
	} 
	
}
