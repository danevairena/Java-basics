package lab.firstSteps;

import java.util.Scanner;

public class PetShop
{
    public static void main(String[] args)
    {
        //new scanner obj
        Scanner scan = new Scanner(System.in);
        
        //prompt user for numbers of packets
        System.out.println("Number of dog food packages");
        int dogPacks = Integer.parseInt(scan.nextLine());
        System.out.println("Number of cat food packages");
        int catPacks = Integer.parseInt(scan.nextLine());
        
        //calc total price
        double price = (4 * catPacks) + (2.5 * dogPacks);
        
        //output
        System.out.println(price + " lv.");
    }
}
