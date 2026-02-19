package enlaceDinamicoPolimorfismo;

public class Main {

	public static void main(String[] args) {


		Criatura vector[] = new Criatura[5];
		
		vector[0] = new Criatura("ET");
		vector[1] = new Criatura("JaIme");
		vector[2]= new CiberRobotics("Terminator I",25);
		vector[3]= new bioBestia ("Miguel",99);
		vector[4]= new nanoParticula ("Corona",50000);

		
		for (int i= 0; i<vector.length; i++) {
			
			 // if (vector[i].getClass()) {Esto no hace falta porque sabe de cuál clase coger el toString
				System.out.println(vector[i]);
		//Llamamos al método de toString en función de la clase del objeto guardado en el vector
		//ESTO ES LA VENTAJA DEL POLIMORFISMO
		}
		
		
		//Para llamar a bioBestia y utilizar métodos de bioBestia en la clase Main tengo que decir que el objeto en la posición 3 del vector es de clase bioBestia
		//Si no es de esa clase, dará error, de ahí la comprobación con el IF
		
		if (vector[3].getClass()==bioBestia.class) {
			
			System.out.println(((bioBestia) vector[3]).rugir());
			
		}
	}
	

}
