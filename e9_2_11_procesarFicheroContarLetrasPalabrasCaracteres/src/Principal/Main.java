package Principal;

import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		
		
		Procesar p = new Procesar ("Mensaje.txt");
		System.out.println("El fichero tiene");
		System.out.println(p.caracteres()+" chars");
		System.out.println(p.lineas()+" lineas");
		System.out.println(p.palabras()+" palabras.");
	}

}
