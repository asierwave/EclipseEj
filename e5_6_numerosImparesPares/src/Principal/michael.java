package Principal;

import java.util.Scanner;

public class michael {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduzca el primer numero");
        long numero1 = teclado.nextLong();

        System.out.println("Introduzca el segundo numero");
        long numero2 = teclado.nextLong();

        teclado.next(); // LIMPIA EL BUFFER 
        System.out.println("Para los impares presione ( i ) - Para los pares presione ( p )");
        String letra = teclado.next();
        letra = letra.trim();
        letra = letra.toLowerCase(); 

        char letraChar = letra.charAt(0); 

        long mayor = (numero1 > numero2) ? numero1 : numero2;

        long menor = (numero1 < numero2) ? numero1 : numero2;

        char i = 'i';
        char p = 'p';

        long it = menor;

        if (p == letraChar) {

            for ( it = menor ; it <= mayor ; it++ ) {

            if (it % 2 == 0) {
                System.out.println(it+" Es par");
            }

            }

        }

        if (i == letraChar) {

            for ( it = menor ; it <= mayor ; it++ ) {

                if (it % 2 != 0) {
                    System.out.println(it+" Es impar");
                }

                }

        }
        else {

            if (letraChar != i && letraChar != p ) { 


            }
        }



    }

}