package Principal;

import java.util.Scanner;

public class Fraccion {

	
	//Atributos
	private int numerador;
	private int denominador;
	
	
	//Métodos constructores
	
	public Fraccion (int n, int d)
	{
		this.numerador = n;
		this.denominador = d;
		
	}
	
	public Fraccion (Scanner sc) {
		System.out.println("Introduzca numerador");
		this.numerador = sc.nextInt();
		System.out.println("Introduzca denominador");
		this.denominador = sc.nextInt();
		
	}
	
	
	//Métodos para hacer operaciones aritméticas
	
	public Fraccion sumar (Fraccion f) {
		Fraccion resultado; //Fracción resultado
		int p,q; //Numeradoe y denominador del resultado
		
		p = this.numerador* f.denominador +f.numerador * this.denominador;
		q = this.denominador * f.denominador;
		
		resultado = new Fraccion (p,q);
		return resultado;
			
				}
	
	
	public Fraccion restar (Fraccion f) {
		Fraccion resultado; //Fracción resultado
		int p,q; //Numerador y denominador del resultado
		
		p = this.numerador* f.denominador - f.numerador * this.denominador;
		q = this.denominador * f.denominador;
		
		resultado = new Fraccion (p,q);
		return resultado;
				}
	
	
	public Fraccion multiplicar(Fraccion f) {
		Fraccion resultado;
		int p,q;
		
		p = this.numerador * f.numerador;
		q = this.denominador * f.denominador;
		
		resultado = new Fraccion (p,q);
		return resultado;
	}
	
	
	public Fraccion cociente (Fraccion f) {
		Fraccion resultado;
		int p,q;
		
		p = this.numerador * f.denominador;
		q = this.denominador * f.numerador;
		
		resultado = new Fraccion (p,q);
		return resultado;
		
	}
	
	
	//Métodos getters and setters
	

	public int getNumerador() {
		return numerador;
	}

	public void setNumerador(int numerador) {
		this.numerador = numerador;
	}

	public int getDenominador() {
		return denominador;
	}

	public void setDenominador(int denominador) {
		this.denominador = denominador;
	}
	
	
	
	
	
	//Método string
	
	public String toString() {  //No recibe nada
		
	float valor = (float) this.numerador / this.denominador;
	return this.numerador + "/"+this.denominador + "("+valor+")";

	}

	
}
