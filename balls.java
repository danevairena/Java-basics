import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class balls
{
    public static void main(String[] args)
    {
        //new scanner
        Scanner scan = new Scanner(System.in);

        //colors array
        String[] balls = new String[5];
        balls[0] = "red";
        balls[1] = "orange";
        balls[2] = "yellow";
        balls[3] = "white";
        balls[4] = "black";

        //balls counters
        int redBalls = 0;
        int orangeBalls = 0;
        int yellowBalls = 0;
        int whiteBalls = 0;
        int blackBalls = 0;
        int other = 0;
        //score counter
        int score = 0;

        //user input - number of colors to add
        int number = Integer.parseInt(scan.nextLine());

        //loop for checking user input
        for (int i = 0, j = 0; i < number; i++)
        {
            //input color
            String color = scan.nextLine();
            for (j = 0; j < 5; j ++)
            {
                //if color matches existing color
                if (Objects.equals(color, balls[j]))
                {
                    switch (j) {
                        case 0 -> {
                            score += 5;
                            redBalls++;
                        }
                        case 1 -> {
                            score += 10;
                            orangeBalls++;
                        }
                        case 2 -> {
                            score += 15;
                            yellowBalls++;
                        }
                        case 3 -> {
                            score += 20;
                            whiteBalls++;
                        }
                        case 4 ->{
                            score = score / 2;
                            blackBalls++;
                        }
                    }
                }
            }
            other = number - (redBalls + orangeBalls + yellowBalls + whiteBalls + blackBalls);
        }
        System.out.printf("Total points: %d\n", score);
        System.out.printf("Red balls: %d\n", redBalls);
        System.out.printf("Orange balls: %d\n", orangeBalls);
        System.out.printf("Yellow balls: %d\n", yellowBalls);
        System.out.printf("White balls: %d\n", whiteBalls);
        System.out.printf("Other colors picked: %d\n", other);
        System.out.printf("Divides from black balls: %d\n", blackBalls);
    }
}
