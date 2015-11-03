import java.util.*;

public class schachbrett
{
	public static void main(String... args)
	{	
		System.out.println("---------------------------------");

		Scanner scanner = new Scanner(System.in);
		System.out.println("Breite: ");
		int breite = scanner.nextInt();

		System.out.println("Hoehe: ");			
		int hoehe = scanner.nextInt();

		for(int i = 0; i<hoehe; i++)
		{
			for(int h = 0; h<breite; h++)
			{
				if((h+i)%2 == 0)
					System.out.print("#");
				else
					System.out.print(" ");
			}
			System.out.print("\r\n");
		}


		System.out.println("\r\n---------------------------------");

	}
}