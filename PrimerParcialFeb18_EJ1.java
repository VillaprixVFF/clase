package ex2018;


public class PrimerParcialFeb18_EJ1 {

	public static void main(String[] args) {
		System.out.println(esEureka(20));
	}
	
	public static int numeroDeDigitos(long numero) {
		int contador=0;
		while(numero>0) {
			numero /=10;
			contador++;
		}
		
		//139/10 = 13.9 --> 13 	c=1
		//12/10 = 1.3 --> 1  c=2
		//1/10 = 0.1 --> 0  c=3
				
		return contador;
	}
	
	public static boolean esEureka(long numero) {
		int digitos = numeroDeDigitos(numero);
		long copia = numero;
		long suma =0;
		
		if(digitos>0) {
			while(numero>0) {
				suma+=Math.pow(numero%10, digitos);
				numero/=10;
				digitos--;
			}
			
		//139 suma = 9^3   numero=13.9 ---> 13 digitos =2
		//suma= 9^3+3^2  numero = 1.39--->1 digitos =1
		//suma = 9^3+3^2+1^1  numero=0.139--->0 digitos =0;
			
		}
		
		if(suma==copia) {
			return true;
		}else {
			return false;
		}	
		
	}

}
