package exercise.ConditionalStatements;

import java.util.Scanner;

public class BonusScores
{
    public static void main(String[] args)
    {
        //new scan obj
        Scanner scan = new Scanner(System.in);

        //input
        int number = Integer.parseInt(scan.nextLine());
        double bonusPoints = 0;

        //calc bonus points
        if (number <= 100)
        {
            bonusPoints = 5;
        }
        else if (number > 100 && number <= 1000)
        {
            bonusPoints += number * 0.2;
        }
        else bonusPoints += number * 0.1;

        //odd ot even bonus points
        if (number % 2 == 0)
        {
            bonusPoints += 1;
        }
        else if (number % 5 == 0)
        {
            bonusPoints += 2;
        }

        //printout
        System.out.println(bonusPoints);
        System.out.printf("%f:0", number + bonusPoints);
    }
}
