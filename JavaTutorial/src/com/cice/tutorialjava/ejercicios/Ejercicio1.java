package com.cice.tutorialjava.ejercicios;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] nombres={"Luis","Manuel","Carmen","Pedro","Jose",
			"Alejandro","Manuel"};
		String mayor=nombres[0];
		for(int i=1;i<nombres.length;i++){
			if(nombres[i].length()>mayor.length())
				mayor=nombres[i];
		}
		System.out.println(mayor);
	}

}
