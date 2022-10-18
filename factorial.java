//Write  a program to find the factorial of a given number
public class factorial {
    public static void main(String[] args) {

        int num = 15;
        long f = 1;
        for(int p = 1; p <= num; ++p)
        {
            // factorial = factorial * i;
            f *= p;
        }
        System.out.printf("Factorial of %d = %d", num, f);
    }
}
