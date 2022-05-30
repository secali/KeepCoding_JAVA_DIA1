package com.scl.demo;

public class Empleado {
	
	private String nombre;
	private TrabajoMensual tmensual;
	

	public Empleado(String nombre) {
		super();
		this.nombre = nombre;
		
	}

	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void setTrabajo(TrabajoMensual tm) {
		this.tmensual = tm;
	}
	
	
	public void calcularSalario() {
		tmensual.calcularSalario();
	}
	
	public String getSalarioCalculado() {
		return tmensual.toString();
	}


	@Override
	public String toString() {
		return "Empleado [nombre=" + nombre + "]";
	}
	
}
