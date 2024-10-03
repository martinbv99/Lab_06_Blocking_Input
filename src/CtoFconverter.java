import java.util.Scanner;
public class CtoFconverter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double celsius = 0;
        double fahrenheit = 0;
        String trash = "";
        boolean done = false;


        do{
            System.out.print("Enter the Temperature in Celsius: ");
            if (in.hasNextDouble())
            {
                celsius = in.nextDouble();
                in.nextLine();
                fahrenheit = celsius * 1.8 + 32;

                System.out.println("The temperature converted to Fahrenheit is " + fahrenheit);
                done = true;
            }else
                {
                    trash = in.nextLine();
                    System.out.println("You entered " + trash);
                    System.out.println("This is not a valid input");
                }


        }while (!done);

    }
}