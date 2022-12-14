package exercise.ConditionalStatements;

import java.util.Scanner;

public class TimePlus15mins
{
    public static void main(String[] args) {
        //new scan obj
        Scanner scan = new Scanner(System.in);

        //input
        int hours = Integer.parseInt(scan.nextLine());
        int minutes = Integer.parseInt(scan.nextLine());

        minutes = minutes + 15;

        //calc
        if(minutes > 59 && hours < 23)
        {
            hours += 1;
            minutes = minutes - 60;
        }
        else if (hours == 23 && minutes > 59)
        {
            hours = 0;
            minutes = minutes - 60;
        }

        //output
        if (minutes < 10)
        {
            System.out.printf("%d:0%d", hours, minutes);
        }
        else System.out.printf("%d:%d", hours, minutes);
    }
}
