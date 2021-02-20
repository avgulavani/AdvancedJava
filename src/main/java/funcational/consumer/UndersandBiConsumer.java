package funcational.consumer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class UndersandBiConsumer {

	/*
	 * Consumer take input return void method accept
	 */

	public static void main(String args[]) {

		BiConsumer<String, Integer> obj = (a, b) -> {

			System.out.println("my name is:: " + a);
			System.out.println("my age is:: " + b);

		};

		Consumer<String> dbObject = System.out::println;
		Consumer<String> logObject = System.out::println;
		Map<String, Consumer<String>> map = new HashMap<>();

		map.put("db", dbObject);
		map.put("log", logObject);

		obj.accept("khan", 12);

	}
}
