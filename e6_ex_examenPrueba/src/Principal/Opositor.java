package Principal;

import java.util.Scanner;

public class Opositor {

	private String nombre;
	private String dni;
	
	private float califIntro;
	private float calif1, calif2, calif3, calif4;
	private int contador;
	
	
	
	
	public float getCalifIntro() {
		return califIntro;
	}




	public void setCalifIntro(float califIntro) {
		this.califIntro = califIntro;
	}




	public Opositor(String nombre, String dni, float califIntro, float calif1, float calif2, float calif3, float calif4,
			int contador) {
		super();
		this.nombre = nombre;
		this.dni = dni;
		this.califIntro = califIntro;
		this.calif1 = calif1;
		this.calif2 = calif2;
		this.calif3 = calif3;
		this.calif4 = calif4;
		this.contador = contador;
	}


	// Constructor con Scanner
	public Opositor(Scanner teclado)
	{
		System.out.println("Introduzca el dni");
		dni = teclado.nextLine();
		System.out.println("Introduzca el nombre");
		nombre = teclado.nextLine();
		for (int i=0; i<4; i++) {
		System.out.println("Introduzca nota: ");
		califIntro = teclado.nextFloat();
			teclado.nextLine();
			addCalificacion(califIntro);
		}
	}
	


	private void addCalificacion (float califIntro) {
		
		boolean calif1rellena = false;
		boolean calif2rellena = false;
		boolean calif3rellena = false;
		boolean calif4rellena = false;

		
		while (calif1rellena ==false && calif2rellena == false && calif3rellena== false && calif4rellena== false) {
		contador++;
		
		switch (contador) {
		case 1: this.calif1 = califIntro; calif1rellena= true; break;
		case 2: this.calif2 = califIntro; calif2rellena=true; break;
		case 3: this.calif3 = califIntro; calif3rellena= true; break; 
		case 4: this.calif4 = califIntro; calif4rellena=true; break;
		
		}
		
		
		
		}
	
	
	}



	@Override
	public String toString() {
		return "Opositor [nombre=" + nombre + ", dni=" + dni + ", calif1=" + calif1
				+ ", calif2=" + calif2 + ", calif3=" + calif3 + ", calif4=" + calif4 + "]";
	}




	public float getCalif1() {
		return calif1;
	}




	public void setCalif1(float calif1) {
		this.calif1 = calif1;
	}




	public float getCalif2() {
		return calif2;
	}




	public void setCalif2(float calif2) {
		this.calif2 = calif2;
	}




	public float getCalif3() {
		return calif3;
	}




	public void setCalif3(float calif3) {
		this.calif3 = calif3;
	}




	public float getCalif4() {
		return calif4;
	}




	public void setCalif4(float calif4) {
		this.calif4 = calif4;
	}

}
