package com.cice.tutorialjava;

/**
 * Comentario que permite generar documentaion
 * @author cice
 *
 */
public class IntruccionesControlFlujoTest {

	public static void main(String[] args) {
		// Comentario de una linea
		//Alternativa simple
		/*
		 * Comentario de varias lineas
		 * if(condicion){
		 * 	<instrucciones>
		 * }
		 * if(condicion){
		 * 	instrucciones
		 * }else{
		 * 	instrucciones
		 * }
		 */
		int puntuacion=3;
		if(puntuacion>5){
			System.out.println("Aprobado");
		}else{
			System.out.println("Suspenso");
		}
		
		/*
		 * Alternativa multiple
		 * switch(expresion){
		 * 	casos
		 * }
		 */
		puntuacion=10;
		switch(puntuacion){
		case 0:
			System.out.println("Suspenso");
			break;
		case 1:
			System.out.println("Suspenso");
			break;
		case 2:
			System.out.println("Suspenso");
			break;
		case 3:
			System.out.println("Suspenso");
			break;
		case 4:
			System.out.println("Suspenso");
			break;
		case 5:
			System.out.println("Aprobado");
			break;
		case 6:
			System.out.println("Aprobado");
			break;
		case 7:
			System.out.println("Notable");
			break;
		case 8:
			System.out.println("Notable");
			break;
		case 9:
			System.out.println("Sobresaliente");
			break;
		case 10:
			System.out.println("Matricula de Honor");
			break;
			default:
				System.out.println("Puntuacion no valida");
				
		}
		/*
		 * Bucles
		 * while(condicion){
		 * 	instrucciones
		 * }
		 * for(expr1;expr2;expr3){
		 * 	instrucciones
		 * }
		 */
		puntuacion=0;
		while(puntuacion<10){
			System.out.println("Incrementando puntuacion(while)...");
			puntuacion++;
		}
		
		System.out.println("Puntuacion final " + puntuacion + "(while)");
		
		for(puntuacion=0;puntuacion<10;puntuacion++){
			System.out.println("Incrementando puntuacion(for)...");
		}
		
		System.out.println("Puntuacion final " + puntuacion + "(for)");
		
		do{
			System.out.println("Incrementando puntuacion(do while)...");
			puntuacion++;
		}while(puntuacion<10);
		
		System.out.println("Puntuacion final " + puntuacion);
		
		/*
		 * Saltos incondicionales
		 * break. desplaza el flujo fuera del bucle donde se ejecute
		 * continue. desplaza el flujo a la siguiente iteracion dentro de un bucle
		 */
		
		puntuacion=0;
		while(puntuacion<100){
			System.out.println("Incrementando puntuacion...");
			puntuacion++;
			if(puntuacion==10)
				break;
		}
		System.out.println("Puntuacion final " + puntuacion);
		puntuacion=0;
		while(puntuacion<10){
			System.out.println("Incrementando puntuacion..." + puntuacion);
			if(puntuacion==5)
				continue;
			puntuacion++;
		}
		
	}
	
	
	
	
	
	
	
	
	

}
