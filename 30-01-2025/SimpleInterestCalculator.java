package Assignments;
import java.util.Scanner;

public class SimpleInterestCalculator{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int principle;
		int rateOfInterest;
		int time;
		int simpleInterest;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Principal Amount");
		principle = sc.nextInt();
		
		System.out.println("Enter Rate of Interest in % per annum");
		rateOfInterest = sc.nextInt();
		
		System.out.println("Number of years");
		time = sc.nextInt();
		
		
		simpleInterest = (principle*rateOfInterest*time)/100;
		
		System.out.println("Simple Interest : " + simpleInterest);
		
	}

}