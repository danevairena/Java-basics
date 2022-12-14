/* Mrs. Ivanova wants to lose weight after the holidays. Starting training, she runs M kilometers on the first day. 
The next N days, she increases her daily rate by K%. In order to lose weight, she must run at least 1,000 km. 
Write a program that, given the starting kilometers, number of days and percentages by which she will increase each day her rate, 
will check that the kilometers she has run are sufficient. If the kilometers are not enough, display the missing kilometers on the console. 
If they are sufficient to display a message in which Mrs. Ivanova is congratulated for a job well done.

A series of numbers are read from the console, each on a separate line:
• On the first line - N - number of days in which Mrs. Ivanova trains - an integer in the interval
• On the second line – M – the kilometers she ran the first day – a real number in the interval
• For each day on a separate line - The percentage by which the daily rate is increased - an integer in the interval

Print to the console 1 line as follows:
• If the kilometers driven are >= 1,000 km – to print a message:
"You've done a great job running more kilometers!"
• If the kilometers traveled are < 1,000 km – to print a message:
"Sorry Mrs. Ivanova, you need to run {the missing kilometers} more kilometers"
Format the result to the larger integer. */

import java.text.DecimalFormat;
import java.util.Scanner;

public class workout
{
    public static void main(String[] args)
    {
        //new scanner object
        Scanner sc = new Scanner(System.in);

        //decimal formatting object
        DecimalFormat df = new DecimalFormat("0.00");
        //input
        System.out.print("Number of days to workout: ");
        int days = Integer.parseInt(sc.nextLine());
        System.out.print("Day 1 - kilometers ran: ");
        double kilometers = Double.parseDouble(sc.nextLine());

        //variable fo total kilometers ran
        double total = kilometers;
        //loop for each day starting from the second
        for (int i = 0; i < days; i++)
        {
            //input percentage by which the daily norm is increased
            System.out.printf("Day %d - enter increase percentage: ", i + 2);
            double percentage = Double.parseDouble(sc.nextLine());

            //calc kilometers for day
            kilometers = kilometers + kilometers * (percentage / 100);
            System.out.println(kilometers);
            kilometers = Double.parseDouble(df.format(kilometers));
            total += kilometers;
            System.out.println(total);
        }

        //output
        if (total >= 1000)
        {
            //round kilometers ran to the nearest larger integer - by adding a half
            int kilometersRan = (int) Math.round(total + 0.5);
            System.out.printf("You've done a great job running %d more   kilometers!\n", kilometersRan - 1000);
        }
        else
        {
            //calc kilometers left and round to nearest larger integer - by adding a half
            double left = 1000 - total;
            int kilometersLeft = (int) Math.round(left + 0.5);

            //output
            System.out.printf("Sorry Mrs. Ivanova, you need to run %d more kilometers", kilometersLeft);
        }
    }
}
