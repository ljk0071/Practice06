package com.javaex.ex02;

public class ShapeApp {

	public static void main(String[] args) {
		
		Shape s1 = new Shape("파랑", "파랑");
		System.out.println("================");
		
		Triangle t1 = new Triangle();
		System.out.println("================");
		
		Triangle t2 = new Triangle(3, 4);
		System.out.println("================");
		
		Shape t3 = new Triangle("빨강", "빨강", 15, 15);
		System.out.println("================");
		
		System.out.println(s1);
		System.out.println(t1);
		System.out.println(t2);
		System.out.println(t3);
		
	}
	//생성자 shape2 실행
	//shape 0 tri 0
	//shape 2 tri 2
	//shape 2 tri 4

}

