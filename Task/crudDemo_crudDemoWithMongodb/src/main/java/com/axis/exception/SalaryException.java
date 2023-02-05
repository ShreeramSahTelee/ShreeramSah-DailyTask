package com.axis.exception;

public class SalaryException extends RuntimeException{
	int salary;

	public SalaryException(int salary) {
		super();
		this.salary = salary;
	}

	public int getSalary() {
		return salary;
	}
	

}
