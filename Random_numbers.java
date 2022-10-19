//Generate 20 random numbers from 0 to 100 and print the max, min and duplicate random numbers (if any)
import java.util.Scanner;

public class Random_numbers
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[20];
        int lowerLimit = 0;
        int upperLimit = 100;
        for (int i = 1; i<=arr.length; i++) {
            int j = (int) (Math.random() * (upperLimit - lowerLimit) + lowerLimit);
            int x = (int) Math.floor(j);
            arr[i-1] = x;
        }

        Random_numbers Random_numbers1 = new Random_numbers();

        System.out.println("Max Value :" + Random_numbers1.findMax(arr));
        System.out.println("Min Value :" + Random_numbers1.findMin(arr));

    }

    public void findDuplicate(int[]a)
    {
        for(int i=0; i<a.length; i++)
        {
            for( int j=i+1; j<a.length; j++)
            {
                if(a[i] == a[j])
                {
                    System.out.println("Found duplicate for "+ a[i]);
                }
            }
        }
    }

    public int findMax(int[]ar)
    {
        int max = ar[0];
        for(int i =0; i<ar.length; i++)
        {
            if(ar[i] >= max)
            {
                max = ar[i];
            }
        }
        return max;
    }

    public int findMin(int[]ar)
    {
        int min = ar[0];
        for(int i =0; i<ar.length; i++)
        {
            if(ar[i] <= min)
            {
                min = ar[i];
            }

        }
        return min;
    }

}

