/* As the Christmas and New Year holidays approach, a pastry shop starts taking orders for making sweets, 
offering the following price list and discounts according to the date on which the order was placed.

Until December 15
- cake - BGN 24/piece
- souffle - BGN 6.66/piece
- baklava - BGN 12.60/piece
After December 15th
- cake - BGN 28.70/piece
- souffle - BGN 9.80/piece
- baklava - BGN 16.98/piece

Until December 22 inclusive, the following discounts exist, which are applied in the following order:
• For orders from BGN 100 to BGN 200 -> 15% discount
• For orders over BGN 200 -> 25% discount
• Until December 15 inclusive -> 10% additional discount from the final price

3 lines are read from the console:
1. Pastry - text - "Cake", "Souffle" or "Baklava"
2. Number of sweets ordered - an integer in the interval 
3. Day of the month of December before Christmas - an integer in the interval 

1 line is printed to the console: The price to be paid, formatted to the second decimal place */

import java.util.Scanner;

public class pastryShop
{
    public static void main(String[] args)
    {
        //new scanner obj
        Scanner scan = new Scanner(System.in);
        
        //pastry prices
        double cakeBefore = 24;
        double cakeAfter = 28.7;
        double souffleBefore = 6.66;
        double souffleAfter = 9.8;
        double baklavaBefore = 12.6;
        double baklavaAfter = 16.98;
        double finalPrice = 0;

        //input kind/ number of pastry to buy and day of month
        String pastry = scan.nextLine();
        int total = Integer.parseInt(scan.nextLine());
        int days = Integer.parseInt(scan.nextLine());
        
        //switch case for pastry kind
        switch (pastry) {
            case "Cake" -> {
                //if bought before 15 December
                if (days <= 15) {
                    double price = cakeBefore * total;
                    if (price > 200) {
                        //25% discount for total price over 200
                        price = price * 0.75;
                        finalPrice = price;
                    }
                    else if (price <= 200 && price > 100) {
                        //15% discount for price between 100 and 200
                        price = price * 0.85;
                        finalPrice = price;
                    }
                    else
                    {
                        finalPrice = price;
                    }
                    //10% discount of total price before 15 December
                    finalPrice = finalPrice * 0.9;
                } else if (days <= 22) {
                    double price = cakeAfter * total;
                    if (price > 200) {
                        //25% discount for total price over 200
                        price = price * 0.75;
                        finalPrice = price;
                    }
                    else if (price <= 200 && price > 100) {
                        //15% discount for price between 100 and 200
                        price = price * 0.85;
                        finalPrice = price;
                    }
                    else
                    {
                        finalPrice = price;
                    }
                } else {
                    finalPrice = cakeAfter * total;
                }
            }
            case "Souffle" -> {
                if (days <= 15) {
                    double price = souffleBefore * total;
                    if (price > 200) {
                        //25% discount for total price over 200
                        price = price * 0.75;
                        finalPrice = price;
                    }
                    else if (price <= 200 && price > 100) {
                        //15% discount for price between 100 and 200
                        price = price * 0.85;
                        finalPrice = price;
                    }
                    else
                    {
                        finalPrice = price;
                    }
                    //10% discount of total price before 15 December
                    finalPrice = finalPrice * 0.9;
                } else if (days <= 22) {
                    double price = souffleAfter * total;
                    if (price > 200) {
                        //25% discount for total price over 200
                        price = price * 0.75;
                        finalPrice = price;
                    }
                    else if (price <= 200 && price > 100) {
                        //15% discount for price between 100 and 200
                        price = price * 0.85;
                        finalPrice = price;
                    }
                    else
                    {
                        finalPrice = price;
                    }
                } else {
                    finalPrice = souffleAfter * total;
                }
            }
            case "Baklava" -> {
                if (days <= 15) {
                    double price = baklavaBefore * total;
                    if (price > 200) {
                        //25% discount for total price over 200
                        price = price * 0.75;
                        finalPrice = price;
                    }
                    else if (price <= 200 && price > 100) {
                        //15% discount for price between 100 and 200
                        price = price * 0.85;
                        finalPrice = price;
                    }
                    else
                    {
                        finalPrice = price;
                    }
                    //10% discount of total price before 15 December
                    finalPrice = finalPrice * 0.9;
                } else if (days <= 22) {
                    double price = baklavaAfter * total;
                    if (price > 200) {
                        //25% discount for total price over 200
                        price = price * 0.75;
                        finalPrice = price;
                    }
                    else if (price <= 200 && price > 100) {
                        //15% discount for price between 100 and 200
                        price = price * 0.85;
                        finalPrice = price;
                    }
                    else
                    {
                        finalPrice = price;
                    }
                } else {
                    finalPrice = baklavaAfter * total;
                }
            }
        }
        
        //print final price
        System.out.printf("%.2f", finalPrice);
    }
}
