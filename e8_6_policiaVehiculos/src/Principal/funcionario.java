package Principal;

public class funcionario {
	private String nPlaca;

	public funcionario(String nPlaca) {
		super();
		this.nPlaca = nPlaca;
	}

	public String getnPlaca() {
		return nPlaca;
	}

	public void setnPlaca(String nPlaca) {
		this.nPlaca = nPlaca;
	}

	@Override
	public String toString() {
		return "funcionario [nPlaca=" + nPlaca + "]";
	}
	
	
	
	
}
