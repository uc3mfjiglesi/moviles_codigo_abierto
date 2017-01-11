package com.cice.tutorialjava.poo.interfaces;

public class ClasificadorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Comparable[] list={new Racional(3,4),new Racional(5,2),new Racional(7,5),
				new Racional(5,8),new Racional(7,8)};
		try {
			Racional r=(Racional)Clasificador.getMinimum(list);
			System.out.println(r);
		} catch (ComparationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
