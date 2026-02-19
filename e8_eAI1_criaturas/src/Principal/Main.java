package Principal;

public class Main {

	public static void main(String[] args) {


		Criatura c1, c2;
		CiberRobotics cyber1;
		bioBestia b;
		nanoParticula n;
		
		c1 = new Criatura("ET");
		c2 = new Criatura("JaIme");
		cyber1= new CiberRobotics("Terminator I",25);
		b= new bioBestia ("Miguel",99);
		n= new nanoParticula ("Corona",50000);

		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(cyber1);
		System.out.println(b);
		System.out.println(n);
		
		
		
	}

}
