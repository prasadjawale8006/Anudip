package Assignments;
import java.util.Scanner;
public class Circle {

	public static void main(String[] args) {
		

		
		        Scanner sc = new Scanner(System.in);

		        
		        System.out.print("Enter radius: ");
		        double r = sc.nextDouble();
		        
		        double ac = 3.14 * r * r;
		        double cc = 2 * 3.14* r;

		        
		        System.out.println("Area of Circle: " + ac);
		        System.out.println("Circumference of Circle: " + cc);

		        sc.close();
		    }
		

	}
