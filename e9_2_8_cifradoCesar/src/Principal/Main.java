package Principal;

import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {

		
		Criptografia c = new Criptografia(2);
		//Normalmente se hacen variaciones sobre la encriptación cesar para provocar que caracteres que se puedan repetir en el mensaje
		//encriptado, no se saquen a la primera, por ejemplo, ponderando al multiplicar por la posición del caracter en la palabra
		// ejemplo: "este" -> "gpgp" (Encriptación simple, se suman dos ubicaciones al carácter) frente a "este" -> "gpsd" (Encriptación mas compleja,
		// se multiplica lo anterior por la posición del carácter en la palabra. Este ejemplo es una visualización, no es exacto.
		
		c.encriptar("texto"); //Para encriptar
		
		c.desencriptar("texto"); //Para desencriptar el archivo _crypt
		
		
	}

}
