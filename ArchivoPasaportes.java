package ex2018;

public class ArchivoPasaportes {

	Pasaporte [] p;
	public ArchivoPasaportes(int t) {
		p=new Pasaporte[t];
	}
	
	public void introducir(Pasaporte pas) {
		for(int i=0; i<p.length; i++) {
			if(p[i]==null) {
				p[i]=pas;
			}
		}
	}
	
	public Pasaporte sacar(String nombre) {
		Pasaporte pasaporte;
		
		for(int i=0; i<p.length; i++) {
			if(p[i].getNombre().equals(nombre)) {
				pasaporte=p[i];
				p[i]=null;
				return pasaporte;
			}
		}
		
		return null;
	}
}
