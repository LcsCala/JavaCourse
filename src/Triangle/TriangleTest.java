package Triangle;
import java.util.Scanner;

public class TriangleTest {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Triangle X = new Triangle();
		System.out.println("Enter the measures of triangle X:");
		X.sideA = sc.nextDouble();
		X.sideB = sc.nextDouble();
		X.sideC = sc.nextDouble();
		
		Triangle Y = new Triangle();
		System.out.println("Enter the measures of triangle Y:");
		Y.sideA = sc.nextDouble();
		Y.sideB = sc.nextDouble();
		Y.sideC = sc.nextDouble();
		
		double areaX = X.area();
		System.out.println("Triangle X area: " + areaX);
		
		double areaY = Y.area();
		System.out.println("Triangle Y area: " + areaY);
		
		if(areaX > areaY) {
			System.out.print("Larger area: X");
		}
		else {
			System.out.print("Larger area: Y");
		}
		sc.close();
	}
}