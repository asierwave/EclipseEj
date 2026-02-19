package enlaceDinamicoPolimorfismo;

public class bioBestia extends Criatura {

	private float agresividad;
	
	public bioBestia( String nombre, float agresividad) {
		super(nombre);
		this.agresividad=agresividad;
	}
	
	
	@Override //Sobreescritura: esto es una anotación que significa que lo siguiente sustituye o reemplaza a un toString superior
	//Hereda el método toString pero lo reemplaza.
	
	public String toString() {
		
		String resultado = "";
		resultado += super.toString(); //Llamamos al toString heredado de Criatura, clase superior, clase padre
		resultado += "% Agresividad: "+this.agresividad; //Se utiliza % po
		return resultado;
	}
	
	
	public String rugir() {
		
		String resultado = "";
		resultado += "ROARRRRR";
		
		return resultado;
		
	}
	
	
	
	
}
