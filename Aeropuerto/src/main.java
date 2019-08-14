
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Aeropuerto nuevoAero = new Aeropuerto();
		Aeropuerto nuevoAero1 = new Aeropuerto("INTERNACIONAL","AREQUIPA");
		Pilotos nuevoPiloto = new Pilotos();
		
		Aviones nuevoAvion =new Aviones();
		
		Vuelos nuevoVuelo = new Vuelos();
		Vuelos nuevoVuelo1 = new Vuelos("01:01:01", nuevoAvion, nuevoPiloto, "Piura");
		
		nuevoAero.nuevoVuelos(nuevoVuelo);
		nuevoAero1.nuevoVuelos(nuevoVuelo1);
		nuevoAero1.mostrarVueloDatos();
		
		nuevoAero1.getVuelos();
	}

}
