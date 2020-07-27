package clases;

public class Usuarios {
	private String Nombre_usuario; //pero no va utilizar valores
	private String Apellido ;
	private int edad;
	private String e_mail;
	
	public Usuarios(String nombre_usuario, String apellido, int edad, String e_mail) {
		super();
		this.Nombre_usuario = nombre_usuario;
		this.Apellido = apellido;
		this.edad = edad;
		this.e_mail = e_mail;
	}

	public String getNombre_usuario() {
		return Nombre_usuario;
	}

	public void setNombre_usuario(String nombre_usuario) {
		Nombre_usuario = nombre_usuario;
	}

	public String getApellido() {
		return Apellido;
	}

	public void setApellido(String apellido) {
		Apellido = apellido;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getE_mail() {
		return e_mail;
	}

	public void setE_mail(String e_mail) {
		this.e_mail = e_mail;
	}

	@Override
	public String toString() {
		return "Usuarios [Nombre_usuario=" + Nombre_usuario + ", Apellido=" + Apellido + ", edad=" + edad + ", e_mail="
				+ e_mail + "]";
	}
	
	
}
