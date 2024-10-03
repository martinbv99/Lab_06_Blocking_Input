import java.util.Scanner;
public class RectangleInfo
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        double width = 0;
        double height = 0;
        boolean widthDone = false;
        boolean heightDone = false;
        String trash = "";
        double area = 0;
        double perimeter = 0;
        double diagonal = 0;
        double diagonalAns = 0;

        do
        {
            System.out.print("Enter the width of the rectangle: ");
            if (in.hasNextDouble())
            {
                width = in.nextDouble();
                in.nextLine();//clear buffer
                System.out.println("You said the width was " + width);
                widthDone = true;
            }
            else
            {
                trash = in.nextLine();
                System.out.println(trash + " is not a valid input! ");
            }

        }while (!widthDone);
                do
                {
                    System.out.print("Enter the height of the rectangle: ");
                    if (in.hasNextDouble())
                    {
                        height = in.nextDouble();
                        in.nextLine(); //clear that thang
                        System.out.println("You said the height was " + height );
                        heightDone = true;
                    }
                    else
                    {
                        trash = in.nextLine();
                        System.out.println(trash + " is not a valid input! ");
                    }

                }while (!heightDone);
                        //calculations now
                    area = height * width;
                    perimeter = (height + width) * 2;
                    diagonal = Math.sqrt((height * height) + (width * width));




                    System.out.println("The area is " + area );
                    System.out.println("The perimeter is " + perimeter );
                    System.out.println("The diagonal is " + diagonal);


    }
}
