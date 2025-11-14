package Principal;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Indique altura");
		int altura = sc.nextInt();
		
		if (altura %2 !=0) {
		for(int i = 0 ; i < altura ; i++) {
			
			for(int j = 0 ; j < altura ; j++) {
				if(i==j || j==altura-1-i || i==0 || j==0 || i ==altura-1 || j==altura-1)
				System.out.print("*");
				else System.out.print(" ");
			}
			System.out.println();
		}
		
		} else {
			altura+=1;
			for(int i = 0 ; i < altura ; i++) {
				
				for(int j = 0 ; j < altura ; j++) {
					if(i==j || j==altura-1-i || i==0 || j==0 || i ==altura-1 || j==altura-1)
					System.out.print("*");
					else System.out.print(" ");
				}
				System.out.println();
			}
			
			
		}
	}

}