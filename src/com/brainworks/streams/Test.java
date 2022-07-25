package com.brainworks.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {

	public static void main(String[] args) {

		Employee emp1 = new Employee("ANIKET", 11, 1000.00);
		Employee emp6 = new Employee("SANKET", 18, 1001.00);
		Employee emp2 = new Employee("AKSHAY", 12, 20000.00);
		Employee emp3 = new Employee("SAURABH", 13, 3000.00);
		Employee emp4 = new Employee("SHUBHAM", 14, 4000.00);
		Employee emp5 = new Employee("NARESH", 15, 500.00);

		List<Employee> empList = new ArrayList<Employee>();
		empList.add(emp1);
		empList.add(emp2);
		empList.add(emp3);
		empList.add(emp4);
		empList.add(emp5);
		empList.add(emp6);

		List<Employee> collect = empList.stream().filter((x) -> x.name.startsWith("S")).collect(Collectors.toList());
		System.out.println(collect);

		List<String> collect2 = empList.stream().map(m -> m.getName()).collect(Collectors.toList());
		System.out.println(collect2);

		Map<Integer, String> collect3 = empList.stream().collect(Collectors.toMap(k -> k.getId(), v -> v.getName()));
		System.out.println(collect3);

		List<String> asList = Arrays.asList("zzz", "ddd", "sss", "wer");
		System.out.println(asList);
		List<String> sortedList = asList.stream().sorted((q, w) -> q.compareTo(w)).collect(Collectors.toList());
		System.out.println(sortedList);

		List<String> sortedList1 = asList.stream().sorted((Collections.reverseOrder())).collect(Collectors.toList());
		System.out.println(sortedList1);

		Employee employee = empList.stream().min((a, b) -> (a.getId() - b.getId())).get();
		System.out.println(employee);

		Employee employee2 = empList.stream().max((p, q) -> (int) (p.getSalary() - q.getSalary())).get();
		System.out.println(employee2);

		Optional<Employee> employee4 = empList.stream().min((p, q) -> p.getSalary().compareTo(q.getSalary()));
		System.out.println(employee4);

		empList.stream().filter(p -> p.getName().startsWith("S")).map(m -> m.getName())
				.forEach(s -> System.out.println(s));

	}

}
