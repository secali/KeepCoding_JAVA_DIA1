package com.scl.demo;

public class Operario extends Tecnico{
	
	private String maquina;
	
	public Operario(String nombre, String setCodigoTaller, String m) {
		super(nombre, setCodigoTaller);
		this.maquina = m;
		// TODO Auto-generated constructor stub
	}

	public String getMaquina() {
		return maquina;
	}

	public void setMaquina(String maquina) {
		this.maquina = maquina;
	}
	

	@Override
	public String toString() {
		return "Operario [maquina=" + maquina + ", getSetCodigoTaller()=" + getSetCodigoTaller() + ", getNombre()="
				+ getNombre() + "]";
	}
	
	
}
