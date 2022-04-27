package com.javaex.ex02;

public class Triangle extends Shape{
	
	private int width, height;
	
	public Triangle() {
		System.out.println("생성자 Triangle(0) 실행");
	}
	public Triangle(int width, int height) {
		super("검정", "검정");
		this.width = width;
		this.height = height;
		System.out.println("생성자 Triangle(2) 실행");
	}
	
	public Triangle(String fillColor, String lineColor, int width, int height) {
		super(fillColor,lineColor);
		this.width = width;
		this.height = height;
		System.out.println("생성자 Triangle(4) 실행");
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	@Override
	public String toString() {
		return "Triangle [width=" + width + ", height=" + height + ", getFillColor()=" + getFillColor()
				+ ", getLineColor()=" + getLineColor() + "]";
	}
	
	
}


