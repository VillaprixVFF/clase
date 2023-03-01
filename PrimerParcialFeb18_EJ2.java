package ex2018;


public class PrimerParcialFeb18_EJ2 {

	public static void main(String[] args) {
		int [] a = {1,3,4,1,2,1,1,2};
		
		int [] resultado = Ordenar(a);
		//for(int i=0; i<resultado.length; i++) {
		//	System.out.print(resultado[i]+" ");
		//}
		
		System.out.println(elementosDiferentes(a));
	}
	
	public static boolean estaOrdenado(int [] a) {
		if(a.length==0 || a==null) return false;
		
		for(int i=0; i<a.length-1; i++) {
			if(a[i]>a[i+1]) {
				return false;
			}
		}
		return true;
	}
	
	public static int [] Ordenar(int []a) {
		boolean ordenado = estaOrdenado(a);
		if(ordenado==true) return a;
				
		int aux=0;
		for(int i=0; i<a.length; i++){
			for(int j=0; j<a.length; j++) {
				if(a[i]<a[j]) {
					aux = a[i];
					a[i] = a[j];
					a[j] = aux;
				}
			}
		}
		
		return a;
		
	}
	
	public static int elementosDiferentes(int []a) {
		int [] ordenado = Ordenar(a);
		int contador = 1;
		for(int i=0; i<ordenado.length-1; i++) {
			if(ordenado[i]!=ordenado[i+1]) {
				contador++;
			}
		}
		if(contador==1) return 1;
		return contador;
	}

}
