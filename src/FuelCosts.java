import java.util.Scanner;
public class FuelCosts {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double numGallons = 0;
        double mpg = 0;
        double ppg = 0;
        boolean gallonsDone = false;
        boolean mpgDone = false;
        boolean ppgDone = false;
        double driveCost = 0;
        double fullTank = 0;
        String trash = "";

            do {
                System.out.print("Enter the number of gallons of gas in the tank: ");
                if (in.hasNextDouble()) {
                    numGallons = in.nextDouble();
                    in.nextLine(); // clear buffer
                    System.out.println("The number of gallons in the tank is " + numGallons);
                    gallonsDone = true;
                } else {
                    trash = in.nextLine();
                    System.out.println("You entered " + trash + " this is not a valid input!");
                }

            } while (!gallonsDone);
                do {
                    System.out.print("How many miles do you typically get per gallon:  ");
                    if (in.hasNextDouble())
                    {
                        mpg = in.nextDouble();
                        in.nextLine(); // clear buffer
                        System.out.println("The fuel efficiency per gallon is " + mpg);
                        mpgDone = true;
                    } else {
                        trash = in.nextLine();
                        System.out.println("You entered " + trash + " this is not a valid input!");
                    }

                } while (!mpgDone);
                    do {
                        System.out.print("What is the price of gas per gallon: ");
                        if (in.hasNextDouble())
                        {
                            ppg = in.nextDouble();
                            in.nextLine(); //clears buffer
                            System.out.println("The price per gallons is " + ppg);
                            ppgDone = true;
                        }
                        else
                        {
                            trash = in.nextLine();
                            System.out.println("You entered " + trash + " this is not a valid input!");
                        }
                    }while (!ppgDone);
                    //calculations
                    driveCost = (100/mpg) * ppg;
                    System.out.println("The cost to drive 100 miles would be " + driveCost);
                    fullTank = numGallons * mpg;
                    System.out.println("You can go " + fullTank + " miles on a full tank");



    }
}
