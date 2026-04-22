package Principal;

public class Electrica extends Bicicleta {

	int autonomia;
	boolean bateriaExtraible;
	
	
	
	public Electrica(String tipo, String color, float alquilerHora, int autonomia, boolean bateriaExtraible) {
		super(tipo, color, alquilerHora);
		this.autonomia = autonomia;
		this.bateriaExtraible = bateriaExtraible;
	}



	public int getAutonomia() {
		return autonomia;
	}



	public void setAutonomia(int autonomia) {
		this.autonomia = autonomia;
	}



	public boolean isBateriaExtraible() {
		return bateriaExtraible;
	}



	public void setBateriaExtraible(boolean bateriaExtraible) {
		this.bateriaExtraible = bateriaExtraible;
	}



	@Override
	public String toString() {
		return super.toString()+" de autonomia " + autonomia + "km y "+(bateriaExtraible? "batería extraible":"batería fija");
	}
	
	
	
	
	
	
	
	
}
