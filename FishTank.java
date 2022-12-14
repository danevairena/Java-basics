package exercise.firstSteps;

import java.util.Scanner;

public class FishTank 
{
    public static void main(String[] args) 
    {
        //new scanner obj
        Scanner scan = new Scanner(System.in);

        //user input number of supplies
        int length = Integer.parseInt(scan.nextLine());
        int width = Integer.parseInt(scan.nextLine());
        int height = Integer.parseInt(scan.nextLine());
        double percent = Double.parseDouble(scan.nextLine());

        //calculating
        double maxVolume = (length * width * height) / 1000.0;
        double occupied = percent / 100;
        double water = maxVolume * (1 - occupied);
        
        //output
        System.out.println(water);
    }
}
