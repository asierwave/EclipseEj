package intento;

public class Exterior extends Camarote {
	
	private boolean hayTerraza;

	public Exterior(int numero, String camarote, boolean hayTerraza) {
		super(numero, camarote);
		this.hayTerraza = hayTerraza;
	}

	public boolean isHayTerraza() {
		return hayTerraza;
	}

	public void setHayTerraza(boolean hayTerraza) {
		this.hayTerraza = hayTerraza;
	}

	@Override
	public String toString() {
		return "Exterior [hayTerraza=" + hayTerraza + "]";
	}
	
	
	
	
	
	

}
