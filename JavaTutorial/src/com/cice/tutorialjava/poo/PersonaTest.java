package com.cice.tutorialjava.poo;

public class PersonaTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Construyendo un objeto de tipo Pesona...");
		Persona p=new Persona("Juan",45);
		System.out.println("Objeto Persona construido..");
		p.print();
		p.setNombre("Luis");
		p.setEdad(-34);
		p.setDomicilio("Calle Luna 22");
		p.print();
		
	}

}
