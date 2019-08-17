
public class Pasajeros extends Personas{
	private String sexo;
	
		
	public Pasajeros() {
		super("Pasajero01", 0001);
		this.sexo = "Indeterminado";
	}


	public Pasajeros(String sexo, String  nombre1, int edad1) {
		super(nombre1, edad1);
		this.sexo = sexo;
		
	}

	@Override
	public String toString() {
		return "Pasajeros \nsexo: " + sexo + "| Nombre: "+ super.getNombre() +"| edad: "+ super.getEdad();
	}
	
}
