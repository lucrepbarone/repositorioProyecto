package org.ejemplo.servicio;

public class Servicio {
	public int suma(int a, int b) {
		return a+b;
	}
	public int resta(int a, int b) {
		return a-b;
	}
	public int multiplicacion(int a, int b) {
		return a*b;
	}
	public int division(int a, int b) {
		return a/b;
	}
	public void tiempoDuraMetodo() {
		try {
			Thread.sleep(50000);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
