import java.util.*;

public class Sawblade
{
	public static void Sawblade(int k)
	{
		int i,j;

		for(i=1; i<=k; i++)
		{
			for(j=0; j<i; j++)
			{
				System.out.print("*");
			}

			System.out.println();
		}

		k--;
		Sawblade(k);
	}

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
        int k = 0;

        System.out.println("Enter height of the triangle : ");
        k = scan.nextInt();

        Sawblade(k);  
        
	}
}