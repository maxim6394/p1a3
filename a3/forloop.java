import java.util.*;

public class forloop
{
	public static void main(String... args)
	{	
		System.out.println("---------------------------------");

		for(int i=2; i<=40; i+=2)
		{
			System.out.print(i + " ");
		}

		System.out.println("\r\n***********************");

		for(int i=99; i>=3; i-=3)
		{
			System.out.print(i + " ");
		}		

		System.out.println("\r\n***********************");

		int summe = 0;
		for(int i=1; i<=100; summe += i, i++);
		System.out.println("Summe: "+summe);
		
		System.out.println("\r\n***********************");

		int produkt = 1;
		for(int i = 1; i<=15;produkt*=i, i+=2);
			System.out.println("Produkt: "+produkt);

		System.out.println("\r\n---------------------------------");

	}
}