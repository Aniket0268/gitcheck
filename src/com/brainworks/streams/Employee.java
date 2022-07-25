package com.brainworks.streams;

public class Employee {

	Double salary;
	String name;
	Integer id;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(String name, Integer id, Double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	/*
	 * @Override public String toString() { return "Employee [name=" + name +
	 * ", id=" + id + "]"+"\n"; }
	 */

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [salary=" + salary + ", name=" + name + ", id=" + id + "]";
	}
	
}
