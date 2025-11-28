package Principal;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int numero;

        System.out.println("Introduce números. El programa terminará cuando introduzcas un número primo.");

        numero = input.nextInt();

        int acumulador = 0;
        int contador = 0;
        int mayor = numero;
        int menor = numero;

        while (!esPrimo(numero)) {

            acumulador += numero;
            contador++;

            if (numero > mayor)
                mayor = numero;

            if (numero < menor)
                menor = numero;

            System.out.println("Dame otro número (hasta que insertes un primo):");
            // Pedir otro número
            numero = input.nextInt();
        }

        if (contador > 0) {
            float media = (float) acumulador / contador;

            System.out.println("Has introducido " + contador + " números antes del primo.");
            System.out.println("Media: " + media);
            System.out.println("Mayor: " + mayor);
            System.out.println("Menor: " + menor);
        } else {
            System.out.println("El primer número era primo, no hay datos para mostrar.");
        }

    }

    public static boolean esPrimo(int numero) {
        if (numero <= 1) return false; // 1, 0 y negativos NO son primos

        for (int i = 2; i < numero; i++) {
            if (numero % i == 0)
                return false;
        }
        return true;
    }
}

