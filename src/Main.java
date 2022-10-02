import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {

        Scanner in = new Scanner(System.in);

        int number = 0;
        double eff = 0;
        double price = 0;
        String trash = "";


        System.out.println("enter the number of gallons - ");


        if(in.hasNextInt())
        {

            number = in.nextInt();

        }
        System.out.println("enter the fuel efficiency - ");

        if (in.hasNextDouble())
        {

            eff = in.nextDouble();

        }
        System.out.println("enter the price of gallons - ");

        if(in.hasNextDouble())
        {

            price = in.nextDouble();
        }

        else
        {
            trash = in.nextLine();
            System.out.println(trash + " you have entered a bad input");

        }

        double cost = price * 100 / eff;
        System.out.println("cost per 100 miles - " + cost);

        double distance = number * eff;
        System.out.println("the car can go a distance of - " + distance);










    }
}