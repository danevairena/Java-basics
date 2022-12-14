/* Pepi's favorite team is in the final, but starts to lose the game. 
The team coach doesn't know what substitutions to make to turn the score around.
Write a program that will find the first 6 valid shifts that can be made.
We know that each digit of the two numbers is in a given interval:
• The first digit of the first number is in the interval from the digit K to 8 inclusive.
• The second digit of the first number is in the range 9 to L inclusive.
• The first digit of the second number is in the range from the digit M to 8 inclusive.
• The second digit of the second number is in the range 9 to N inclusive.
For a change to be possible, the first digit of each number must be even and the second digit must be odd.
For a trade to be valid, the numbers must NOT match.

Input:
4 lines are read from the console:
• K – an integer in the interval [0..8]
• L – an integer in the interval [0..9]
• M – an integer in the interval [0..8]
• N – an integer in the interval [0..9]

Output:
On the console, print the first 6 valid shifts as follows:
• If a change is possible and the numbers DO NOT match, it IS valid and should be printed:
"{K}{L} - {M}{N}"
• If a change is possible but the numbers match, it is NOT valid and must be printed:
"Cannot change the same player." */

import java.util.Scanner;

public class substitute
{
    public static void main(String[] args)
    {
        //new scanner object
        Scanner sc = new Scanner(System.in);

        //interval numbers input
        System.out.print("K [0..8]: ");
        int kIn = Integer.parseInt(sc.nextLine());
        System.out.print("L [0..9]: ");
        int lIn = Integer.parseInt(sc.nextLine());
        System.out.print("M [0..8]: ");
        int mIn = Integer.parseInt(sc.nextLine());
        System.out.print("N [0..9]: ");
        int nIn = Integer.parseInt(sc.nextLine());

        //loop for 1st number of 1st player
        for (int k = kIn; k <= 8; k++)
        {
            //loop for 2nd number of 1st player
            for (int l = 9; l >= lIn; l--)
            {
                //loop for 1st number of 2nd player
                for (int m = mIn; m <= 8; m++)
                {
                    //loop for 2nd number of 2nd player
                    for (int n = 9; n >= nIn; n--)
                    {
                        //check if both of the player's first number is even
                        if (k % 2 == 0 && m % 2 == 0)
                        {
                            //check if both player's second number is odd
                            if (l % 2 == 1 && n % 2 == 1)
                            {
                                //check if change is not valid
                                if (k == m && l == n)
                                {
                                    System.out.println("Cannot change the same player.");
                                }
                                else
                                {
                                    //print {k}{l} - {m}{n}
                                    System.out.printf("%d%d - %d%d", k, l, m , n);
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
