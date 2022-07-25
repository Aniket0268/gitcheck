package com.brainworks.streams;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Lecture13 {

	public static void main(String[] args) {
		List<Employee> empList = new ArrayList<Employee>();
		empList.add(new Employee("KARTHIK ABC", 1234, 50000.0));
		empList.add(new Employee("KARTHIK ABC", 1234, 53000.0));
		empList.add(new Employee("ASHOK", 4567, 10000.0));
		empList.add(new Employee("KARAN", 8907, 23000.0));
		empList.add(new Employee("RAVI", 807, 4342.0));
		empList.add(new Employee("ADITYA", 907, 43343.0));
		
		Optional<Employee> reduceMax = empList.stream().reduce((a,b)-> a.getSalary()>b.getSalary()? a:b);
		System.out.println(reduceMax);
		
		Double double1 = empList.stream().map(m->m.getSalary()).max((a,b)->a.compare(a, b)).get();
		System.out.println(double1);
		
		Double employee = empList.stream().map(m->m.getSalary()).sorted(Collections.reverseOrder()).findFirst().get();
		System.out.println(employee);
	
		Double employee1 = empList.stream().map(m->m.getSalary()).sorted(Collections.reverseOrder()).skip(2).findFirst().get();
		System.out.println(employee1);
		

		List<Employee> empList1 = new ArrayList<Employee>();
		empList1.add(new Employee("KARTHIK ABC1", 1234, 50000.0));
		empList1.add(new Employee("KARTHIK ABC1", 1234, 53000.0));
		empList1.add(new Employee("ASHOK1", 4567, 10000.0));
		empList1.add(new Employee("KARAN1", 8907, 23000.0));
		empList1.add(new Employee("RAVI1", 807, 4342.0));
		empList1.add(new Employee("ADITYA1", 907, 43343.0));


	}

}
