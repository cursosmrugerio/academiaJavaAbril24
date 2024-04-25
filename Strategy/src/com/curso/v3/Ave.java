package com.curso.v3;

public abstract class Ave {
	
	//HAS-A
	String nombre; //Atributo, Propiedad, Un Estado
	ComportamientoVolar cv = new NoVolar(); //Interface

	public Ave(String nombre) {
		this.nombre = nombre;
	}
	
	void volar() {
		cv.ejecutaVuelo();
	}
	

	@Override
	public String toString() {
		return this.getClass().getSimpleName()+" "
				+ "[nombre=" + nombre + "]";
	}
	
}
