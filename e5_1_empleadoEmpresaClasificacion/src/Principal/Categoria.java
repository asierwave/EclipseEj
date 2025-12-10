package Principal;


//El enum es una pequeña base de datos que vamos a tener en la memoria para trabajar con ello
public enum Categoria {
	
	//Con el enum, a la hora de crear la clase, también creas los objetos
	
	Principiante (1000,0), //este es el nombre del objeto
	Intermedio (1500,100),
	Sènior (2500,300);
	
	private double salario;
	private double prima; 
	
	private Categoria (double salario, double prima)
	{
		this.salario = salario;
		this.prima = prima;
	}

}
