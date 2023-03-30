package EntornosDeDesarrollo;

public class Alumno {

	private String nombre;
	private String apellido;
	private String dni;
	
	Alumno(String n, String a, String d){
		
		this.nombre = n;
		this.apellido = a;
		this.dni = d;
		
	}

	@Override
	public String toString() {
		return "Alumno [nombre=" + nombre + ", apellido=" + apellido + ", dni=" + dni + "]";
	}
	
	
	
}
