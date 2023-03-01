package ex2018;

public class SegundoParcialFeb18 {

	public static void main(String[] args) {
		int [] cod = new int[10];
		for(int i=0; i<cod.length; i++) {
			cod[i]=1;
		}
		
		//int [] cod = {1,1,1,1,1,1,1,1,1,1}
		codigoBarras codigo = new codigoBarras(cod);
		
		Lavadora miLavadora = new Lavadora(575.75,640.59,codigo,"gris");
		System.out.println(miLavadora.toString());
	
	}
}
