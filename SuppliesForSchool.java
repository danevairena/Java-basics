package exercise.firstSteps;

import java.util.Scanner;

public class SuppliesForSchool 
{
    public static void main(String[] args) 
    {
        //new scanner obj
        Scanner scan = new Scanner(System.in);

        //user input number of supplies
        int pens = Integer.parseInt(scan.nextLine());
        int markers = Integer.parseInt(scan.nextLine());
        int litersCleaner = Integer.parseInt(scan.nextLine());
        int discountPercentage = Integer.parseInt(scan.nextLine());

        //calculating
        double totalPrice = (pens * 5.8) + (markers * 7.2) + (litersCleaner * 1.2);
        double finalPrice = totalPrice - (totalPrice * discountPercentage / 100);

        //output
        System.out.println(finalPrice);
    }
}
