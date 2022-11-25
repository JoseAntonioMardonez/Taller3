import java.util.ArrayList;

public class Inmobiliaria {
	private String nombre;
	public GestorDatos unnamed_GestorDatos_;
	private ArrayList<Inmueble> inmuebles = new ArrayList<Inmueble>();
	private ArrayList<Vendedor> vendedores = new ArrayList<Vendedor>();
	private ArrayList<Cliente> clientes = new ArrayList<Cliente>();
	private ArrayList<Venta> ventas = new ArrayList<Venta>();

	public void agregarCliente() {
		throw new UnsupportedOperationException();
	}

	public void agregarVendedor() {
		throw new UnsupportedOperationException();
	}

	public void agregarInmueble() {
		throw new UnsupportedOperationException();
	}

	public void eliminarInmueble() {
		throw new UnsupportedOperationException();
	}

	public ArrayList<Inmueble> buscarInmueblePorTipoConstruccion(String tipoDeConstruccion) {
		for(Inmueble inmueble : this.inmuebles){
			if(inmueble.getTipoDeConstruccion().equals(tipoDeConstruccion)){
				System.out.println("Inmueble encontrado");
				return;
			}
		}

		System.out.println("Inmueble no encontrado");
	}

	public ArrayList<Inmueble> buscarInmueblePorPrecio(int precio) {
		for(Inmueble inmueble : this.inmuebles){
			if(inmueble.getPrecio()==(precio)){
				System.out.println("Inmueble encontrado");
				return;
			}
		}

		System.out.println("Inmueble no encontrado");;
	}

	public ArrayList<Cliente> getClientes() {
		return clientes;
	}

	public ArrayList<Vendedor> getVendedores() {
		return vendedores;
	}

	public Inmobiliaria(String nombre) {
		this.nombre = nombre;
	}
}