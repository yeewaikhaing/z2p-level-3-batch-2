package day15;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Grouping_1 {

	public static void main(String[] args) {
		List<Employee> employees = List.of(
				new Employee("Kyaw Kyaw", 9800, "Yangon"),
				new Employee("Aung Aung", 6000, "Mandalay"),
				new Employee("Mg Mg", 10000, "Mandalay"),
				new Employee("Yuri", 6000, "Yangon"),
				new Employee("Jeon", 7800, "Monywa")
				);
	
		Map<String, Long> counting = employees.stream()
										.collect(
											Collectors.groupingBy(
													e -> e.getCity(), 
													Collectors.counting()
													)
												);
		
		var sum = employees.stream()
						.collect(
							Collectors.groupingBy(
									e -> e.getCity(),
									Collectors.summingInt(e -> e.getSalary())
								)
							);
		var avg = employees.stream()
					.collect(
							Collectors.groupingBy(
									e -> e.getCity(),
									Collectors.averagingDouble(e -> e.getSalary())
								)
					);

//		System.out.println(counting);
//		
//		System.out.println(sum);
//		
//		System.out.println(avg);
		
		// emp list by salary
		Map<Integer, List<Employee>> groupBySalary = employees.stream()
														.collect(
														Collectors.groupingBy(emp -> emp.getSalary())
													);
		groupBySalary.forEach((k,list) -> {
			System.out.println(k + " ks.");
			list.forEach(emp -> {
				System.out.println("\t" + emp.getName() + "(" + emp.getCity() + ")");
			});
		});
		
		// names of each city
		Map<String, List<String>> groupByCity = employees.stream()
										.collect(Collectors.groupingBy(
											Employee::getCity,
											Collectors.mapping(emp -> emp.getName(), Collectors.toList())
									));
		System.out.println(groupByCity);
		
		Map<String, List<Employee>> data =
				employees.stream()
						 .collect(
							Collectors.collectingAndThen
								(Collectors.groupingBy(Employee::getCity), // (string,List<emp>) 
									map -> map.entrySet() //List<emp>
											.stream()
											.filter(e -> e.getValue().size() > 1)
											.collect(Collectors.toMap(v -> v.getKey(), v -> v.getValue()))
								)
					);
	
		//System.out.println(data);
		data.forEach((city,list) -> {
			System.out.println(city);
			list.forEach(emp -> {
				System.out.println("\t" + emp.getName());
			});
		});
	}
}
