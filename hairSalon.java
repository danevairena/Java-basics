/* Desi has a hair salon in Sofia. Every day she sets herself the goal of achieving a certain profit.
Write a program that calculates whether she succeeded in meeting the goal for the day, knowing the following:
Desi will take clients until the work day is over. If she achieves the desired income, however, she will
close the salon. When a customer logs in, he will be able to choose one of the following services:
- Haircut:
      Men's (mens) - BGN 15.
      Ladies – BGN 20
      Children (kids) – BGN 10.
- Coloring (color):
      Maintenance (touch up) – BGN 20.
      Full coloring (full color) - BGN 30.
      
Input:
Read from the console target for the day – an integer in the interval.
A series of lines are then read until a "closed" command is received or until Desi achieves
the goal of the day - the service the customer wants - text with "haircut" and "color" options.
With a "haircut" command, the type of haircut will be expected to be entered - "mens", "ladies" or "kids".
With the "color" command, the type of painting will be expected - "touch up" or "full color".

Output:
1. On the first line:
o If Desi has achieved the goal for the day:
"You have reached your target for the day!"
o If Desi failed to meet the goal for the day:
"Target not reached! You need {how much money is not enough to reach the target}lv. more."
2. On the second line:
"Earned money: {the money she earned for the day}lv." */

import java.util.Objects;
import java.util.Scanner;

public class hairSalon
{
    public static void main(String[] args)
    {
        //new scanner obj
        Scanner sc = new Scanner(System.in);

        //service prices
        int mansHaircut = 15;
        int ladiesHaircut = 20;
        int kidsHaircut = 10;
        int touchUpColor = 20;
        int fullColor = 30;

        //input target
        System.out.print("Target: ");
        int target = Integer.parseInt(sc.nextLine());

        //money earned
        int money = 0;

        //input service name until reach target
        do
        {
            //input service name, type and add service's price to earned money
            System.out.print("Service: ");
            String service = sc.nextLine();
            switch (service) {
                case "haircut" -> {
                    System.out.print("Enter type of haircut: ");
                    String haircut = sc.nextLine();
                    switch (haircut) {
                        case "mens" -> money += mansHaircut;
                        case "ladies" -> money += ladiesHaircut;
                        case "kids" -> money += kidsHaircut;
                        default -> System.out.println("Invalid input.");
                    }
                }
                case "color" -> {
                    System.out.print("Enter type of coloring: ");
                    String color = sc.nextLine();
                    switch (color) {
                        case "full color" -> money += fullColor;
                        case "touch up" -> money += touchUpColor;
                        default -> System.out.println("Invalid input.");
                    }
                }
                case "closed" -> {
                    //salon closed immediately
                    //calc money needed to reach target
                    int need = target - money;

                    //output message
                    System.out.printf("Target not reached! You need %dlv. more.\n", need);
                    System.out.printf("Earned money: %dlv.\n", money);
                    return;
                }
            }
        }
        while (money < target);
        //when target reached
        System.out.println("You have reached your target for the day!");
        System.out.printf("Earned money: %dlv.\n", money);
    }
}
