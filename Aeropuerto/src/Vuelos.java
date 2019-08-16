import java.util.ArrayList;
import java.util.List;

public class Vuelos  {
	private String hora;
	Aviones avion;
	Pilotos piloto;
	List<Pasajeros> cantidad_pasajeros = new ArrayList<Pasajeros>();
	String destino;
	
	
	public Vuelos() {
		hora = "00:00:00";
		avion = new Aviones();
		piloto = new Pilotos();
	}

	public Vuelos(String hora, Aviones avion, Pilotos piloto, String destino) {
		this.hora = hora;
		this.avion = avion;
		this.piloto = piloto;
		this.destino = destino;
	}
	
	public boolean registrarPasajero(Pasajeros pasajero) {
		if(cantidad_pasajeros.size() < avion.getMaxPasajeros()) {
			cantidad_pasajeros.add(pasajero);
			System.out.println("Se a registrado un pasajero");
			return true;
		}else if(cantidad_pasajeros.size() > avion.getMaxPasajeros()){
			System.out.println("Se a llegado a la cantidad maxima de pasajeros");
		}
		return false;
	}
	
	public String getHora() {
		return hora;
	}

	public void setHora(String hora) {
		this.hora = hora;
	}

	public Aviones getAvion() {
		return avion;
	}

	public void setAvion(Aviones avion) {
		this.avion = avion;
	}

	@Override
	public String toString() {
		return "\nHora: " + hora + "\nAVION: " + avion + "\nPiloto: " + piloto + "\nDestino: " + destino + "\nCantidad de pasajeros: " + cantidad_pasajeros.size();
	}
	
	
	
}
