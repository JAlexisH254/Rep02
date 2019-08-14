import java.util.ArrayList;
import java.util.List;

public class Aeropuerto {
	private String nombre;
	private String ciudad;
	List<Vuelos> listaVuelos = new ArrayList<Vuelos>();
	
	
	public Aeropuerto() {
		this.nombre = "Aero00";
		this.ciudad = "CiudadN";
	}

	public Aeropuerto(String nombre, String ciudad) {
		this.nombre = nombre;
		this.ciudad = ciudad;
	}
	
	public void nuevoVuelos(Vuelos nuevo) {
		listaVuelos.add(nuevo);
	}
	
	public void getVuelos() {
		if(listaVuelos.isEmpty() == false) {
			for(int x = 0; x < listaVuelos.size(); x++) {
				System.out.println("Cantidad de vuelos: " + listaVuelos.size());
			}
		}else {
			System.out.println("No hay vuelos");
		}
	}
	
	public void mostrarVueloDatos() {
		System.out.print("------Datos de vuelos------");
		if(listaVuelos.isEmpty() == false) {
			for(int x = 0; x < listaVuelos.size(); x++) {
				System.out.println(listaVuelos.get(x).toString());
			}
		}else {
			System.out.println("No hay datos de vuelos");
		}
		System.out.println("---------------------------");
	}

	@Override
	public String toString() {
		return "Aeropuerto [nombre=" + nombre + ", ciudad=" + ciudad;
	}
	
	
}
