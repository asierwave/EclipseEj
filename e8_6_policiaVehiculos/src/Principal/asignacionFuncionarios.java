

package Principal;


public class asignacionFuncionarios {
	
	private funcionario asignacion[];
	private final int nMaxFuncionarios = 2;
	private int nFuncionariosAsignacion;
	
	public asignacionFuncionarios ()
	{
		this.asignacion = new funcionario[this.nMaxFuncionarios];
		
	}
	
	public boolean alta(funcionario f) {
		boolean exito = false;
		
		if (nFuncionariosAsignacion < asignacion.length)
		{
			exito = true;
			asignacion[this.nFuncionariosAsignacion]=f;
			this.nFuncionariosAsignacion++;
			
		}
		return exito;
			
	}
	

	
	
	
	
	public String toString() {
		String resultado = "";
		for (int i= 0; i<nFuncionariosAsignacion; i++)
			resultado += asignacion[i]+"\n";
		return resultado;
	}
	

}
