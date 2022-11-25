public class Cliente extends Persona {

	public Cliente(String nombre, String rut, String direccion, String estadoCivil) {
		super(nombre, rut, direccion, estadoCivil);
	}

	public String getTipo() {
		return "Cliente";
	}
}