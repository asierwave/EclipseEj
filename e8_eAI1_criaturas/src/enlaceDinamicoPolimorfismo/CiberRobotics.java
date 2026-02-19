package enlaceDinamicoPolimorfismo;

//Clase derivada de Criatura 
public class CiberRobotics extends Criatura 

{

	private float porcentajeRobotics;
	
	
	//Este sería el constructor por defecto
	
	//public CiberRobotics()
	//{
		//Hereda de los parámetros de la clase Criatura
	//	super();
	//}
	
	//Pero el constructor anterior no funcionaría, tendríamos que pasarle un nombre
	
	public CiberRobotics(String nombre, float pR)
	{
		super(nombre); //Los atributos los hereda pero no se puede utilizar a no ser que se usen getters y setters.
		this.porcentajeRobotics = pR;
	}


	@Override //Sobreescritura: esto es una anotación que significa que lo siguiente sustituye o reemplaza a un toString superior
	//Hereda el método toString pero lo reemplaza.
	
	public String toString() {
		
		String resultado = "";
		resultado += super.toString(); //Llamamos al toString heredado de Criatura, clase superior, clase padre
		resultado += "% Robot: "+this.porcentajeRobotics;
		return resultado;
	}
	
	
	
}



