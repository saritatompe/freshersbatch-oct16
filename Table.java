import java.util.*;
class Table
{
	public static void main(String args[])
		{
		int m1;
		Scanner reader = new Scanner(System.in);  // Reading from System.in
		System.out.println("Enter a number of which table u wanted to print : ");
		m1 = reader.nextInt();
		for(int i=1;i<=10;i++)
			{
				System.out.println(" "+m1*i);	
			}
		}
}