package Assignments;

import java.util.Scanner;

public class PersonalTitles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double age = sc.nextDouble();
        String gender = sc.next(); 

        String title = "";

        if (gender.equals("m")) { 
            if (age >= 16) {
                title = "Mr.";
            } else {
                title = "Master";
            }
        } else if (gender.equals("f")) { 
            if (age >= 16) {
                title = "Ms.";
            } else {
                title = "Miss";
            }
        }

        System.out.println(title);
        sc.close();
    }
}


