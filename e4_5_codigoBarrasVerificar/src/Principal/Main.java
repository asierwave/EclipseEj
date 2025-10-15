package Principal;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		String codigoBarras;
		
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Escríbeme un código de barras de 8 números: ");
		codigoBarras= teclado.nextLine();
		
		int numControlIntroducido=codigoBarras.charAt(7)-'0';
		int num7=codigoBarras.charAt(6)-'0'; //Si le restas el codigo del 0 te sale el dígito correctamente, si no no te sale el valor, porque lo saca como carácter
		int num6=codigoBarras.charAt(5)-'0';
		int num5=codigoBarras.charAt(4)-'0';
		int num4=codigoBarras.charAt(3)-'0';
		int num3=codigoBarras.charAt(2)-'0';
		int num2=codigoBarras.charAt(1)-'0';
		int num1=codigoBarras.charAt(0)-'0';
		

		int sumaSieteNum = num1 * 3 + num2 * 1 + num3 * 3 + num4 * 1 + num5 * 3 + num6 * 1 + num7 * 3;
		
		System.out.println(sumaSieteNum);

		boolean resultado = (sumaSieteNum % 10 == 0);
		
		int numControlCorrecto = resultado ? 0 : (10 - sumaSieteNum%10);
		
		String salida = (numControlIntroducido == numControlCorrecto) ? "Está correcto" : "Está incorrecto";
		
		System.out.println(salida);

	}

}
