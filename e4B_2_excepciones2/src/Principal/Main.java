package Principal;

public class Main {

	public static void main(String[] args) {

		System.out.println("Voy a dormir un ratito");
		dormirUnRato();
		System.out.println("Me levanto");
	}

	
	
	
	public static void dormirUnRato()
	{
		try {
			Thread.sleep(4000);
			
		} catch (InterruptedException e) {
			e.printStackTrace(); //pasa por consola los problemas de una detención espontánea
		}
	}
}
