// WAP To Print The Greatest Number b/w Three Number(Using Conditional Operator).

import java.util.*;
//import java.util.Scanner;

/*
public class Greatest
{
	public static void main(String alex[])
	{
		int a = 55;
		int b = 35;
		int c = 45;
		int greatest = (a > b) ? (a > c ? a : c) : (b > c ? b : c);
		System.out.print("Greatest Number = "+greatest);
	}
}

*/

public class Greatest
{
	public static void main(String alex[])
	{
		Scanner pk = new Scanner(System.in);
		System.out.print("Enter the Number1 : ");
		int n1 = pk.nextInt();
		System.out.print("Enter the Number2 : ");
		int n2 = pk.nextInt();
		System.out.print("Enter the Number3 : ");
		int n3 = pk.nextInt();
		if(n1 > n2 && n1 > n3)
		{
			System.out.println(+n1+" is greater number.");
		}
		else if(n2 > n1 && n2 > n3)
		{
			System.out.println(+n2+" is greater number.");	
		}
		else
			System.out.println(+n3+" is greater number.");
	}
}
