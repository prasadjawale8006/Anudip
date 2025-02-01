package Assignments;

import java.util.Scanner;
public class Employees_Detail {
	    public static void main(String[] args) {
	   
	        Scanner sc = new Scanner(System.in);

	       
	        System.out.print("Enter Employee Name: ");
	        String name = sc.nextLine();

	        System.out.print("Enter Employee Age: ");
	        int age = sc.nextInt();

	        System.out.print("Enter Employee Salary: ");
	        double salary = sc.nextDouble();
	        sc.nextLine();

	        System.out.print("Enter Employee Department: ");
	        String department = sc.nextLine();

	     
	        
	        System.out.println("Name: " + name);
	        System.out.println("Age: " + age);
	        System.out.println("Salary: " + salary);
	        System.out.println("Department: " + department);

	      
	        sc.close();
	    }
	}

