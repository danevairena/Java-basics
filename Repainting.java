package exercise.firstSteps;

import java.util.Scanner;

public class Repainting
{
    public static void main(String[] args)
    {
        //new scanner obj
        Scanner scan = new Scanner(System.in);

        //user input number of materials
        int naylon = Integer.parseInt(scan.nextLine());
        int paint = Integer.parseInt(scan.nextLine());
        int diluent = Integer.parseInt(scan.nextLine());
        int hours = Integer.parseInt(scan.nextLine());

        //calculating
        double materialsPrice = (naylon + 2) * 1.5 + (paint * 14.5) * 1.1 + diluent * 5 + 0.4;
        double hourPrice = materialsPrice * 0.3;
        double workPrice = hourPrice * hours;
        double totalPrice = workPrice + materialsPrice;

        //output
        System.out.println(totalPrice);
    }
}
