public class Venta {
    private Cliente cliente;
    private Vendedor vendedor;
    private Inmueble inmueble;

    public Venta(Cliente cliente, Vendedor vendedor, Inmueble inmueble){
        this.cliente = cliente;
        this.vendedor = vendedor;
        this.inmueble = inmueble;
    }
}
