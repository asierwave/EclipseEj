package Principal;

public class Rectangulo {
	
	
	private int x1, y1;
	private int x2, y2;
	
	//Constructor generado a través de Source > Generate Constructor using fields...
	public Rectangulo(int x1, int y1, int x2, int y2) {
		super();
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
	}


	@Override
	public String toString() {
		return "("+this.x1+","+this.y1+","+this.x1+","+this.y2+")";
	}
	
	
	//Getters y Setters generados a través de Source > Generate Getters & Setters

	public int getX1() {
		return x1;
	}

	public void setX1(int x1) {
		this.x1 = x1;
	}

	public int getY1() {
		return y1;
	}

	public void setY1(int y1) {
		this.y1 = y1;
	}

	public int getX2() {
		return x2;
	}

	public void setX2(int x2) {
		this.x2 = x2;
	}

	public int getY2() {
		return y2;
	}

	public void setY2(int y2) {
		this.y2 = y2;
	}
	
	

	//Método para calcular la superficie
	
	public int getArea() {
		return Math.abs(x2-x1)*Math.abs(y2-y1);
	}
	
	
}
