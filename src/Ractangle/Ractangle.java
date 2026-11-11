/*
 * Write a program to read the width and height of a rectangle.
 * Then, display its area, perimeter, and diagonal.
 * Use a class as shown in the project diagram.*/

package Ractangle;

public class Ractangle{
	public double width, height;
	
	double area() {
		return width*height;
	}
	
	double perimeter() {
		return (2*width + 2*height);
	}
	
	double diagonal() {
		return Math.sqrt(Math.pow(width, 2) + Math.pow(height, 2));
	}
}