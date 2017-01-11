package com.cice.tutorialjava.poo.interfaces;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import com.cice.tutorialjava.poo.Persona;

public class MapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,Persona> myPersonMap=new HashMap<>(); 
		myPersonMap.put("p-80001",new Persona("Luis",22));
		myPersonMap.put("p-80001",new Persona("Manuel",22));
		myPersonMap.put("p-80002",new Persona("Juan",22));
		myPersonMap.put("p-80003",new Persona("Antonio",22));
		myPersonMap.put("p-80004",new Persona("Pedro",12));
		Set<String> keys=myPersonMap.keySet();
		for(String key:keys){
			Persona p=myPersonMap.get(key);
			p.print();
		}
		
	}

}
