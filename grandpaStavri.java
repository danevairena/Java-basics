/* Grandpa Stavri has a cauldron for brandy and brews his favorite drink every day. If he brews for N days and each day receives 
a different amount of brandy and alcohol degree, find for all days the total amount of brandy and degrees of the obtained mixture.

The console reads:
• N - the number of days
• For each day on a separate line:
    - brandy quantity – real number in the range
    - degree of the obtained drink - a real number in the interval

Print 3 lines to the console:
• First line: "Liter: {total liters}"
• Second row: "Degrees: {degrees of total mixture}"
• Third line – to print one of the following lines:
"Not good, you should bake!" - if the degree is less than 38
"Great!" - if the degree is from 38 to 42
"Dilution with distilled water!" - if the degree is greater than 42
Liters and degrees to be formatted to the second decimal place. */

import java.util.Scanner;

public class grandpaStavri
{
    public static void main(String[] args)
    {
        //new scanner object
        Scanner scan = new Scanner(System.in);

        //input number of days
        System.out.print("Enter number of days: ");
        int n = Integer.parseInt(scan.nextLine());

        //variables
        double totalLiters = 0;
        double degreesSum = 0;

        //loop for each day
        for (int i = 0; i < n; i++)
        {
            System.out.println("Day " + (i+1));
            //input liters
            System.out.print("Liters: ");
            double quantity = Double.parseDouble(scan.nextLine());
            //input degrees
            System.out.print("Degrees:");
            double degrees = Double.parseDouble(scan.nextLine());

            //sum liters and degrees
            totalLiters += quantity;
            degreesSum = degreesSum + degrees * quantity;
        }

        //calc average degrees number
        double totalDegrees = degreesSum / totalLiters;

        //output total liters and degrees
        System.out.printf("Liter: %.2f \n", totalLiters);
        System.out.printf("Degrees: %.2f \n", totalDegrees);

        //checking degrees number
        if (totalDegrees < 38.00)
        {
            System.out.println("Not good, you should baking!");
        }
        else if (totalDegrees > 38.00 && totalDegrees < 42.00)
        {
            System.out.println("Super!");
        }
        else
        {
            System.out.println("Dilution with distilled water!");
        }
    }
}

