package intento;

public class Interior extends Camarote {
	
	private boolean hayAseo;

	public Interior(int numero, String camarote, boolean hayAseo) {
		super(numero, camarote);
		this.hayAseo = hayAseo;
	}

	public boolean isHayAseo() {
		return hayAseo;
	}

	public void setHayAseo(boolean hayAseo) {
		this.hayAseo = hayAseo;
	}

	@Override
	public String toString() {
		return "Interior [hayAseo=" + hayAseo + "]"+super.toString();
		}
	
	
	
	

}
