package Principal;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		Billetes billete = new Billetes(sc);
		
		System.out.println(billete);
		sc.close();
		
	}

}
