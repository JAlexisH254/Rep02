
public class Aviones {
	private String modelo;
	private int maxPasajeros = 80;
	
	
	public Aviones() {
		modelo = "default modelo";
		maxPasajeros = 80;
	}
	
	

	public Aviones(String modelo) {
		super();
		this.modelo = modelo;
	}

	public String getModelo() {
		return modelo;
	}



	public void setModelo(String modelo) {
		this.modelo = modelo;
	}



	public int getMaxPasajeros() {
		return maxPasajeros;
	}



	public void setMaxPasajeros(int maxPasajeros) {
		this.maxPasajeros = maxPasajeros;
	}



	@Override
	public String toString() {
		return modelo;
	}
	
	
	
}
