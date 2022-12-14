package lab.ConditionalStatements;

import java.util.Scanner;

public class SpeedInfo
{
    public static void main(String[] args)
    {
        //new scan obj
        Scanner scan = new Scanner(System.in);

        //input
        double number = Double.parseDouble(scan.nextLine());

        if (number <= 10)
        {
            System.out.println("slow");
        } 
        else if (number > 10 && number <= 50) 
        {
            System.out.println("average");
        } 
        else if (number > 50 && number <= 150) 
        {
            System.out.println("fast");
        }
        else if (number > 150 && number <= 1000)
        {
            System.out.println("ultra fast");
        }
        else System.out.println("extremely fast");
    }
}
