/* For cats to be healthy, their nutrition must follow a certain diet. Write a program that calculates a cat's percentage 
distribution of macronutrients in a day's food and calculates how many calories, on average, one gram of that food provides. 
Macronutrients are: fats, proteins and carbohydrates.
You have the total number of calories that the cat should take in a day.
It is known that:
• 1 gram of fat = 9 calories
• 1 gram of protein = 4 calories
• 1 gram of carbohydrates = 4 calories
To find out how many calories a gram of cat food provides, you will need to do calculations with the actual weight of the food, 
since it contains water. The grams of fat, protein and carbohydrates should be calculated. Their sum gives the total weight of the food, 
and from it we must subtract the percentage of water. */

import java.util.Scanner;

public class catDiet
{
    public static void main(String[] args)
    {
        //new scanner object
        Scanner scan = new Scanner(System.in);

        //console input
        System.out.println("Enter fat percentage: ");
        double fatPercentage = Double.parseDouble(scan.nextLine());
        System.out.println("Enter protein percentage: ");
        double proteinPercentage = Double.parseDouble(scan.nextLine());
        System.out.println("Enter carbohydrates percentage: ");
        double carbPercentage = Double.parseDouble(scan.nextLine());
        System.out.println("Enter total calories: ");
        int totalCalories = Integer.parseInt(scan.nextLine());
        System.out.println("Enter water percentage: ");
        double waterPercentage = Double.parseDouble(scan.nextLine());


        //variables
        int fat = 9;
        int protein = 4;
        int carbohydrates = 4;

        //calculating grams fat/protein/carbohydrates
        double gramsFat = ((fatPercentage / 100) * totalCalories) / fat;
        double gramsProtein = ((proteinPercentage / 100) * totalCalories) / protein;
        double gramsCarb = ((carbPercentage / 100) * totalCalories) / carbohydrates;

        //calc food weight
        double foodWeight = gramsFat + gramsProtein + gramsCarb;

        //calc calorie per gram
        double calPerGram = totalCalories / foodWeight;

        //calc calories without water
        double calories = calPerGram * ((100 - waterPercentage) / 100);

        //print calories
        System.out.printf("Food gives %.4f calories", calories);
    }
}
