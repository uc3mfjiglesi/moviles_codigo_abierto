package com.cice.tutorialjava.poo.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import com.cice.tutorialjava.poo.interfaces.Racional;

public class SetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> myStringSet=new HashSet<>();
		Set<Racional> myRacionalSet=new HashSet<>();
		myStringSet.add("Luis");
		myStringSet.add("Luis");
		myStringSet.add("Manuel");
		myStringSet.add("Jose");
		myStringSet.add("Alberto");
		System.out.println("Recorriendo la lista con for each...");
		for(String str:myStringSet){
			System.out.println(str);
		}
		System.out.println("Recorriendo la lista con un iterador...");
		Iterator<String> it=myStringSet.iterator();
		while(it.hasNext()){
			String str=it.next();
			System.out.println(str);
		}
		System.out.println("Iniciando prueba con Racionales...");
		myRacionalSet.add(new Racional(2,3));
		myRacionalSet.add(new Racional(1,3));
		myRacionalSet.add(new Racional(2,7));
		myRacionalSet.add(new Racional(9,3));
		myRacionalSet.add(new Racional(2,3));
		myRacionalSet.add(new Racional(4,6));
		System.out.println("Recorriendo la lista con un iterador...");
		Iterator<Racional> it2=myRacionalSet.iterator();
		while(it2.hasNext()){
			System.out.println(it2.next());
		}
		System.out.println(new String("Luis").hashCode());
		System.out.println(new String("Luis").hashCode());
		System.out.println(new String("Manuel").hashCode());
	}

}
