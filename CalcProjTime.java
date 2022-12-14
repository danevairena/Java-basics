package lab.firstSteps;

import java.util.Scanner;

public class CalcProjTime
{
        public static void main(String[] args)
        {
            //new scan obj
            Scanner scan = new Scanner(System.in);

            //Prompt user for details
            System.out.println("Architect's name:");
            String name = scan.nextLine();
            System.out.println("Number of projects:");
            int projectsNumber = Integer.parseInt(scan.nextLine());
            
            //calc total time for all projects
            int totalTime = projectsNumber * 3;

            System.out.println("The architect " + name + " will need " + totalTime + " hours to complete " + projectsNumber + " project/s.");
        }
}
