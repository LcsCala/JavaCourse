package Ractangle;
import java.util.Scanner;

public class RactangleTest {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter rectangle width and height:");
		
		Ractangle a = new Ractangle();
			a.width = sc.nextDouble();
			a.height = sc.nextDouble();
			
			System.out.print("AREA = " + String.format("%.2f", a.area()) + "\nPERIMETER = " 
			+ String.format("%.2f", a.perimeter()) + "\nDIAGONAL = " + String.format("%.2f", a.diagonal()));
			
		sc.close();
	}
}
