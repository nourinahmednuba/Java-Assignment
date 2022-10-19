/* Input an amount from the user and find out the number of notes from input amount in given array
[1000,500,200,100,50,20,10,5,2,1]
Input: 1256
Output:
1000 1
100 2
50 1
2 3
 */

import java.util.Scanner;

public class Notes
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);

        int n[]={ 1000 , 500 , 200 , 100 , 50 , 20 , 10 , 5 , 2 , 1 };

        System.out.println("Enter an Amount: ");
        int amount = s.nextInt();

        for(int p=0; p<n.length; p++)
        {
            while(amount >= n[p]){
                int temp = amount / n[p];
                amount = amount % n[p];
                System.out.print("\nTotal Number Of " + n[p] + "TK Notes :"+ temp) ;
                break ;
            }
        }
    }
}
