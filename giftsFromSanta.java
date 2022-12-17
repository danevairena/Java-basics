/* Santa Claus begins to travel from town to town to bring gifts to all the obedient children. He asks you to write a program 
that will print on the console all the address numbers from M to N that are both divisible by 2 and 3 without a remainder, 
because Santa Claus knows that only obedient children live there. Another number will be read from the console at address S. 
If any of the address numbers M through N that are divisible by 2 and 3 equals address S, that address should not be printed and the 
program should terminate. Otherwise, all address numbers up to N that meet the condition are printed.

3 numbers are read from the console, each on a separate line:
• N – Integer – 0 <= N < M
• M – Integer – N < M <= 10000
• S – integer – N <= S <= M

Output:
On the console, all eligible address numbers are printed on one line, separated by a space. */

import java.util.Scanner;

public class giftsFromSanta
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        int m = Integer.parseInt(scan.nextLine());
        int s = Integer.parseInt(scan.nextLine());

        if (s % 2 == 0 && s % 3 == 0)
        {
            for (int i = m; i > s; i--)
            {
                if (i % 2 == 0 && i % 3 == 0)
                {
                    System.out.print(i);
                    System.out.print(" ");
                }
            }
        }
        else
        {
            for (int i = m; i > n; i--)
            {
                if (i % 2 == 0 && i % 3 == 0)
                {
                    System.out.print(i);
                    System.out.print(" ");
                }
            }
        }
    }
}
