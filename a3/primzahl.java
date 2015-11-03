import java.util.*;

public class primzahl
{
	public static void main(String... args)
	{	
		System.out.println("---------------------------------");
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Ganzzahl eingeben: "); 
		long eingabe = scanner.nextLong();
		
		long t1 = System.currentTimeMillis();

		long l = 0;
		for(l = eingabe-1; l>1 && eingabe % l != 0; l--);

		long t2 = System.currentTimeMillis();

		if(l == 1)
		{
			System.out.println(eingabe+" ist eine Primzahl.");
		}
		else 
		{
			System.out.println(eingabe+" ist keine Primzahl. Größter Teiler = "+l);
		}
		
		System.out.println("größter Teiler = "+l);

		System.out.println("Dauer der Berechnung: "+ (t2-t1));
		System.out.println("\r\n---------------------------------");

	}
}
