// WAP to check prime number.(count for loop)

import java.util.Scanner;
public class Prime1
{
	public static void main(String alex[])
	{
		int i, a = 2, c = 0, count = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter The Number : ");
		int n = sc.nextInt();
		System.out.print("1st "+n+" Prime number is : ");
		for(; ;)
		{
			boolean b = true;
			for(i = 2; i <= a/2; i++, c++)
			{
				if(a % i == 0)
				{
					b = false;
					break;
				}
			}
			if(b)
			{
				System.out.print(a+" ");
				count++;
			}
			a++;
			if(n == count)
				break;
		}
		System.out.print("\nTotal Number Of Loops = "+c);
	}
}
