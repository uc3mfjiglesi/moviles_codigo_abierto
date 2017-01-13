package com.cice.tutorialjava.poo.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Comparator;
/*
 * new Comparator<Persona>(){
			@Override
			public int compare(Persona o1, Persona o2) {
				// TODO Auto-generated method stub
				return o1.getEdad()-o2.getEdad();
			}
		}
 */
import com.cice.tutorialjava.poo.Persona;
public class OrdenacionPersonasTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Persona> list=new ArrayList<>(); 
		list.add(new Persona("Luis",24));
		list.add(new Persona("Manuel",25));
		list.add(new Persona("Jose",34));
		list.add(new Persona("Juan",28));
		list.add(new Persona("Lucia",29));
		list.add(new Persona("Lucas",44));
		Collections.sort(list,(o1, o2) ->o1.getEdad()-o2.getEdad());
		for(Persona p:list){
			p.print();
		}
	}

}
