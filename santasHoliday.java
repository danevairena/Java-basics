/* Every year, Santa Claus chooses different holiday destinations. This year he decides to spend your holidays in Bulgaria. 
His faithful friends - the dwarves, offer him to settle in one of the the most prestigious hotels, namely "Four Seasons". 
During his stay there, he must choose between the following types of premises, with the following prices for a stay:
• "room for one person" – BGN 18.00 per night
• "apartment" – BGN 25.00 per night
• "president apartment" – BGN 35.00 per night
According to the number of days Santa will stay at the hotel (example: 11 days = 10 nights) and the type of the room he chooses, 
he can use a different discount. The reductions compared to days and the premises are as follows:
- room for one person - no discounts
- apartment:
            - 30% discount for above 10 days stay
            - 35% discount for 10-15 days stay
            - 50% discount for over 15 days stay
president apartment:
            - 10% discount for above 10 days stay
            - 15% discount for 10-15 days stay
            - 20% discount for over 15 days stay
After staying at the hotel, Santa's assessment of the hotel's services can be positive or negative. If his assessment is positive, 
to the price with the already deducted Santa Claus discount adds 25% to it. If his assessment is negative, 10% will be deducted from the price.

One line should be printed to the console - The price of his hotel stay, formatted to the second decimal place */

import java.util.Scanner;

public class santasHoliday
{
    public static void main(String[] args)
    {
        //new scanner obj
        Scanner sc = new Scanner(System.in);

        //user input
        System.out.print("Number of days stay: ");
        int days = Integer.parseInt(sc.nextLine());
        System.out.println("Room kind - room for one person, apartment, president apartment:");
        String roomKind = sc.nextLine();
        System.out.print("Assessment: ");
        String assessment = sc.nextLine();

        //room prices
        double onePerson = 18.00;
        double apartment = 25.00;
        double presidentApart = 35.00;

        //variable for total price
        double price = 0;
        double finalPrice = 0;
        int nights = days - 1;

        //calculate price depending on room kind
        switch (roomKind) {
            case "room for one person" -> price = nights * onePerson;
            case "apartment" -> {
                price = nights * apartment;
                if (days < 10) {
                    //30% discount for above 10 days stay
                    price = price * 0.7;
                }
                if (days >= 10 && days <= 15) {
                    //35% discount for 10-15 days stay
                    price = price * 0.65;
                } else {
                    //50% discount for over 15 days stay
                    price = price * 0.5;
                }
            }
            case "president apartment" -> {
                price = nights * presidentApart;
                if (days < 10) {
                    //10% discount for above 10 days stay
                    price = price * 0.9;
                }
                if (days >= 10 && days <= 15) {
                    //15% discount for 10-15 days stay
                    price = price * 0.85;
                } else {
                    //20% discount for over 15 days stay
                    price = price * 0.8;
                }
            }
        }

        //if positive assessment - 25% increase, if negative - 10% increase
        if (assessment.equals("positive"))
        {
            finalPrice = price * 1.25;
        }
        if (assessment.equals("negative"))
        {
            finalPrice = price * 1.1;
        }

        //output final price
        System.out.printf("%.2f", finalPrice);
    }
}
