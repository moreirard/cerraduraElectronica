package cerraduraElectronica;

import static org.junit.Assert.*;

import org.junit.Test;

public class CerraduraElectronicaTest {

	@Test
	public void alCrearLaCerraduraElectronicaEstaAbierta() {
		CerraduraElectronica cerradura = new CerraduraElectronica();
		assertTrue(cerradura.estaAbierta());
	}
	
	
        @Test
	public void alCerrarLaCerraduraElectronicaEstaCerrada() {
		CerraduraElectronica cerradura = new CerraduraElectronica();
		cerradura.cerrar();
		assertFalse(cerradura.estaAbierta());
	}
}
