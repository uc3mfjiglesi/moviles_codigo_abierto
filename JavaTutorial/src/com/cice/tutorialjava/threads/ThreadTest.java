package com.cice.tutorialjava.threads;

public class ThreadTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Thread(()->{
			while(true){
				System.out.println("Ejecutando hilo 1...");
			}
		}).start();
		new Thread(new Runnable(){
			@Override
			public void run() {
				// TODO Auto-generated method stub
				while(true){
					System.out.println("Ejecutando hilo 2...");
				}
			}
		}).start();
	}

}
