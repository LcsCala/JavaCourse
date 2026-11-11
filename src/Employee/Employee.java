/*
 * Write a program to read an employee's data (name, gross salary, and tax).
 *
 * Then, display the employee's data (name and net salary).
 *
 * Next, increase the employee's salary based on a given percentage
 * (only the gross salary is affected by the percentage) and display
 * the employee's data again.
*/

package Employee;
	
public class Employee {
	public String name;
	public double salary, tax;
	
	double netSalary() {
		return salary - tax;
	}
	
	double increaseSalary(double percentage) {
		double x = salary * (percentage/100);
		return salary += x;
	}
	
	public String toString() {
		return	name + ", $" + String.format("%.2f", netSalary()); 
	}
}
