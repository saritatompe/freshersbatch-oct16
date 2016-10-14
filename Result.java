import java.util.*;
public class Result
{
	public static void main(String args[])
	{
		int m1,m2,m3;
			

	
		Scanner reader = new Scanner(System.in);  // Reading from System.in
		System.out.println("Enter a marks for three subjects : ");
		m1 = reader.nextInt();
		m2 = reader.nextInt();
		m3 = reader.nextInt();
		if(m1>60&&m2>60&&m3>60)
		{
			System.out.println("PASSED");	
		}
		else if((m1>60&&m2>60)||(m2>60&&m3>60)||(m1>60&&m3>60))
		{
			System.out.println("Promoted");	
		}
		else
	
			System.out.println("failed");		
		
	}
}