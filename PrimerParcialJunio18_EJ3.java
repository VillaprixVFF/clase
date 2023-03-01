package ex2018;

public class PrimerParcialJunio18_EJ3 {
	public static void main(String[]args) {
		int [][] a = {{1,2,3},{3,3,1},{1,1,2}};
		contar(a,1);
	}
	
	public static int contar(int [][] a, int clave) {
		
		int contador = 0;
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[i].length; j++) {
				if(a[i][j]==clave) {
					contador++;
				}
			}
		}
		
		System.out.println(contador);
		
		return contador;
	}
}
