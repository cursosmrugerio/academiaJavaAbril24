package com.curso.v4;

public class NoVolar implements ComportamientoVolar {

	@Override
	public void ejecutaVuelo() {
		System.out.println("No puedo volar");
	}

}
