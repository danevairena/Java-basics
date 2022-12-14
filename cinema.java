/* A movie theater hires you to write a program to find out if a screening will be full the hall and how much money will be made from it. 
You get seats in the hall and on each subsequent row to the command "Movie time!", how many people enter the hall. The price of one ticket is BGN 5. 
If the current number of people entered the the hall is divided into 3 without remainder, a discount of BGN 5 is made from their total bill.
If more people try to enter the hall than there are seats left, it is considered that the seats are taken exhausted and the program must stop reading input.

The console reads:
- capacity of the hall 
On each subsequent line after the "Movie time!" command:
- Number of people entering the cinem

First print to the console one line:
- When the "Movie time!" command is received: "There are {remaining seats} seats left in the cinema."
- When the seats in the hall run out: "The cinema is full."
Then print: "Cinema income - {cinema income} lv." */
 
import java.util.Scanner;

public class cinema
{
    public static void main(String[] args)
    {
        //new scanner obj
        Scanner sc = new Scanner(System.in);



        //user input
        System.out.print("Hall capacity: ");
        int capacity = Integer.parseInt(sc.nextLine());

        //variables
        int totalPeople = 0;
        int seatsLeft = capacity;
        int ticketPrice = 5;
        int income = 0;

        //Enter number of people while not reached max
        // hall capacity or command Movie time!
        do
        {
            //user input
            System.out.print("Enter number of people: ");
            String input = sc.nextLine();
            if (input.equals("Movie time!"))
            {
                //output
                System.out.printf("There are %d seats left in the cinema.\n", seatsLeft);
                break;
            }
            else
            {
                int people = Integer.parseInt(input);
                //if there are enough seats left
                if (people <= seatsLeft)
                {
                    //update values
                    totalPeople += people;
                    seatsLeft -= people;
                    //discount 5 lv if number of people can be divided by 3 without reminder
                    if (people % 3 == 0)
                    {
                        income += people * ticketPrice - 5;
                    }
                    else
                    {
                        income += people * ticketPrice;
                    }
                }
                //if not enough seats
                else if (totalPeople + people > capacity)
                {
                    //output
                    System.out.println("The cinema is full.");
                    break;
                }
            }
        }
        while (totalPeople <= capacity);

        //output
        System.out.printf("Cinema income - %d lv.\n", income);
    }
}
