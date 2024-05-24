// WAP to print the 10 to 100 and 100 to 10.

public class Print
{
	public static void main(String alex[])
	{
		System.out.println("\nAscending Order -");
		int x = 1;		// Starting Point = 1
		while(x <=100)	// Ending Point = 100
		{
			System.out.print(+x+"  ");
			x++;        // Updation = ++
		}

		System.out.println("\nDescending Order -");
		int x1 = 100;		// Starting Point = 100
		while(x1 >=1)		// Ending Point = 1
		{
			System.out.print(+x1+"  ");
			x1--;		// Updation = --
		}
	}
}

