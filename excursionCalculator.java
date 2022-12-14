/* A travel agency offers excursions at different prices, according to the season and the number of people. 
Write a program to calculate the price according to the data in the table:
- Spring - Up to 5 people BGN 50.00 per person / Over 5 people BGN 48.50 per person
- Summer - Up to 5 people BGN 48.50 per person / Over 5 people BGN 45.00 per person
- Autumn - Up to 5 people BGN 60.00 per person / Over 5 people BGN 49.50 per person
- winter - Up to 5 people BGN 86.00 per person / Over 5 people BGN 85.50 per person
Depending on the season, there may be a discount or increase in price, respectively:
• At "summer" -> 15% discount
• In "winter" -> 8% increase in price

Output line printed to the console:
  • The price of the excursion, formatted to the second digit after the decimal separator, 
  in the following format: "{price} leva." */

import java.util.Scanner;

public class excursionCalculator
{
    public static void main(String[] args) {
        //new scanner object
        Scanner scan = new Scanner(System.in);

        //input number of people going on excursion
        System.out.print("Enter number of people: ");
        int n = Integer.parseInt(scan.nextLine());

        //variable for sum price
        double sum = 0;

        //season input
        System.out.print("Season: ");
        String season = scan.nextLine();

        //switch case statement for season options
        switch (season)
        {
            case "spring":
            {
                if (n <= 5)
                {
                    sum = n * 50.00;
                }
                else
                {
                    sum = n * 48.00;
                }
                break;
            }
            case "summer":
            {
                if (n <= 5)
                {
                    sum = n * 48.50;
                }
                else
                {
                    sum = n * 45.00;
                }

                //summer discount of 15%
                sum = sum * 0.85;
                break;
            }
            case "autumn":
            {
                if (n <= 5)
                {
                    sum = n * 60.00;
                }
                else
                {
                    sum = n * 49.50;
                }
                break;
            }
            case "winter":
            {
                if (n <= 5)
                {
                    sum = n * 86.00;
                }
                else
                {
                    sum = n * 85.00;
                }
                //winter price increase by 8%
                sum = sum * 1.08;
                break;
            }
            default:
                System.out.println("Incorrect input");
        }
        //output
        System.out.printf("%.2f leva.", sum);
    }
}
