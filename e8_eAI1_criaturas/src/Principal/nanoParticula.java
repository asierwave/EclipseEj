package Principal;

public class nanoParticula extends Criatura {

	private int velocidadMultiplicacion;
	
	public nanoParticula(String nombre, int velocidadMultiplicacion)
	{
		super(nombre);
		this.velocidadMultiplicacion = velocidadMultiplicacion;
		
	}
	
	@Override //Sobreescritura: esto es una anotación que significa que lo siguiente sustituye o reemplaza a un toString superior
	//Hereda el método toString pero lo reemplaza.
	
	public String toString() {
		
		String resultado = "";
		resultado += super.toString(); //Llamamos al toString heredado de Criatura, clase superior, clase padre
		resultado += "Velocidad: "+this.velocidadMultiplicacion;
		return resultado;
	}
	
	
	
	
}
