package ex2018;

public class Pasaporte implements ITarjetaIdentidad{

	DNI unDNI;
	String pais;
	
	public Pasaporte(String n, String l, String d,String p) {
		unDNI = new DNI(n,l,d);
		this.pais=p;
	}

	@Override
	public String getNombre() {
		return unDNI.getNombre();
	}

	@Override
	public String getLugarNacimiento() {
		// TODO Auto-generated method stub
		return unDNI.getLugarNacimiento();
	}

	@Override
	public String getNIF() {
		// TODO Auto-generated method stub
		return unDNI.getNIF();
	}
	
	public String getPais() {
		return new String(pais);
	}
}
