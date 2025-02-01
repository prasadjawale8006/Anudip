package Assignments;

import java.util.Scanner;

public class ConditionalStatements {

	public static void main(String[] args) {
		
      Scanner sc = new Scanner(System.in);
      int choice ;
      
      System.out.println(" 1: check number is even or odd");
      System.out.println(" 2: check character is vowel or not");
      System.out.println(" 3: check number is divisible by 5 or not");
      System.out.println(" 4: check greatest number ");
      System.out.println("enter your choice: ");
      choice = sc.nextInt();
      
      switch(choice) {
      
      case 1:
    	 
    	  int a;
    	  System.out.println("enter anumber");
    	  a = sc.nextInt();
    
    	  if(a%2 ==0) {
    		  System.out.println("number is even");
    	  }
    	  else {
    		  System.out.println("Number is odd");
    	  }	
    	  break;
    	  
      case 2:
    	  char ch;
    	  System.out.println("enter character:");
    	  ch = sc.next().charAt(0);
    	  
    	  if(ch =='a'||ch =='e'|| ch =='i'||ch=='o'||ch=='u'||
    			  ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
    		  System.out.println("character is vowel");
    	  }
    	  else {
    		  System.out.println("character is consonant");
    	  }
    	  break;
    	  
      case 3:
    	  
    	  int num1;
    	  System.out.println("enter number: ");
    	  num1 = sc.nextInt();
    	  if(num1%5==0) {
    		  System.out.println("Number is divisible by 5 ");
    	  }
    	  else {
    		  System.out.println("Number is  not divisible by 5 ");
    	  }
    	  break;
    	  
      case 4:
    	   int n1,n2,n3;
    	  System.out.println("enter first number: ");
    	   n1 = sc.nextInt();
    	  
    	  System.out.println("enter second number: ");
    	   n2= sc.nextInt();
    	  
    	  System.out.println("enter third number: ");
    	  n3 = sc.nextInt();
    	  
    	  if(n1>n2 && n1>n3) {
    		  System.out.println("Greatest number is: "+n1);
    	  }
    	  else if(n2>n1 && n2>n3) {
    		  System.out.println("Greatest number is: "+n2);
    	  }
    	  else {
    		  System.out.println("Greatest number is: "+n3);
    	  }
    	  break;
    	  
    	default:
    		System.out.println("Invalid choice");
      }
      sc.close();

	}
}
