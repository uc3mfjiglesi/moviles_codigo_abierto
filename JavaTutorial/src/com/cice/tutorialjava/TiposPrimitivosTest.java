package com.cice.tutorialjava;

public class TiposPrimitivosTest {

	public static void main(String[] args){
		int x;
		x=67;
		short s=34;
		float f=56.7f;
		double d=98.7;
		boolean b=true;
		char c='r';
		String str="luis";
		System.out.println("Valor de x:" + x);
		System.out.println("Valor de c:" + c);
		System.out.println("Valor de d:" + d);
		System.out.println("Valor de str:" + str);
		x=0xff56;
		System.out.println("Valor de x:" + x);
		x=0b10011;
		c='\t';
		System.out.println(c + "luis");
		System.out.println("\\nluis");
	}

}
