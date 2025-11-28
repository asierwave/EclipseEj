package Principal;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    	
    	
    	Scanner input = new Scanner (System.in);
    	int p = 0;
    	String modalidad = null;

    	
    	do {
    		
    		try {
    	System.out.println("¿Quieres que p sea positivo o negativo? escribe p para positivo y n para negativo. Cualquier otra cosa para salir");
    	modalidad= input.next().toLowerCase();
    	input.nextLine();
    	
    	
    	if (modalidad.equals("p") || modalidad.equals("n")) {
    		System.out.println("Dame un número para p: ");
        	p = input.nextInt();
    	} else {
    		System.out.println("////////////ADIÓS///////////////");
    		break;
    	}
    	
    	
    	
    	
    	switch (modalidad) {
    		
    		case "p": imprimePositivo(p);break;
    		case "n": imprimeNegativo(p); break;
    	
    		default: System.out.println("Escribe una letra de las que se muestran, no otra");
    		break;
    	}
    	} catch(InputMismatchException e) {
    		System.out.println("Escribe una letra, no otro tipo de valor");
    		input.nextLine();
    	}
        
    	} while (p !=999);
    	
    }   	
    	


    public static void imprimePositivo(int p) {
        try {

            if (p < 0) {
                throw new NumeroNegativoException("Introduce un número positivo");
            }
            
            else {
        		System.out.println(p+" es positivo");
        		System.out.println();
        	}


        } catch (NumeroNegativoException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    
    
public static void imprimeNegativo(int p) {
	try {
	
	if (p >= 0) 
			throw new NumeroPositivoException ("Introduce un número negativo");
	else {
		System.out.println(p+" es negativo");
		System.out.println();
	}
	} catch (NumeroPositivoException e) {
		System.out.println("Error: " + e.getMessage());
	}
	
	}
    
    

    public static class NumeroNegativoException extends Exception {

        public NumeroNegativoException(String mensaje) {
            super(mensaje);
        }
    }
    
    public static class NumeroPositivoException extends Exception {
    	
    	public NumeroPositivoException (String mensaje) {
    		super (mensaje);
    	}
    }
    
    
    

    	
    	
}

