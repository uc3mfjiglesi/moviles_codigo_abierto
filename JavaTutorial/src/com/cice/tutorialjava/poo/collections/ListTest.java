package com.cice.tutorialjava.poo.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.cice.tutorialjava.poo.interfaces.Racional;

public class ListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> myStringList=new ArrayList<>();
		List<Racional> myRacionalList=new ArrayList<>();
		myStringList.add("Luis");
		myStringList.add("Luis");
		myStringList.add("Manuel");
		myStringList.add("Jose");
		myStringList.add("Alberto");
		System.out.println("Iniciando prueba con Strings...");
		System.out.println("Recorriendo la lista con for indexado...");
		for(int i=0;i<myStringList.size();i++){
			System.out.println(myStringList.get(i));
		}
		System.out.println("Recorriendo la lista con for each...");
		for(String str:myStringList){
			System.out.println(str);
		}
		System.out.println("Recorriendo la lista con un iterador...");
		Iterator<String> it=myStringList.iterator();
		while(it.hasNext()){
			String str=it.next();
			System.out.println(str);
		}
		System.out.println("Iniciando prueba con Racionales...");
		myRacionalList.add(new Racional(2,3));
		myRacionalList.add(new Racional(1,3));
		myRacionalList.add(new Racional(2,7));
		myRacionalList.add(new Racional(9,3));
		myRacionalList.add(new Racional(2,3));
		myRacionalList.add(new Racional(4,6));
		System.out.println("Recorriendo la lista con un iterador...");
		Iterator<Racional> it2=myRacionalList.iterator();
		while(it2.hasNext()){
			System.out.println(it2.next());
		}
	}

}
