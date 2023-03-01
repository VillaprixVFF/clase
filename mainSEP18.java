package ex2018;

import utilidades.Teclado;

public class mainSEP18 {
	public static void main(String [] args) {
		int edad = Teclado.readInt();
		Persona p1 = new Persona("pepe",edad,'V',20,1);
		Persona p2 = new Persona();
		
		double IMCp1 = p1.IMC();
		if(IMCp1==-1) {
			System.out.println("infrapeso");
		}else if(IMCp1==0) {
			System.out.println("ideal");
		}else {
			System.out.println("sobrepeso");
		}
		
		System.out.println(p2.toString());
	}
}
