package com.cice.tutorialjava.streams;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ScannerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Scanner sc=new Scanner(new FileInputStream("palabras2.txt"));
			//sc.useDelimiter("\\s*bla\\s*");
			while(sc.hasNext()){
				try{
					int x=sc.nextInt();
					System.out.println("Numero " + x);
				}catch(InputMismatchException e){
					sc.next();
				}
				
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
