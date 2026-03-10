package Principal;

public class Main 
{
	public static void main(String[] args) 
	{

		Barco b = new Barco("Rotterdam",10);
		
		b.alta(new Interior (657,"Sunset",true));
		b.alta(new Exterior (890,"Pool",true,"Popa"));
		b.alta(new Suite (1198,"Terrace",6));
		
		System.out.println(b);
		
	}
}
