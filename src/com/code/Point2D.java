package com.code;

import java.util.Objects;
import java.lang.Math;

public class Point2D {

	private int x,y;

	public Point2D(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	@Override
	public String toString() {
		return "Point2D [x=" + x + ", y=" + y + "]";
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Point2D other = (Point2D) obj;
		return x == other.x && y == other.y;
	}
	
	public double calculateDistance(Point2D anotherPoint)
	{
	  return Math.sqrt(Math.pow(this.x-anotherPoint.getX(),2)+Math.pow(this.y-anotherPoint.getY(), 2));
			  
	}
	
public void displayDetails()
{
	System.out.println("Coordinates : "+this.getX()+","+this.getY());
}
	
	
	
}
