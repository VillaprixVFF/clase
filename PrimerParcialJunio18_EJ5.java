package ex2018;

public class PrimerParcialJunio18_EJ5 {
	public static void main(String[]args) {
		int [][] a = {{1,2,3},{3,3,1},{9,1,2}};
		contar(a,3);
	}
	
	public static void contar(int [][] a, int valor) {
		
		int contador = 0;
		
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[i].length; j++) {
				if(a[i][j]==valor) {
					contador++;
				}
			}
		}
		
		int [][] b = new int[contador][2];
		
		int k=0;
		int m=0;
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[i].length; j++) {
				if(a[i][j]==valor) {
					b[k][m]=i;	//0 0
					m++;
					b[k][m]=j;	//0 1
					k++;
					m--;
					
				}
			}
		}
		
		for(int i=0; i<b.length; i++) {
			for(int j=0; j<b[i].length; j++) {
				System.out.print(b[i][j]+"  ");
			}
			System.out.println();
		}
		
		
		
	}
}
