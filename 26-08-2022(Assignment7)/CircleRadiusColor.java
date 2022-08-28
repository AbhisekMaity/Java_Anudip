/*Define a class called circle that contains:
• Two  instance variables: radius (of type double) and color (of type String),
• Initialize the variables radius and color with default value of 1.0 and "red", respectively
 using default constructor.
• Include a second constructor that will use the default value for color and sets the value of radius to the value passed as parameter.
 Two public methods: getRadius() and getArea() for returning the radius and area of the circle.*/
package com.OOPs.java;
import java.util.Scanner;

public class CircleRadiusColor {
	
public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	Circle objj=new Circle(5,"Blue");
	
	System.out.println("Enter the radious of Circle");
	objj.radius=sc.nextDouble();
	
	System.out.println("Enter the color of Circle");
	objj.color=sc.next();
	
	System.out.println("Radius " +objj.getRadius());
	System.out.println("Area " +objj.getArea());
	System.out.println("Color " +objj.getColor());

	
   }
}
