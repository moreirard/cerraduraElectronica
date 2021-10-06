package cerraduraElectronica;

public class CerraduraElectronica {

	private Boolean estado;

	public CerraduraElectronica(Boolean estado) {
		this.estado = estado;
	}

	public boolean estaAbierta() {
		return estado;
	}



}
