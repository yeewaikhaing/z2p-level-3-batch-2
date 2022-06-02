package day13;

import java.util.List;

public class CollectionWithLambda {

	public static void main(String[] args) {
		List<String> list = List.of("Html", "Css", "Javascript", "Php", "Java");
		
		for(String str : list)
				System.out.println(str);
		
		System.out.println("----- with lambda expression ----");
		list.forEach((str) -> System.out.println(str));
		
		System.out.println("---------------");
		list.forEach((str) -> {
			if(str.contains("Java"))
				System.out.println(str);
		});
		
		int[] numbers = new int[3];
		numbers[0] = 100;
		System.out.println(numbers[0]);
		
		List<Double> data ;
		
//		int -> Integer
//		double -> Double
//		float -> Float
//		char -> Character
//		boolean -> Boolean 
		
		
 	}
}
