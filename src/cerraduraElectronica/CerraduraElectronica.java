package cerraduraElectronica;

public class CerraduraElectronica {

	private Boolean abierta = true;

	public boolean estaAbierta() {
		return abierta;
	}

	public void cerrar() {
		this.abierta = false;

	}

}
