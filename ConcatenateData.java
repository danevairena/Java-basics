package lab.firstSteps;

import java.util.Scanner;

public class ConcatenateData
{
    public static void main(String[] args)
    {
        //new scan obj
        Scanner scan = new Scanner(System.in);
        
        //Prompt user for details
        System.out.println("What is your first name:");
        String firstName = scan.nextLine();
        System.out.println("What is your last name:");
        String lastName = scan.nextLine();
        System.out.println("How old are you:");
        int age = Integer.parseInt(scan.nextLine());
        System.out.println("Where are you from?");
        String city = scan.nextLine();
      
        //output
        System.out.println("You are " + firstName + " " + lastName + ", a " + age + "-years old person from " + city + ".");
    }
}
