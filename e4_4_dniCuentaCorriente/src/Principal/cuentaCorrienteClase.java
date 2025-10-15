package Principal;

import java.util.Scanner;

public class cuentaCorrienteClase {
	
	
	//Atributos
	private String dni;
	private String nombre;
	private double saldo;
	
	
	//No puede haber dos constructores que reciba un string, no se concibe en JAVA. Número de parámetros tipo de parámetros y orden de parámetros tiene que ser distinto para permitirlo.
	
	//Método recibe parámetros (entre paréntesis) y nos retorna un objeto. Método constructor del mismo nombre que la clase
	public cuentaCorrienteClase (String dni, String nombre) {
		
		this.dni = dni;
		this.nombre = nombre;
		this.saldo = 0.0;
	
	}
	
	//Método recibe parámetros (entre paréntesis) y nos retorna un objeto. Otro método constructor del mismo nombre que la clase
	public cuentaCorrienteClase (Scanner teclado) { //Introduce como parámetro del método el scanner para poder introducir info por teclado
		
		System.out.println("Dime un dni: ");
		this.dni = teclado.nextLine();
		System.out.println("Dime un nombre: ");
		this.nombre = teclado.nextLine();
		
		this.saldo = 0.0;
	
	}
	
	
	
	
	
	//Método recibe parámetros (una cantidad de dinero) (entre paréntesis) y nos retorna TRUE O FALSE

	public boolean sacar (double cantidad) {
		
		boolean resultado;
		resultado = this.saldo >= cantidad; //esta condición devolverá TRUE O FALSE.
		this.saldo = (resultado) ? this.saldo - cantidad : this.saldo; //Como resultado es una condición se pone como pregunta la variable directamente.
		return resultado; // es el boolean que devuelve el método por lo que cuando se haga en el main: valor = cuentaCorrienteClase.sacar(); te dará el valor booleano de resultado
		
	}
	
	//Método recibe parámetros (una cantidad de dinero) (entre paréntesis) y no nos va a retornar nada (void)

	public void ingresar (double cantidad) { //public es que va a ser visible desde el exterior, void significa es que cuando se ejecute el método, no me va a devolver nada, si quisieras que te devolviese un valor numérico en vez de voi se podría poner un int o un double.
		this.saldo += cantidad;
		
	}
	
	//Método recibe parámetros (una cadena de texto string) (entre paréntesis) y nos retorna otro String

	public String toString() { //Lo que devuelve este método es un String
		
		String resultado;
		resultado = "La cuenta de nombre "+this.nombre;
		//resultado = resultado + "La cuenta de nombre cuyo dni es "+this.dni; Otra opción
		resultado += " cuyo dni es "+this.dni; //+= es sumar el resultado mas lo demás igual que la opción superior comentada
		resultado += " tiene actualmente "+this.saldo;
		resultado += " euros de saldo";
		
		return resultado;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	

}


