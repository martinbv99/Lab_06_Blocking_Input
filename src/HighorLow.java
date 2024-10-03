import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.Random;  // at the top before the main
public class HighorLow
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        Random gen = new Random(); // I usually call it rnd or gen
        int val = gen.nextInt(10) + 1;  // val is 1 to 10
        int numGuess = 0;
        boolean numInput = false;
        String trash = "";

        do
        {
            System.out.print("Guess a number [1-10]: ");
            if (in.hasNextInt()) {
                numGuess = in.nextInt();
                in.nextLine();//clear buffer

                if (numGuess >= 1 && numGuess <= 10) {
                    System.out.println("You guessed " + numGuess);
                    System.out.println("The number is " + val);

                    if (numGuess < val) {
                        System.out.println("You were too low :p");
                    } else if (numGuess > val) {
                        System.out.println("You were too high :O");
                    } else {
                        System.out.println("You were right on the money B)");
                        numInput = true;
                    }
                }else
                {
                    System.out.println("Your guess is out of range ");
                }
            }
                else
                {
                   trash = in.nextLine();
                   System.out.println("Your guess was " + trash + " which is not a valid input >:(");
                }
        }while (!numInput);
    }
}
