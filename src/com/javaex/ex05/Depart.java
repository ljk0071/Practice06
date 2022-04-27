package com.javaex.ex05;

public class Depart extends Employee {
	
	private String part;
	
	public Depart() {
	}
	public Depart(String name, int salary, String part) {
		super(name, salary);
		this.part = part;
	}
	public String getPart() {
		return part;
	}
	public void setPart(String part) {
		this.part = part;
	}
	
	public void showInformation() {
		System.out.println("이름:" + getName() + " 연봉:" + getSalary()+ " 부서:"+ part);
	}
	 //코드작성

}
