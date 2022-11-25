public abstract class Persona {
	private String nombre;
	private String rut;
	private String direccion;
	private String estadocivil;


	public Persona(String nombre, String rut, String direccion, String estadoCivil) {
		this.nombre = nombre;
		this.rut = rut;
		this.direccion = direccion;
		this.estadocivil = estadoCivil;
	}

	public abstract String getTipo();

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getRut() {
		return this.rut;
	}

	public void setRut(String rut) {
		this.rut = rut;
	}

	public String getDireccion() {
		return this.direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getEstadocivil() {
		return this.estadocivil;
	}

	public void setEstadocivil(String estadocivil) {
		this.estadocivil = estadocivil;
	}
}