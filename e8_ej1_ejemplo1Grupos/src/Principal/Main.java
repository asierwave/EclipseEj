package Principal;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Grupo g1 = new Grupo("DAW 1V");
		Alumno a1 = new Alumno ("Santiago");
		Alumno a2 = new Alumno ("Alejandra");

		
		a1.setGrupo(g1);
		a2.setGrupo(g1);
		
	

		System.out.println(a1);
		
		
		g1.addAlumno(a1);
		g1.addAlumno(a2);
		System.out.println(g1);
		
		
		
	}

}
