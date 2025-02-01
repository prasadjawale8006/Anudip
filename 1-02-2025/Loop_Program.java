package Assignments;
import java.util.Scanner;

public class Loop_Program {

	
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Choose an option:\n1. Display even numbers between min and max\n2. Check if a number is prime\n3. Check if a number is palindrome\n4. Check if a number is Armstrong");
	        int choice = sc.nextInt();

	        switch (choice) {
	            case 1:
	                System.out.print("Enter min value: ");
	                int min = sc.nextInt();
	                System.out.print("Enter max value: ");
	                int max = sc.nextInt();
	                System.out.println("Even numbers between " + min + " and " + max + ":");
	                for (int i = min; i <= max; i++) {
	                    if (i % 2 == 0) {
	                        System.out.print(i + " ");
	                    }
	                }
	                System.out.println();
	                break;

	            case 2:
	                System.out.print("Enter a number: ");
	                int num = sc.nextInt();
	                boolean isPrime = true;
	                if (num < 2) isPrime = false;
	                for (int i = 2; i <= Math.sqrt(num); i++) {
	                    if (num % i == 0) {
	                        isPrime = false;
	                        break;
	                    }
	                }
	                System.out.println(num + (isPrime ? " is a Prime number" : " is not a Prime number"));
	                break;

	            case 3:
	                System.out.print("Enter a number: ");
	                int original = sc.nextInt();
	                int reversed = 0, temp = original;
	                while (temp > 0) {
	                    reversed = reversed * 10 + temp % 10;
	                    temp /= 10;
	                }
	                System.out.println(original + (original == reversed ? " is a Palindrome" : " is not a Palindrome"));
	                break;

	            case 4:
	                System.out.print("Enter a number: ");
	                int armNum = sc.nextInt();
	                int sum = 0, tempArm = armNum, digits;
	                while (tempArm > 0) {
	                    digits = tempArm % 10;
	                    sum += digits * digits * digits;
	                    tempArm /= 10;
	                }
	                System.out.println(armNum + (armNum == sum ? " is an Armstrong number" : " is not an Armstrong number"));
	                break;

	            default:
	                System.out.println("Invalid choice!");
	        }
	        sc.close();
	    }
	}


