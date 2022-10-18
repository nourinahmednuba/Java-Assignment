//Write a program to enter the numbers till the user wants and at the end, the program should display the largest and smallest numbers user entered.
import java.util.Scanner;
public class display {
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);

        int num;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        char c;

        do
        {
            System.out.print("Enter the number ");
            num = console.nextInt();

            if(num > max)
            {
                max = num;
            }

            if(num < min)
            {
                min = num;
            }

            System.out.print("Do you want to continue y/n? ");
            c = console.next().charAt(0);

        }while(c=='y' || c == 'Y');

        System.out.println("Largest number: " + max);
        System.out.println("Smallest number: " + min);
    }
}

