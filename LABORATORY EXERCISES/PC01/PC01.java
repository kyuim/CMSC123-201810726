import java.util.*;

public class PC01 
{
    public static void triangle(int k)
    {
        int i;
        int x;
        int y;

        for (i = 0; i < k + 1; i++) 
        { 
            for (x = k; x > i; x--) 
            {
                System.out.print(" ");
            }

            for (y = 0; y < (2 * i - 1); y++) 
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        int k = 0;

        System.out.println("Enter height: ");
        k = scan.nextInt();

        triangle(k);  
        
    }
}