package Principal;

public class Movil
{
private String numero;
private Tarifa tarifa; // aqui lo que hago es llamar a la clase Enum
private double consumo;


public Movil(String numero, Tarifa tarifa) {
	
	this.numero = numero;
	this.tarifa = tarifa;
	this.consumo = 0;
}
public void llamar(int duracionSegundos)
{
this.consumo += duracionSegundos/60.0;	
}

public void reiniciarFactura()
{
this.consumo = 0;
}


public String toString()
{
	String resultado = "";
	resultado += "\nnúmero de movil "+this.numero+"\n";
	resultado += "con tarifa "+this.tarifa+"\n";
	resultado += "con un consumo"+this.consumo+"\n";
	resultado += "tiene de precio total " +(this.consumo * this.tarifa.getCosteMinuto());
	return resultado;
}

}
