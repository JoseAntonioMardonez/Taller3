import java.util.ArrayList;

public class Inmobiliaria {
	private String nombre;
	public GestorDatos unnamed_GestorDatos_;
	private ArrayList<Inmueble> inmuebles = new ArrayList<Inmueble>();
	private ArrayList<Vendedor> vendedores = new ArrayList<Vendedor>();
	private ArrayList<Cliente> clientes = new ArrayList<Cliente>();
	private ArrayList<Venta> ventas = new ArrayList<Venta>();

	public void agregarCliente() {
		;
	}

	public void agregarVendedor() {
		;
	}

	public void agregarInmueble() {
		;
	}

	public void eliminarInmueble() {
		;
	}

	public ArrayList<Inmueble> buscarInmueblePorTipoConstruccion(String tipoDeConstruccion) {
		for(Inmueble inmueble : this.inmuebles){
			if(inmueble.getTipoDeConstruccion().equals(tipoDeConstruccion)){


			}
		}
		return;
	}

	public ArrayList<Inmueble> buscarInmueblePorPrecio(int precio) {
		for(Inmueble inmueble : this.inmuebles){
			if(inmueble.getPrecio()==(precio)){


			}
		}
		return;
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