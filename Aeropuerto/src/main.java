import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Aeropuerto nuevoAero = new Aeropuerto();
		Aeropuerto nuevoAero1 = new Aeropuerto("INTERNACIONAL","AREQUIPA");
		Pilotos nuevoPiloto = new Pilotos();
		Aviones nuevoAvion =new Aviones();
		Pasajeros nuevoPasajero = new Pasajeros();
		
		Vuelos nuevoVuelo = new Vuelos();
		Vuelos nuevoVuelo1 = new Vuelos("01:01:01", nuevoAvion, nuevoPiloto, "Piura");
		nuevoVuelo1.registrarPasajero(nuevoPasajero);
		nuevoVuelo1.registrarPasajero(nuevoPasajero);
		nuevoVuelo1.registrarPasajero(nuevoPasajero);
		nuevoVuelo1.registrarPasajero(nuevoPasajero);
		nuevoVuelo1.registrarPasajero(nuevoPasajero);
		
		nuevoAero.nuevoVuelos(nuevoVuelo);
		nuevoAero1.nuevoVuelos(nuevoVuelo1);
		nuevoAero1.mostrarVueloDatos();
		
		nuevoVuelo1.mostrarPasajeros();
		
		nuevoAero1.getVuelos();*/
		Scanner sc = new Scanner(System.in);
		String nombre, ciudad;
		int op1 = 0;
		int temp = 0;
		int opcion = 0, op = 0;
		
		Aviones nuevoAvion =new Aviones();
		Pilotos nuevoPiloto = new Pilotos();
		Vuelos nuevoVuelo1 = new Vuelos();
		
		System.out.print("Ingrese el nombre del aeropuerto: ");
		nombre = sc.next();
		System.out.print("Ingrese la ciudad del aeropuerto: ");
		ciudad =sc.next();
		
		Aeropuerto nuevoAero1 = new Aeropuerto(nombre, ciudad);
		//while(temp != 1)
		for(int i = 0; i<=2;i++) {
			System.out.println("----Aeropuerto " + nuevoAero1.getNombre()+"--------");
			System.out.println("1 Registrar vuelo");
			System.out.println("2 Mostrar vuelo");
			System.out.println("3 Mostrar pasajeros");
			System.out.println("4 Salir");
			System.out.println("-----------------");
			System.out.println("Seleccione una opcion: ");
			opcion = sc.nextInt();
			switch(opcion) {
				case 1: 
					System.out.print("1 ingrese la hora del vuelo: ");
					String hr = sc.next();
					System.out.print("ingrese ciudad de destino: ");
					String destino = sc.next();
					
					for(int x = 0; x<=2;x++) {
						System.out.println("ingrese un pasajeros: ");
						System.out.println("ingrese nombre: ");
						String no = sc.next();
						System.out.println("ingrese edad: ");
						int ed = sc.nextInt();
						System.out.println("ingrese sexo: ");
						String sx = sc.next();
						Pasajeros nuevoPasajero = new Pasajeros(sx, no, ed);
						nuevoVuelo1.registrarPasajero(nuevoPasajero);
						System.out.println("Percione 1 para continuar ingresando");
						op1=sc.nextInt();
						if(op1 != 1) {
							x = 1000;
						}
					}
					
					nuevoVuelo1.setHora(hr);
					nuevoVuelo1.setAvion(nuevoAvion);
					nuevoVuelo1.setPiloto(nuevoPiloto);
					nuevoVuelo1.setDestino(destino);
					nuevoAero1.nuevoVuelos(nuevoVuelo1);
					break;
				case 2: 
					nuevoAero1.mostrarVueloDatos();
					break;
				case 3: 
					for(int i1 = 0; i1 < nuevoAero1.listaVuelos.size();i1++) {
						nuevoAero1.listaVuelos.get(i1).mostrarPasajeros();
					}
					break;
				case 4:
					i = 10;
					break;
			}
			if(i != 10) {
				i = 0;
			}
			
		}
	}

}
