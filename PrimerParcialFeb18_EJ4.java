package ex2018;


public class PrimerParcialFeb18_EJ4 {

	public static void main(String[] args) {
		double [][] a = {{1.5,5.5,4.7},{9.9,9.4,9.9},{1.1,7.5,4.4},{9.9,8.4,5.4}};
		for(int f=0; f<a.length; f++) {
			for(int c=0; c<a[f].length; c++) {
				System.out.print(a[f][c]+"  ");
			}
			System.out.println();
		}
		
		//System.out.println(mediaEstudiante(a,1));
		eliminarSuspensos(a);
	}
	
	public static double mediaEstudiante(double [][] a, int fila) {
		if(a==null || a.length==0) return -1;
		
		double media=0;
		for(int f=0; f<a.length; f++) {
			for(int c=0; c<a[f].length; c++) {
				if(f==fila) {
					media += a[f][c];
				}
			}
		}
		
		media/=a[fila].length;
		return media;
	}
	
	public static double [][] eliminarSuspensos(double [][]a){
		int contador = 0;
		
		for(int i=0; i<a.length; i++) {
			if(mediaEstudiante(a,i)>=5) {
				contador++;
			}
		}
		
		double [][] nueva = new double [contador][a[0].length];
		
		int k=0;
		for(int i=0; i<a.length; i++) {
			if(mediaEstudiante(a,i)>=5) {
				
			for(int j=0; j<a[i].length; j++) {
				nueva[k][j] = a[i][j];
			
			}
			k++;
			
			}
		}
		
		System.out.println();
		for(int i=0; i<nueva.length; i++) {
			for(int j=0; j<nueva[i].length; j++) {
				System.out.print(nueva[i][j]+"  ");
			}
			System.out.println();
		}
	
		
		return nueva;
	}
	

}
