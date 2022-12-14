package exercise.firstSteps;

import java.util.Scanner;

public class VacationBookList
{
    public static void main(String[] args)
    {
        //new scanner obj
        Scanner scan = new Scanner(System.in);

        //user input number of pages/pages red per hour / days left to read
        int numPages = Integer.parseInt(scan.nextLine());
        int pagesPerHour = Integer.parseInt(scan.nextLine());
        int days = Integer.parseInt(scan.nextLine());

        //calculating
        int totalTime = numPages / pagesPerHour;
        int hours = totalTime / days;
        
        //output
        System.out.println(hours);
    }
}
