package Principal;

//import Principal.Modelo.Administrativo;
//import Principal.Modelo.Analista;
//import Principal.Modelo.Programador;
//import Principal.Modelo.Trabajador;
import Principal.Modelo.*;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//POLIMORFISMO EN ENLACE DINÁMICO, 
		//cuando puedo meter en el vector Trabajador un niteo programador o analista y que se comporten de forma personalizada
		//los métodos de cada objeto trabajador se comportará dinámicamente dependiendo de como se creen (como Programador, Analista, Administarivo...)
		Trabajador p = new Programador ("123", "Santiago", 1800, "TSDAW");
		Trabajador a = new Analista ("456", "Aila", 3500, "INGENIERA DE SOFTWARE");
		Trabajador ad = new Administrativo ("789","Jaime", 400, "GESTOR");

		
		Empresa empresa = new Empresa("A123", "Residuos hUmanos SL.", 10);
		empresa.alta(new Analista ("456", "Aila", 3500, "INGENIERA DE SOFTWARE"));
		empresa.alta(new Programador ("123", "Santiago", 1800, "TSDAW"));
		empresa.alta(new Administrativo ("789","Jaime", 400, "GESTOR"));
		
		System.out.println(empresa);
		
	
	}

}
