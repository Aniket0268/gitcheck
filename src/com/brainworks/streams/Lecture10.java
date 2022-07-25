package com.brainworks.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Lecture10 {

	public static void main(String[] args) {
		List<Employee> empList = new ArrayList<Employee>();
		empList.add(new Employee("KARTHIK ABC", 1234, 50000.0));
		empList.add(new Employee("KARTHIK ABC", 1234, 53000.0));
		empList.add(new Employee("ASHOK", 4567, 10000.0));
		empList.add(new Employee("KARAN", 8907, 23000.0));
		empList.add(new Employee("RAVI", 807, 4342.0));
		empList.add(new Employee("ADITYA", 907, 43343.0));

		List<Employee> empList1 = new ArrayList<Employee>();
		empList1.add(new Employee("KARTHIK ABC1", 1234, 50000.0));
		empList1.add(new Employee("KARTHIK ABC1", 1234, 53000.0));
		empList1.add(new Employee("ASHOK1", 4567, 10000.0));
		empList1.add(new Employee("KARAN1", 8907, 23000.0));
		empList1.add(new Employee("RAVI1", 807, 4342.0));
		empList1.add(new Employee("ADITYA1", 907, 43343.0));

		List<List<Employee>> empL = new ArrayList<>();
		empL.add(empList);
		empL.add(empList1);
		// System.out.println(empL);
		List<Employee> collect = empL.stream().flatMap(list -> list.stream()).collect(Collectors.toList());
		// System.out.println(collect);
		IntStream.range(1, 101).filter(x -> x % 2 == 0).forEach(v -> System.out.print(v + ","));
		List<Double> collect2 = empList1.stream().map(x -> x.getSalary()).sorted((p, q) -> q.compareTo(p)).limit(5)
				.collect(Collectors.toList());
		System.out.println();
		System.out.println(collect2);
		List<Double> collect6 = empList1.stream().map(x -> x.getSalary()).sorted((p, q) -> q.compare(q, p)).limit(5)
				.collect(Collectors.toList());
	}

}
