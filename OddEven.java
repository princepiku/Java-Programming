// WAP to check the number is odd and even.

//import java.util.*;
import java.util.Scanner;
public class OddEven
{
	public static void main(String alex[])
	{
		Scanner pk = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int n = pk.nextInt();
		if(n >= 0)
		{
			if(n % 2 == 0)
			{
				System.out.print(+n+" is even number.");
			}
			else
				System.out.print(+n+" is odd number.");
		}
		else
			System.out.print("Invalid number !");
	}
}

/*
// WAP to check the number is odd and even and also check greatest number.
import java.util.Scanner;

public class OddEven
{
	public static void main(String alex[])
	{
		int a = 10;
		int b = 20;
		int c = (a > b) ? a : b;
		String Msg = (c % 2 == 0) ? "Even" : "Odd";
		System.out.println("Greatest Number = "+c+"\n It is "+Msg);
	}
}
*/

/*
// WAP to print first 10(ten) odd number.

public class OddEven
{
	public static void main(String alex[])
	{
		int x = 1;
		while(x <= 10)
		{
			System.out.print(" "+(2 * x - 1)); // Tn = a+(n-1)d , 2n-1 Where a = First Term And d = Comman Difference Term = 2 
			x++;
		}
	}
}
*/

/*
// WAP To Print All Even Number b/w 120 To 150.
public class Even
{
	public static void main(String alex[])
	{
		int x = 120;   // x = 121;
		while(x <= 150)
		{
			// if(x % 2 == 0)
			// Sop(x);
			// x++;
			System.out.print(x+" "); // n = (n+2) Where n = Even Number And 2 Increment
			x = x + 2;
		}
	}
}

*/

