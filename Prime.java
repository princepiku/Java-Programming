// WAP to check the number is prime or not. (Divisible by 1 (one) and itself = Prime Number)
import java.util.Scanner;

public class Prime
{
	public static void main(String alex[])
	{
		// int n = Integer.parseInt(alex[0]);
		Scanner pk = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int n = pk.nextInt();
		int i = 2; // if ypu not declared the value = 2 then
		boolean b = true;
		while(i < n)
		{
			if(n % i == 0)	// if(n % 2 == 0)
				b = false;
				i++;
		}
		if(b)
			System.out.print(+n+" is a prime number");
		else
			System.out.print(+n+" is not a prime number");
	}
}
