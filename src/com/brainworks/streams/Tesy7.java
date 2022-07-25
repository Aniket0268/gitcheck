package com.brainworks.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Tesy7 {

	public static void main(String[] args) {

		Employee emp1 = new Employee("ANIKET", 11, 1000.00);
		Employee emp6 = new Employee("SANKET", 18, 1001.00);
		Employee emp2 = new Employee("AKSHAY", 12, 20000.00);
		Employee emp3 = new Employee("SAURABH", 13, 3000.00);
		Employee emp4 = new Employee("SHUBHAM", 14, 4000.00);
		Employee emp5 = new Employee("NARESH", 15, 500.00);

		ArrayList<Employee> emp = new ArrayList<>();
		emp.add(emp1);
		emp.add(emp2);
		emp.add(emp3);
		emp.add(emp4);
		emp.add(emp5);
		emp.add(emp6);
		// System.out.println(emp);

		emp.stream().filter(s -> s.getName().startsWith("S")).map(m -> m.getName()).forEach(d -> System.out.println(d));

	}
}