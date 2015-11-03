import java.util.*;

public class PiBerechnen
{
	public static void main(String... args)
	{	
		System.out.println("---------------------------------");

		float pi = 0f;
		
		float f = 1.0f;
		for(int i = 0; 
			f<=20.0f; 
			pi = i%2==0? pi + (4.0f / f): pi - (4.0f / f),  	//verkürzte if-else verzweigung mit prüfung ob die zahl gerade ist
			f+=2.0f, i++);	

		System.out.println("(10)	PI = "+pi);

		pi = 0f;
		f = 1.0f;
		for(int i = 0; 
			f<=200.0f; 
			pi = i%2==0? pi + (4.0f / f): pi - (4.0f / f), 
			f+=2.0f, i++);

		System.out.println("(100)	PI = "+pi);

		pi = 0f;
		f = 1.0f;
		for(int i = 0; 
			f<=2000.0f; 
			pi = i%2==0? pi + (4.0f / f): pi - (4.0f / f), 
			f+=2.0f, i++);

		System.out.println("(1000)	PI = "+pi);
		
		System.out.println("\r\n---------------------------------");

	}
}