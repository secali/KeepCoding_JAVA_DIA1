package com.scl.demo;

public class Oficial extends Tecnico{
	
	
	private String categoria;

	
	public Oficial(String nombre, String setCodigoTaller, String ca) {
		super(nombre, setCodigoTaller);
		this.categoria = ca;
	}
	
	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}


	
	@Override
	public String toString() {
		return "Oficial [categoria=" + categoria + ", getSetCodigoTaller()=" + getSetCodigoTaller() + ", getNombre()="
				+ getNombre() + "]";
	}
	
	
	
}
