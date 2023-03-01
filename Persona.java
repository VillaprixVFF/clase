package ex2018;

import java.util.Random;

public class Persona implements IPersona {

	String nombre;
	int edad;
	char sexo;
	String dni;
	double peso;
	double altura;
	
	public Persona() {
		this.nombre="";
		this.edad = 0;
		this.sexo='M';
		this.dni=generaNIF();
		this.peso=0;
		this.altura=0;
	}
	
	public String generaNIF() {
		//char [] letras = {'A','B'};
		//Random numAleatorio = new Random();
		//long n = 0000000 + numAleatorio.nextInt(9999999);
		//return n+letras[n%23];
		return "2141241Q";
	}
	
	public Persona(String nombre, int edad, char sexo, double peso, double altura) {
		this.nombre=nombre;
		this.edad = edad;
		this.sexo=sexo;
		this.dni=generaNIF();
		this.peso=peso;
		this.altura=altura;
	}

	@Override
	public String getNombre() {
		// TODO Auto-generated method stub
		return nombre;
	}

	@Override
	public int getEdad() {
		// TODO Auto-generated method stub
		return edad;
	}

	@Override
	public char getSexo() {
		// TODO Auto-generated method stub
		return sexo;
	}

	@Override
	public String getNIF() {
		// TODO Auto-generated method stub
		return dni;
	}

	@Override
	public double getPeso() {
		// TODO Auto-generated method stub
		return peso;
	}

	@Override
	public double getAltura() {
		return altura;
	}
	
	public boolean esMayorEdad() {
		if(edad>=18) {
			return true;
		}else {
			return false;
		}
	}
	
	public boolean comprobarSexo() {
		if(sexo=='V') {
			return true;
		}else if(sexo=='M') {
			return true;
		}else {
			this.sexo='M';
			return false;
		}
	}
	
	public double IMC() {
		double IMC = peso/Math.pow(altura, 2);
		if(IMC<=20) {
			return -1;
		}else if(IMC <=25) {
			return 0;
		}else {
			return 1;
		}
	}
	
	public String toString() {
		return "Nombre: "+nombre+", edad: "+edad+" años, NIF: "+dni;
	}
	
}
