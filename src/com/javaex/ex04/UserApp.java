package com.javaex.ex04;

public class UserApp {

	public static void main(String[] args) {
		
		User[] usr = new User[3];
		
		usr[0] = new Customer("jws", "j1234", "정우성", 1000);
		usr[1] = new Customer("yjs", "y2345", "유재석", 2000);
		usr[2] = new Employee("master", "m7788", "운영자", 5000000);
		
		for(int i=0;i<usr.length;i++) {
			usr[i].showInfo();
		}

	}

}
