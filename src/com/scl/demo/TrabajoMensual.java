package com.scl.demo;

public class TrabajoMensual {
	private float horasTrabajadas;
	private float salarioHoras;
	
	private float salarioCalculado;
	
	public TrabajoMensual(float a, float b) {
		this.horasTrabajadas = a;
		this.salarioHoras = b;
	}
	
	public TrabajoMensual() {
		this.horasTrabajadas = 0;
		this.salarioHoras = 0;
		this.salarioCalculado = 0;
	}
	public float getHorasTrabajadas() {
		return horasTrabajadas;
	}
	public void setHorasTrabajadas(float horasTrabajadas) {
		this.horasTrabajadas = horasTrabajadas;
	}
	public float getSalarioHoras() {
		return salarioHoras;
	}
	public void setSalarioHoras(float salarioHoras) {
		this.salarioHoras = salarioHoras;
	}
	
	public void calcularSalario() {
		salarioCalculado = horasTrabajadas*salarioHoras;
		
	}
	public float getSalarioCalculado() {
		return salarioCalculado;
	}
	@Override
	public String toString() {
		return "TrabajoMensual [horasTrabajadas=" + horasTrabajadas + ", salarioHoras=" + salarioHoras
				+ ", salarioCalculado=" + salarioCalculado + "]";
	}
}
