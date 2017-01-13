package com.cice.tutorialjava;

public class ArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] miArray=new int[10];
		miArray[0]=12;
		miArray[1]=12;
		miArray[2]=12;
		miArray[3]=122;
		miArray[4]=12;
		miArray[5]=142;
		miArray[6]=152;
		miArray[7]=162;
		miArray[8]=2;
		miArray[9]=1;
		for(int i=0;i<miArray.length;i++){
			System.out.println(miArray[i]);
		}
		/*
		 * Las variables en Java tienen ambito de bloque
		 */
		for(int x:miArray){
			System.out.println(x);
		}
		//Inicializacion de matrices
		String[] miStringArray={"luis","jorge","manuel","Pedro"};
		
		for(String x:miStringArray){
			System.out.println(x + ", tamaño: " + x.length());
		}
	}

}
