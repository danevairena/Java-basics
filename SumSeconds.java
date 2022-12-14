package exercise.ConditionalStatements;

import java.util.Scanner;

public class SumSeconds
{
    public static void main(String[] args) {
        //new scan obj
        Scanner scan = new Scanner(System.in);

        //input 3 persons's times
        int timeFirst = Integer.parseInt(scan.nextLine());
        int timeSecond = Integer.parseInt(scan.nextLine());
        int timeThird = Integer.parseInt(scan.nextLine());

        //calc total time
        int totalTime = timeFirst + timeSecond + timeThird;

        int minutes = totalTime / 60;
        int seconds = totalTime % 60;

        //output
        if (seconds < 10) 
        {
            System.out.printf("%d:0%d", minutes, seconds);
        }
        else System.out.printf("%d:%d", minutes, seconds);
    }
}
