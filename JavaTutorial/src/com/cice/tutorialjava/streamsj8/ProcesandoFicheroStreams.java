package com.cice.tutorialjava.streamsj8;

import java.io.IOException;
import java.io.Serializable;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Optional;
import java.util.stream.Stream;

import org.omg.Messaging.SyncScopeHelper;

public class ProcesandoFicheroStreams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*String[] tokens="luis   manuel bla 24 67 juan 23,6 89".split("\\s+");
		for(String token:tokens){
			System.out.println(token);
		}
		Stream.of(tokens)
		.forEach(token->System.out.println(token));*/
		try {
			Serializable opt=Files.lines(Paths.get("palabras2.txt"))
			.flatMap(line->Stream.of(line.split("\\s+")))
			.filter(token->{
							try{
								Double.parseDouble((String)token);
								return true;
								}catch(NumberFormatException e){
									return false;
								}
							}
			).mapToDouble(x->Double.parseDouble(x.toString()))
			.reduce(0,(x,y)->x+y);
			System.out.println(opt);
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
