/* A group of enthusiasts travel to various locations where there are gold mines. Your task is to help them by writing a program 
that accepts the number of locations and the expected average gold yield per day for a location. For each day you will receive how much 
gold they mined at the location. Check whether they have achieved the expected yield for a given location or not.

Input:
Initially, a single number is read from the console - number of locations - an integer
For each location, two numbers are read, one per line:
1. On the first line - expected average yield per day of gold - a real number
2. On the second line - number of days in which the given location will be mined - an integer
One number is read for each day - Gold mined for the day - real number

After mining a location is complete, one line is printed as appropriate:
• If the average gold yield per day reaches or exceeds the expected average gold yield per day: 
"Good job! Average gold per day: {average gold per day for the given location}."
• If the average gold yield per day is below the expected average gold yield per day:
"You need {gold that has not reached the expected average yield} gold."
Format the result to the second character after the decimal separator. */

import java.util.Scanner;

public class goldMine
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        int countLocation = Integer.parseInt(scan.nextLine());
        for (int i = 0; i < countLocation; i++) {
            double expected = Double.parseDouble(scan.nextLine());
            double days = Double.parseDouble(scan.nextLine());
            double totalGold = 0;
            for (int y = 0; y < days; y++) {
                double gold = Double.parseDouble(scan.nextLine());
                totalGold += gold;
            }
            double averageGold = totalGold / days;
            double remainingGold = ((expected * days) - totalGold) / days;
            if (averageGold >= expected) {
                System.out.printf("Good job! Average gold per day: %.2f.\n", averageGold);
            } else {
                System.out.printf("You need %.2f gold.\n", remainingGold);
            }
        }
    }
}
