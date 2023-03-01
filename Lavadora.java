package ex2018;

import java.text.DecimalFormat;

public class Lavadora implements IElectrodomestico{

	//VARIABLES
	double precio;
	double consumo;
	codigoBarras codigo;
	String color;
	
	//CONSTRUCTOR
	public Lavadora() {
		precio = 100;
		consumo = 100;
		color = "Blanco";
		codigo = new codigoBarras();
	}
	
	public Lavadora(double p, double cons, codigoBarras cod, String color) {
		if(p<100) {
			this.precio=100;
		}else {
			this.precio=p;
		}
		
		if(cons<100) {
			this.consumo=100;
		}else {
			this.consumo=cons;
		}
		
		this.codigo = cod;
		this.color = color;		
	}
	
	//Metodos de consulta GET
	public double getConsumo() {
		return consumo;
	}
	
	//Metodos para actualizar SET
	public void setColor(String colornuevo) {
		this.color=colornuevo;
	}
	
	//Método to String
	public String toString() {
		DecimalFormat form = new DecimalFormat();
		form.setMaximumFractionDigits(2);
		return "Precio: "+form.format(precio)+" euros, Consumo: "+consumo+" kWh, Color: "+color;
	}

	@Override
	public double getPrecio() {
		return precio;
	}

	@Override
	public void setPrecio(double p) {
		this.precio=p;
		
	}

	@Override
	public codigoBarras getCodigo() {
		return codigo;
	}
	
}
