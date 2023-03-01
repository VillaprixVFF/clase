package ex2018;

public class DNI implements ITarjetaIdentidad{
	String nombre,lugar,dni;
	
	public DNI(String n, String l, String d) {
		this.nombre=n;
		this.lugar=l;
		this.dni=d;
	}

	@Override
	public String getNombre() {
		return new String(nombre);
	}

	@Override
	public String getLugarNacimiento() {
		// TODO Auto-generated method stub
		return new String(lugar);
	}

	@Override
	public String getNIF() {
		// TODO Auto-generated method stub
		return new String(dni);
	}
	
	
}
