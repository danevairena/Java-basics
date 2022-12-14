import java.util.Scanner;

/* Ivan wanted to buy some parts for his computer and went to a store. Because there were no parts in
stock, they had to order them. He wanted to buy a processor, video card and RAM memory, as for
processor and video card, the store gives him a few percent discount. Everything had to pay in
dollars, so the prices must be converted into leva, assuming that 1 dollar = 1.57 leva.
To write a program that calculates how much total money he will need in BGN to be able to buy
the parts.

Lines are read from the console:
1. the price in dollars for the processor - a real number in the range [200.00 … 3000.00]
2. the price in dollars for the video card - a real number in the interval [100.00 … 1500.00]
3. the price in dollars for one RAM - a real number in the interval [80.00 ... 500.00]
4. row number of RAM memories - an integer in the interval [1 ... 4]
5. discount percentage – a real number in the interval [0.01 … 0.1]

Print to the console on one line how much total BGN will he need to buy the parts.
  "Money needed - {total leva} leva."
The amount must be formatted to the second decimal place. */

public class pcStore
{
    public static void main(String[] args)
    {
        //new scanner obj
        Scanner sc = new Scanner(System.in);

        //user input
        System.out.print("Processor's price in dollars: ");
        double processorDollar = Double.parseDouble(sc.nextLine());
        System.out.print("Video card's price in dollars: ");
        double videoDollar = Double.parseDouble(sc.nextLine());
        System.out.print("RAM memory's price in dollars: ");
        double ramDollar = Double.parseDouble(sc.nextLine());
        System.out.print("Number of RAM memories: ");
        int ramNumber = Integer.parseInt(sc.nextLine());
        System.out.print("Discount percentage: ");
        double discount = 1 - Double.parseDouble(sc.nextLine());

        //leva price for 1 dollar
        double dollarPrice = 1.57;

        //convert dollar prices to leva
        double processorLeva = processorDollar * dollarPrice;
        double videoLeva = videoDollar * dollarPrice;
        double ramLeva = ramDollar * dollarPrice;

        //calc total price
        double totalPrice = processorLeva * discount + videoLeva * discount + ramNumber * ramLeva;

        //output
        System.out.printf("Money needed - %.2f leva.", totalPrice);
    }
}
