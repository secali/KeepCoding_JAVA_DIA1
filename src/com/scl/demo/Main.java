package com.scl.demo;

public class Main {

	public static void main(String[] args) {
		/*
		Empleado e  = new Empleado("Empleado1");
		System.out.println(e);
		Empleado e1  = new Empleado("Empleado2");
		System.out.println(e1);
		*/
		
		/*
		Tecnico t = new Tecnico("Tenico1", "007");
		System.out.println(t);
		Tecnico t1 = new Tecnico("Tenico2", "007");
		System.out.println(t1);
		
		*/
		
		Directivo d = new Directivo("Directivo1", "ventas");
		System.out.println(d);
		Directivo d1 = new Directivo("Directivo2", "ventas");
		System.out.println(d1);
		
		Oficial o = new Oficial("Oficial1", "008", "alto");
		System.out.println(o);
		Oficial o1 = new Oficial("Oficial2", "008", "alto");
		System.out.println(o1);
		
		Operario op = new Operario ("Operario1", "009", "maquina");
		System.out.println(op);
		Operario op1 = new Operario ("Operario2", "009", "maquina");
		System.out.println(op1);
		
		
		d.setTrabajo(new TrabajoMensual(40, 50));
		d.calcularSalario();
		
		
		
		System.out.println("--> "+d.toString()+" "+d.getSalarioCalculado());
		
		
		
	}

}
