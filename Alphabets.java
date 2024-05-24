// WAP to display Uppercase / Lowercase A to Z and a to z using for loop.

public class Alphabets
{
	public static void main(String args[])
	{
		char ch;
		for(ch = 'A' ; ch <= 'Z' ; ch++)	// UpperCased
		System.out.print(ch+ " ");
		System.out.print("\n");							
		for(ch = 'a' ; ch <= 'z' ; ch++)	// LowerCased
		System.out.print(ch+ " ");
	}
}
