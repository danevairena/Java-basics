package exercise.firstSteps;

import java.util.Scanner;

public class BasketballEquipment 
{
    public static void main(String[] args) 
    {
        //new scanner obj
        Scanner scan = new Scanner(System.in);

        //user input for tax price
        int tax = Integer.parseInt(scan.nextLine());

        //prices calc
        double shoes = tax - tax * 0.4;
        double clothes = shoes - shoes * 0.2;
        double ball = clothes * 0.25;
        double others = ball * 0.2;

        //calculating total sum
        double total = tax + shoes + clothes + ball + others;
        
        //output
        System.out.println(total);
    }
}
