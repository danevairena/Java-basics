/* Michaela wants to organize and pay for her bachelorette party herself. She plans to pay with the proceeds 
from her online store. Write a program that calculates the profit from her sales.
Prices of the various items:
• Love message - BGN 0.60.
• Wax rose - 7.20 lv.
• Keychain - 3.60 lv.
• Caricature - 18.20 lv.
• Lucky surprise - 22 lv.
If the ordered items are 25 or more, the store makes a discount of 35% of the total price. From the money earned, 
Michaela must also provide for 10% of the hosting cost. To calculate whether the money will be enough to pay for her bachelorette party.

The console prints:
• If the money is sufficient, the following is printed: "Yes! {remaining money} lv left."
• If the money is NOT enough, the following is printed: "Not enough money! {needed money} lv needed."
The result must be formatted to the second decimal place. */

import java.util.Scanner;

public class maidenParty
{
    public static void main(String[] args)
    {
        //new scanner obj
        Scanner scan = new Scanner(System.in);

        //counter for number of items sold
        int count = 0;

        //supplies prices
        double lovePrice = 0.60;
        double rosePrice = 7.20;
        double keyHolderPrice = 3.60;
        double caricaturePrice = 18.20;
        double luckPrice =  22;

        //user input for party price
        System.out.print("Party price: ");
        double price = Double.parseDouble(scan.nextLine());

        //user input for supplies and counting them
        System.out.println("Input number of items sold");
        System.out.print("Love letters: ");
        int love = Integer.parseInt(scan.nextLine());
        count += love;
        System.out.print("Roses: ");
        int roses = Integer.parseInt(scan.nextLine());
        count += roses;
        System.out.print("Key holders: ");
        int keyHolders = Integer.parseInt(scan.nextLine());
        count += keyHolders;
        System.out.print("Caricatures: ");
        int caricature = Integer.parseInt(scan.nextLine());
        count += caricature;
        System.out.print("Lucky surprise: ");
        int luck = Integer.parseInt(scan.nextLine());
        count += luck;

        //calculating total price
        double totalSum = love * lovePrice + roses * rosePrice + keyHolders * keyHolderPrice + caricature * caricaturePrice + luck * luckPrice;

        //35% discount of the total sum for selling over 25 supplies
        if (count >= 25)
        {
            totalSum = totalSum * 0.65;
        }

        //10% of total sum for hosting
        totalSum = totalSum * 0.9;

        //check if there are enough money and print result
        if (totalSum > price)
        {
            double rest = totalSum - price;
            System.out.printf("Yes! %.2f lv left.", rest);
        }
        if (totalSum < price)
        {
            double need = price - totalSum;
            System.out.printf("Not enough money! %.2f lv needed.", need);
        }
    }
}
