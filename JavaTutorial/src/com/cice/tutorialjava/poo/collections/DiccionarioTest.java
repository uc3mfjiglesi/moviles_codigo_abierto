package com.cice.tutorialjava.poo.collections;

import java.io.FileNotFoundException;

public class DiccionarioTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Diccionario d=new Diccionario("palabras.txt");
			d.print();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
