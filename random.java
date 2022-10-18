//Write a program to generate 2 random numbers which will not be shown to the user. Take a user input and match it with any of the random numbers. If correct give it 1 point and if incorrect, do not give it any point. Finally, repeat this for 10 times and count the point user achieved.
import java.util.Scanner;
public class random
    {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            double i = Math.random();
            double j = Math.random();
            int count = 0;
            for(int p=0; p<10; p++){
                System.out.println("Guess A Number: ");
                double userInput = sc.nextDouble();
                if(userInput==i || userInput == j){
                    count++;
                }
            }
            System.out.println("You achieved "+ count + " points");
        }
    }
