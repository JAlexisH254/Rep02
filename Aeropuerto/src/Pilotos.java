
public class Pilotos extends Personas{
	private String codPiloto;

	public Pilotos() {
		super("Pepito", 1000);
		this.codPiloto = "Cod001";
	}
	
	
	
	public Pilotos(String codPiloto, String  nombre1, int edad1) {
		super(nombre1, edad1);
		this.codPiloto = codPiloto;
	}



	@Override
	public String toString() {
		return "Pilotos [codPiloto=" + codPiloto + ", Nombre=" + getNombre() + ", Edad=" + getEdad()+ "]";
	}
	
	
	
	
}
