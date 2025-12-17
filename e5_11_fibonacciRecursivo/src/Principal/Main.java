package Principal;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(fib(3000));
		
	}

	
	
	public static int fib (int n)
	{
		int resultado;
		if (n==1)
			resultado = 0;
		else 
			if (n==2)
				resultado = 1;
			else
				resultado = fib(n-1) + fib(n-2);
		return resultado;
	}
}
