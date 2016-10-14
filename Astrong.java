import java.util.*;
import java.math.*;

class Astrong
{
	public static void main(String args[])
		{
		int m1;
		//Scanner reader = new Scanner(System.in);  // Reading from System.in
		//System.out.println("Enter a number of which table u wanted to print : ");
		for(long i=100;i<999;i++)
		{
		//m1 = reader.nextInt();
		//change in i if u want to take it from user as m1 and add else
		if ( Math.pow(i/100, 3) + Math.pow( (i/10) % 10, 3) + Math.pow(i%10, 3) == i) {
			System.out.println(" "+i);	
		}
		
	}
}
}