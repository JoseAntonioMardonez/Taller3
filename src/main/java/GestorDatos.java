import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class GestorDatos {

	public static Inmobiliaria leerArchivoClientes(Inmobiliaria inmobiliaria, String direccionArchivo) {
		String textoArchivo = "";
		try {
			File archivo = new File(direccionArchivo);
			FileReader fr = new FileReader(archivo);
			BufferedReader br = new BufferedReader(fr);
			//Lee cada linea del archivo hasta que la linea sea nula
			while ((textoArchivo = br.readLine()) != null) {
				String[] data = textoArchivo.split(",");
				inmobiliaria.getClientes().add(new Cliente(data[0],data[1],data[2],data[3]);
			}
			br.close();
			fr.close();
		} catch (Exception e) {
			System.out.println("Documento no disponible, favor contactar con administrador");
		}
		return inmobiliaria;
	}

	public static Inmobiliaria leerArchivoVendedores(Inmobiliaria inmobiliaria, String direccionArchivo) {
		String textoArchivo = "";
		try {
			File archivo = new File(direccionArchivo);
			FileReader fr = new FileReader(archivo);
			BufferedReader br = new BufferedReader(fr);
			//Lee cada linea del archivo hasta que la linea sea nula
			while ((textoArchivo = br.readLine()) != null) {
				String[] data = textoArchivo.split(",");
				inmobiliaria.getVendedores().add(new Vendedor(data[0],data[1],data[2],data[3],data[5]);
			}
			br.close();
			fr.close();
		} catch (Exception e) {
			System.out.println("Documento no disponible, favor contactar con administrador");
		}
		return inmobiliaria;;
	}
}