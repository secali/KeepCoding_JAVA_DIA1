package com.scl.demo;

public class Tecnico extends Empleado{
	private String setCodigoTaller;

	
	public Tecnico(String nombre, String setCodigoTaller) {
		super(nombre);
		this.setCodigoTaller = setCodigoTaller;
	}

	public String getSetCodigoTaller() {
		return setCodigoTaller;
	}

	public void setSetCodigoTaller(String setCodigoTaller) {
		this.setCodigoTaller = setCodigoTaller;
	}
	

	@Override
	public String toString() {
		return "Tecnico [setCodigoTaller=" + setCodigoTaller +", getNombre()="+getNombre()+"]";
	}
	
	
	
	
}
