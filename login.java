import java.util.Scanner;

public class login
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String USERNAME = "admin";
        String PASSWORD = "admin@123";

        int f=0;

        for(int i=0; i<3; i++)
        {
            System.out.println("Input Username: ");
            String username = sc.next();
            System.out.println("Input Password: ");
            String password = sc.next();
            if(username != USERNAME || password != PASSWORD)
            {
                f++;
                if (f <3)
                {
                    System.out.println("WRONG USERNAME OR PASSWORD. TRY AGAIN");
                }
                if(f == 3)
                {
                    System.out.println("Your user has been temporary locked");
                }
            }
        }
    }
}
