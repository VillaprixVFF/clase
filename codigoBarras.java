package ex2018;

public class codigoBarras {

	//VARIABLES
	int [] codigo;
	
	//CONSTRUCTORES
	public codigoBarras() {
		codigo = new int [10];
	}
	
	public codigoBarras(int [] a) {
		if(a==null || a.length!=10) {
			return;
		}
		
		for(int i=0; i<a.length; i++) {
			if(a[i]<0 || a[i]>9) {
				return;
			}
		}
		
		this.codigo=a;
	}
	
	//SET AND GET
	public int[] getCodigo() {
		for(int i=0; i<codigo.length; i++) {
			System.out.print(codigo[i]+" ");
		}
		return codigo;
	}
}
