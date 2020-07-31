package org.test.servicio;

import org.ejemplo.servicio.Servicio;

import junit.framework.TestCase;

public class TestServicio extends TestCase{
	private Servicio servicio;
	public void inicializaInstancia() {
		servicio=new Servicio();
	}
	public void testSuma() {
		inicializaInstancia();
		assertTrue(servicio.suma(4, 5)==(4+5));
	}
	public void testResta() {
		inicializaInstancia();
		assertEquals(1, servicio.resta(5, 4));
	}
	public void testMultiplicacion() {
		inicializaInstancia();
		assertTrue(servicio.multiplicacion(2, 2)==4);
	}
}
