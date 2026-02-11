package Principal;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CA ca1 = new CA("Castilla y León");
		CA ca2 = new CA("Cantabria");
		
		Provincia p1 = new Provincia ("Avila", 44034);
		Provincia p2 = new Provincia ("Segovia",3432);
		Provincia p3 = new Provincia ("Santander",12334);

		
		p1.setGrupo(ca1);
		p2.setGrupo(ca1);
		p3.setGrupo(ca2);
	

		System.out.println(ca1);
		
		System.out.println(ca2);
		
		
		
		
	}

}