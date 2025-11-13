package Principal;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        float cantidadLetras;
        char letraEnChar;
        int contador = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca una palabra");
        String palabra= sc.nextLine();

        palabra = palabra.toLowerCase();


        cantidadLetras = palabra.length();
        
        
        
        int MitadRedondeoAbajo = (int) Math.floor(cantidadLetras/2f);
        int MitadRedondeoArriba = (int)Math.ceil(cantidadLetras/2f);
        
        System.out.println(cantidadLetras);
        System.out.println(MitadRedondeoAbajo);
        System.out.println(MitadRedondeoArriba);

        
        String parteInicial= palabra.substring(0,MitadRedondeoAbajo);
        String parteFinal= palabra.substring(MitadRedondeoArriba,(int)cantidadLetras);
        
        String parteFinalInvertida = "";
        char caracterAInvertir;
        
        


        for (int i=(int)cantidadLetras-1; i>=cantidadLetras/2; i--) {
        	caracterAInvertir=palabra.charAt(i);
        	//parteFinalInvertida=caracterAInvertir+""; forma usual de pasar char a String
        	parteFinalInvertida += caracterAInvertir; //asi tambien se pasa de char a String
        	
    }

        System.out.println(parteFinalInvertida);
     
        
        System.out.println(parteInicial);
     
        if (parteInicial.equals(parteFinalInvertida))
        	System.out.println(palabra + " es un palíndromo");
        else System.out.println(palabra + " no es un palíndromo");
        

        //Y los números o las palabras de una letra<??






    }



}