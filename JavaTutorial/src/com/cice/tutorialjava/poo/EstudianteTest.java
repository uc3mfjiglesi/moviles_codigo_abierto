package com.cice.tutorialjava.poo;

public class EstudianteTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Estudiante e1=new Estudiante("Luis", 22, 
				"2222222","POO","Android","IOS");
		e1.print();
		e1.addCurso("Python");
		e1.print();
		e1.removeCurso("Java");
		e1.print();
	}

}
