package Employee;
import java.util.Scanner;

public class ExployeeTest {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		Employee A = new Employee();
		
		System.out.print("Name: ");
		A.name = sc.next();
		System.out.print("Gross salary: ");
		A.salary = sc.nextDouble();
		System.out.print("Tax: ");
		A.tax = sc.nextDouble();
		
		System.out.println("\nEmployee: " + A);
		
		System.out.print("\nWhich percentage to increase salary? ");
		double per = sc.nextDouble();
		
		A.increaseSalary(per);
		
		System.out.print("\nUpdated data: " + A);
		
		sc.close();
	}
}
