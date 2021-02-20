package funcational.consumer;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class UndersandConsumer {

	/*
	 * Consumer take input return void method accept
	 */

	public static void main(String args[]) {
		
		List<String> ls=new ArrayList<>();
		ls.add("india");
		ls.add("germany");
		ls.add("abu dhabi");
		
		Consumer<String> l = System.out::println;
		ls.forEach(a->System.out.println(a.toUpperCase()));
		l.accept("Dubai");
		
		
		//lambda chaining using andThen
		// in  consumer chaining both should have same TYPE
		
		Consumer<String> dbConsumer = (s)->{
			System.out.println("writing in to DB: " +s);
		};
		
		Consumer<String> logConsumer = (s)->{
			System.out.println("logging in to DB: " +s);
		};
		
		dbConsumer.andThen(logConsumer).accept("Apple");
		
		
	}
}
