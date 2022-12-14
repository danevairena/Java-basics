package lab.ConditionalStatements;

import java.util.Objects;
import java.util.Scanner;

public class AreaOfFigures
{
    public static void main(String[] args)
    {
        //new scan obj
        Scanner scan = new Scanner(System.in);

        //type of figures
        String sq = "square";
        String rect = "rectangle";
        String circle = "circle";
        String tri = "triangle";

        //input
        String figure = scan.nextLine();

        //check
        if (Objects.equals(figure,sq))
        {
            //get dimensions
            double a = Double.parseDouble(scan.nextLine());

            //calc area and print result
            double sqArea = a * a;
            System.out.format("double : %.3f",sqArea);
        }
        else if (Objects.equals(figure,rect))
        {
            //get dimensions
            double a = Double.parseDouble(scan.nextLine());
            double b = Double.parseDouble(scan.nextLine());

            //calc area and print result
            double rectArea = a * b;
            System.out.format("double : %.3f",rectArea);
        }
        else if (Objects.equals(figure,circle))
        {
            //get dimensions
            double radius = Double.parseDouble(scan.nextLine());

            //calc area and print result
            double circArea = Math.PI * Math.pow(radius,2);
            System.out.format("double : %.3f",circArea);
        }
        else if (Objects.equals(figure,tri))
        {
            //get dimensions
            double c = Double.parseDouble(scan.nextLine());
            double height = Double.parseDouble(scan.nextLine());

            //calc area and print result
            double triArea = (c * height) / 2;
            System.out.format("double : %.3f",triArea);
        }
    }
}
