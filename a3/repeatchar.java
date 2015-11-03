import java.util.*;

public class repeatchar
{
	public static void main(String... args)
	{	
		System.out.println("---------------------------------");

		Scanner scanner = new Scanner(System.in);
		System.out.println("Welches Zeichen moechten Sie sehen ?");
		String character = scanner.next();
		if(character.length() == 1)
		{
			System.out.println("Wie oft soll dieses Zeichen wiederholt werden?");
			int h = scanner.nextInt();

			for(int i = 0; i<h; i++)
			{
				System.out.print(character);
			}
		}


		System.out.println("\r\n---------------------------------");

	}
}