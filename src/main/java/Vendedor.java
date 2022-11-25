public class Vendedor extends Persona {
	private String tituloProfesional;

	public Vendedor(String nombre, String rut, String direccion, String estadoCivil, String tituloProfesional) {
		super(nombre, rut, direccion, estadoCivil);
		this.tituloProfesional = tituloProfesional;
	}

	public String getTituloProfesional() {
		return this.tituloProfesional;
	}

	public void setTituloProfesional(String tituloProfesional) {
		this.tituloProfesional = tituloProfesional;
	}

	public String getTipo() {
		return "Vendedor";
	}
}