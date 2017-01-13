package com.cice.tutorialjava.poo.interfaces;
import java.util.Comparator;
import com.cice.tutorialjava.poo.Persona;

public class ComparadorPersona implements Comparator<Persona>{

	@Override
	public int compare(Persona o1, Persona o2) {
		// TODO Auto-generated method stub
		return o1.getEdad()-o2.getEdad();
	}

}
