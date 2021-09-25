package com.bridgelabz.Quaderetic;

import java.util.Scanner;

public class Quadratic {
	private double a;
	private double b;
	private double c;
	private double d;
	public double getA() {
		return a;
	}
	public void setA() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value for a");
		this.a = sc.nextDouble();
	}
	public double getB() {
		return b;
	}
	public void setB() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value for b");
		this.b = sc.nextDouble();
	}
	public double getC() {
		return c;
	}
	public void setC() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value for c");
		this.c = sc.nextDouble();
	}
	public void setD() {
		this.d = (b * b) - (4.0 * a * c);
	}

	public Quadratic() {                                
		System.out.println("object has been created");   
	}

	public void equation() {
		if (this.d> 0.0)   
		{  
			double r1 = (-b + Math.pow(d, 0.5)) / (2.0 * a);  
			double r2 = (-b - Math.pow(d, 0.5)) / (2.0 * a);  
			System.out.println("The roots are " + r1 + " and " + r2);  
		}   
		else if (d == 0.0)   
		{  
			double r1 = -b / (2.0 * a);  
			System.out.println("The root is " + r1);  
		}   
		else   
		{  
			System.out.println("Roots are not real."); 
		}
	}	



}
