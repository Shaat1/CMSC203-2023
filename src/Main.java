import java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name");
        String Name = scanner.nextLine();
        // Input the name and store it in the variable Name
        System.out.println("Describe yourself");
        String Description = scanner.nextLine();
        // Input a description and store it in the variable Description
        System.out.println("Due Date");
        String dueDate = scanner.nextLine();
        // Input the due date to this project
          final String COLOR_RED = "Red";
          final String COLOR_GREEN = "Green";
          final String COLOR_BLUE = "Blue";
          final String COLOR_ORANGE = "Orange";
          final String COLOR_YELLOW = "Yellow";
        // Declare final Strings in the name of the colors
        String colorGenerated= null;
        Random rand = new Random();
        // setting Color generated to null and importing the random function
        int correctAns= 0;

        //creating a loop for the game and assigning each color to a number using switch. and setting the value of i = 0
        for (int i=0; i<10; i++)
        {

            int color = rand.nextInt(5);

            // assigning numbers to each color starting from 0 to 4
            switch (color){
                case 0 :
                    colorGenerated= COLOR_RED;
                    break;
                case 1:
                    colorGenerated= COLOR_GREEN;
                    break;
                case 2:
                    colorGenerated= COLOR_BLUE;
                    break;
                case 3:
                    colorGenerated= COLOR_ORANGE;
                    break;
                case 4:
                    colorGenerated= COLOR_YELLOW;
                    break;

            }
            // incrementing i to start the game
            System.out.println("Round "+(i+1));
            System.out.println();

            System.out.println("I am thinking of a color.");
            System.out.println("Is it Red, Green, Blue, Orange, or Yellow?");
            System.out.println("Enter your guess:");
            String guessed = scanner.nextLine();
            // Input validation using while loop and ignoring case.
            while (!guessed.equalsIgnoreCase(COLOR_ORANGE)&&!guessed.equalsIgnoreCase(COLOR_RED)&&!guessed.equalsIgnoreCase(COLOR_BLUE)&&!guessed.equalsIgnoreCase(COLOR_YELLOW)&&!guessed.equalsIgnoreCase(COLOR_GREEN))
            {
                System.out.println("You entered incorrect color. Is it Red, Green, Blue, Orange, or Yellow?");
                System.out.println("Enter your guess again:" );
                guessed = scanner.nextLine();
            }

            System.out.println("I was thinking of " + colorGenerated);

            // Calculating how many times the player has won
            if (guessed.equalsIgnoreCase(colorGenerated))
            {
                correctAns+=1;
            }





        }


        System.out.println("Game Over");
        System.out.println();
        System.out.println("You guessed "+correctAns+" out of 10 colors correctly.");
        System.out.println("User Name: "+Name);
        System.out.println("User Description: "+ Description);
        System.out.println("Due Date: "+dueDate);


    }
}