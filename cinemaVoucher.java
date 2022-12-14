/* Lubo is a big fan of cinema and regularly goes to screenings and participates in raffles, from which he often wins cinema vouchers. 
Your task is to write a program to calculate how many purchases the cinema can make to buy Lubo with the voucher won. If the name of 
the purchase contains more than 8 characters, then it is a ticket for a movie, and its price is the sum of the ASCII characters of its 
first two characters. If the name of purchase contains 8 or less characters, its price is equal to the value of the first ASCII character 
in the name. Lubo enters the name of the purchases he wants until he enters "End" or enters a purchase, whose value is greater than the 
remaining amount of the voucher.

User input:
- Voucher value – an integer
Then, until an "End" command is received or until the voucher runs out, read one line at a time:
- The purchase Lubo chose - text

Output:
The program ends when the "End" command is entered or when a purchase whose value is greater than the remaining money from the voucher:
- number of tickets purchased
- number of other purchases purchased */

import java.util.Scanner;

public class cinemaVoucher
{
    public static void main(String[] args)
    {
        //new scanner obj
        Scanner scan = new Scanner(System.in);

        //user input
        System.out.print("Voucher price: ");
        int voucherPrice = Integer.parseInt(scan.nextLine());

        //variables
        int moneyLeft = voucherPrice;
        int moviesBought = 0;
        int othersBought = 0;

        //input purchase name until reach voucher price
        do
        {
            //input purchase name
            System.out.print("Purchase: ");
            String purchase = scan.nextLine();
            //check if entered end command
            if (purchase.equals("End"))
            {
                //output
                System.out.printf("Movies bought: %d\n", moviesBought);
                System.out.printf("Other purchases: %d\n", othersBought);
                return;
            }
            //if entered string has more than 8 symbols
            else {
                //get first character of string - i
                char firstChar = purchase.charAt(0);
                if (purchase.length() > 8)
                {
                    //get second characters
                    char secondChar = purchase.charAt(1);
                    //sum integer values of 1st and 2nd chars
                    int moviePrice = firstChar + secondChar;
                    //check if there are enough money left
                    if (moviePrice <= moneyLeft)
                    {
                        //successfully purchased -  update values
                        moneyLeft = moneyLeft - moviePrice;
                        moviesBought++;
                    }
                    else
                    {
                        //output
                        System.out.printf("Movies bought: %d\n", moviesBought);
                        System.out.printf("Other purchases: %d\n", othersBought);
                        return;
                    }
                }
                //if entered string has less than 8 characters included
                else {
                    //check if there are enough money left
                    if ((int) firstChar <= moneyLeft)
                    {
                        //successfully purchased -  update values
                        moneyLeft = moneyLeft - (int) firstChar;
                        othersBought++;
                    }
                    else
                    {
                        //output
                        System.out.printf("Movies bought: %d\n", moviesBought);
                        System.out.printf("Other purchases: %d\n", othersBought);
                        return;
                    }
                }
            }
        }
        while ((voucherPrice - moneyLeft) < voucherPrice);
        //output
        System.out.printf("Movies bought: %d\n", moviesBought);
        System.out.printf("Other purchases: %d\n", othersBought);
    }
}
