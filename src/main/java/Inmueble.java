public class Inmueble {
	private String tipoDeConstruccion;
	private String ciudad;
	private String direccion;
	private int precio;

	public Inmueble(String tipoDeConstruccion, String ciudad, String direccion, int precio) {
		this.tipoDeConstruccion = tipoDeConstruccion;
		this.ciudad = ciudad;
		this.direccion = direccion;
		this.precio = precio;

	}

	public String getTipoDeConstruccion() {
		return this.tipoDeConstruccion;
	}

	public void setTipoDeConstruccion(String tipoDeConstruccion) {
		this.tipoDeConstruccion = tipoDeConstruccion;
	}

	public String getCiudad() {
		return this.ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public String getDireccion() {
		return this.direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public int getPrecio() {
		return this.precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

}