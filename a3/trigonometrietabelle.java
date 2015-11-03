import java.util.*;

public class trigonometrietabelle
{
	public static void main(String... args)
	{	
		System.out.println("---------------------------------");
		
		System.out.println(" 	Sin 		Cos 		Tan");		//jeweils 3 tabs abstand
		for(double d = 0.0; d <= 180.0; d+=15.0)
		{
			System.out.print(d+"	"); 
			System.out.printf("%7.5f", Math.sin(Math.toRadians(d)));
			System.out.print("		");
			
			if(d<=90.0)
				System.out.print(" ");		//das minus macht sonst die formatierung bei der ausgabe kaputt
			
			System.out.printf("%7.5f", Math.cos(Math.toRadians(d)));
			System.out.print("	");
			if(d == 90.0)
			{
				System.out.print("n/a");		//damit keine extrem große zahl ausgegeben wird
			}
			else
			{
				System.out.printf("%7.5f", Math.tan(Math.toRadians(d)));	
			}
			
			System.out.println("");
		}

		System.out.println("\r\n---------------------------------");

	}
}