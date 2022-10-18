//Input 2 decimal numbers and check if they are both same or different up to two decimal places. E.g 120.546 & 120.241
import java.util.Scanner;

public class decimal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double p;
        double q;

        System.out.print("Enter 1st number: ");
        p = input.nextDouble();

        System.out.print("Enter 2nd number: ");
        q = input.nextDouble();
        input.close();

        if (Math.abs(p - q) <= 0.01) {
            System.out.println("They are the same");
        } else {
            System.out.println("They are different");
        }
    }
}
