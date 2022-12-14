package lab.firstSteps;

import java.util.Scanner;

public class YardGreening 
{
    public static void main(String[] args) 
    {
        //new scanner obj
        Scanner scan = new Scanner(System.in);
        
        //prompt user for yards
        System.out.println("How much yards is the area?");
        double yards = Double.parseDouble(scan.nextLine());
        
        //calculating price
        double price = yards * 7.61;
        double discount = price * 0.18;
        double finalPrice = price - discount;
        System.out.println("The final price is: " + finalPrice + " lv.");
        System.out.println("The discount is: " + discount + " lv.");
    }
}
