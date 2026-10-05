/*
  Example Problem:
 
  Write a program to read the side lengths of two triangles, X and Y
  (assume the measurements are valid).
 
  Then, calculate and display the area of both triangles and determine
  which triangle has the larger area.
 
  To calculate the area of a triangle from the lengths of its sides
  a, b, and c, use Heron's formula:
 
  area = sqrt(p * (p - a) * (p - b) * (p - c))
 
  where:
 
  p = (a + b + c) / 2
 */
package Triangle;

public class Triangle {
	//variables
	double sideA;
	double sideB;
	double sideC;
	
	//methods
	double p () { 
		return (sideA + sideB + sideC)/2.0;
	}
	
	double area (){
		double p = p();
		return Math.sqrt(p * (p - sideA) * (p - sideB) * (p - sideC));
	}
}
