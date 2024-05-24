// WAP to display the Quotient and Remainder.

import java.util.Scanner;

public class QR
{
	public static void main(String alex[])
	{
		float quotient,remainder,divisor,dividend;
		Scanner pk = new Scanner(System.in);
		System.out.print("Enter the divisor : ");
		divisor = pk.nextInt();
		System.out.print("Enter the dividend : ");
		dividend = pk.nextInt();
		quotient = dividend / divisor;
		remainder = dividend % divisor;
		System.out.println("Quotient : "+quotient);
		System.out.println("Remainder : "+remainder);
	}
}

