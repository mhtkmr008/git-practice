package com.tester;

import java.util.Scanner;

import com.code.Point2D;

public class PointTest {
	
	public static void main(String[] args) {
		
		int x=20,y=30;
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter coordinates");
		
		Point2D coord1=new Point2D(sc.nextInt(),sc.nextInt());
		
		System.out.println("Enter coordinates");
		
		Point2D coord2=new Point2D(sc.nextInt(),sc.nextInt());
		
		boolean res=coord1.equals(coord2);
		
		if(res==true)
		{
			System.out.println("The coordinates are Equal");
		}
		else
		{
			System.out.println("The coordinates are not equal");
		}
		
		double res2=coord1.calculateDistance(coord2);
		
		System.out.println("The distance between two points is:"+res2);
		
		
		coord1.displayDetails();
		coord2.displayDetails();
		
		
		
		

	}

}
