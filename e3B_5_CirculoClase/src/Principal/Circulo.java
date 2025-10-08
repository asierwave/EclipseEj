package Principal;

public class Circulo {

	
	//Atributos
	private double radio;
	double areaCirculo;
	
	
	
	//Método constructor de los objetos Círculo

	public Circulo(double radio) {
		super();
		this.radio = radio;
		
		
	}
	
	
	//Método para calcular el área del círculo
	public double areaCirculo () { //Es un getter, podría ser getArea
		
		return Math.PI* Math.pow(radio,2);
		
	}


	//Método para calcular el perímetro del círculo

	public double perimetroCirculo () { //Es un getter, podría ser getPerimetro
	
	return 2* Math.PI * Math.pow(radio,2);
	
	}

	
	//Método para imprimir el objeto (formato)

@Override
public String toString() {
	return "Circulo [radio=" + radio + "]";
}


	
	
}
