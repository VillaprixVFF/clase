package ex2018;

public class PrimerParcialJunio18_EJ2 {
	public static void main(String[]args) {
		int [] a = {1,3,5,2};
		alternarElementos(a);
	}
	
	public static void alternarElementos(int [] a) {
		int contador=0;
		for(int i=0; i<a.length; i++) {
			contador += a[i];
		}
		
		int [] b = new int[contador];
		
		int k=0;
		for(int i=0; i<a.length; i++) {
			int valor = a[i];
			while(a[i]>0) {
				b[k] = valor;
				a[i]--;
				k++;
			}
		}
		
		for(int n:b) {
			System.out.print(n+" ");
		}
	}
	
}
