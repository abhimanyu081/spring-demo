package com.dto;

public class Point {

	public int x;
	public int y;
	
	
	
	public int getX() {
		return x;
	}



	public void setX(int x) {
		System.out.println("setX called");
		this.x = x;
	}



	public int getY() {
		return y;
	}



	public void setY(int y) {
		System.out.println("setY called");
		this.y = y;
	}



	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
	
	
}
