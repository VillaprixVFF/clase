package ex2018;

public class mainJunio18 {
	public static void main(String []args) {
		ArchivoPasaportes ap = new ArchivoPasaportes(2);
		
		Pasaporte p2 = new Pasaporte("Maria Figo","Madrid","24","Italia");
		Pasaporte p1 = new Pasaporte("Juan Perez","Murcia","24","Irlanda");
		
		
		ap.introducir(p1);
		ap.introducir(p2);
		
		Pasaporte pSacado = ap.sacar("Juan Perez");
		System.out.println(pSacado.getNombre());
		System.out.println(pSacado.getLugarNacimiento());


	
	}
}
