//Take 5 numbers from users in an array. Then find out the average number, how many even and how many odd numbers using these functions: average(), countEvenNumbers(), countOddNumbers()
import java.util.Arrays;
import java.util.Scanner;

public class Even_odd_avg
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int []ar= new int[5];
        for(int i = 1; i<=ar.length; i++)
        {
            System.out.println("Enter your number "+ i +":");
            ar[i-1] = sc.nextInt();
        }

        Even_odd_avg even_odd_avg1 = new Even_odd_avg();
        even_odd_avg1.countEvenNumbers(ar);
        even_odd_avg1.countOddNumbers(ar);
        even_odd_avg1.average(ar);

    }

    public void countEvenNumbers(int[]ar)
    {
        int evenCounter = 0;
        for(int i=0; i<ar.length; i++)
        {
            if(ar[i]%2 == 0)
            {
                evenCounter++;
            }
        }
        System.out.println("Total Number of Even numbers are: "+ evenCounter);
    }

    public void countOddNumbers(int[]ar)
    {
        int oddCounter = 0;
        for(int i=0; i<ar.length; i++)
        {
            if(ar[i]%2 != 0)
            {
                oddCounter++;
            }
        }
        System.out.println("Total Number of Even numbers are: "+ oddCounter);
    }

    public void average(int[]ar)
    {
        int sum = 0;
        for(int i=0; i<ar.length; i++){
            sum+= ar[i];
        }
        double avg = sum/ar.length;
        System.out.println("Average is: "+ avg);
    }

}
