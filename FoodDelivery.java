package exercise.firstSteps;

import java.util.Scanner;

public class FoodDelivery 
{
    public static void main(String[] args)
    {
        //new scanner obj
        Scanner scan = new Scanner(System.in);
        
        //prices
        double chickenMenu = 10.35;
        double fishMenu = 12.4;
        double vegetMenu = 8.15;
        double delivery = 2.5;
        
        //input
        double chicken = Double.parseDouble(scan.nextLine());
        double fish = Double.parseDouble(scan.nextLine());
        double veget = Double.parseDouble(scan.nextLine());

        //calculating
        double totalPrice = chicken * chickenMenu + fish * fishMenu + veget * vegetMenu;
        double desert = totalPrice * 0.2;
        double finalPrice = totalPrice + desert + delivery;
        
        //output
        System.out.println(finalPrice);
    }
}
