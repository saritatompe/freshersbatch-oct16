import java.util.*;
import java.math.*;

public class Lottry { 
    public static void main(String[] args) { 

        int min=1;
	int max=49;

	Random random=new Random();
	int randomnumber1=random.nextInt(max-min)+min;
	System.out.println(""+randomnumber1);
	int randomnumber2=random.nextInt(max-min)+min;
	System.out.println(""+randomnumber2);
	int randomnumber3=random.nextInt(max-min)+min;
	System.out.println(""+randomnumber3);
	int randomnumber4=random.nextInt(max-min)+min;
	System.out.println(""+randomnumber4);
	int randomnumber5=random.nextInt(max-min)+min;
	System.out.println(""+randomnumber5);
	int randomnumber6=random.nextInt(max-min)+min;
	System.out.println(""+randomnumber6);
	int arr1[]=new int[6];
	Scanner s=new Scanner(System.in);
	System.out.println("Enter 6 numbers in sequence to chcek the lottry");
		for(int i=0;i<6;i++)
		{
		arr1[i]=s.nextInt();
		}
		for(int i=0;i<6;i++)
		{
		System.out.println(arr1[i]);
		}
	if((arr1[0]==randomnumber1)||(arr1[1]==randomnumber2)||(arr1[2]==randomnumber3)||(arr1[3]==randomnumber4)||(arr1[4]==randomnumber4)||(arr1[5]==randomnumber6))
		{
			System.out.println("lottery... :) yehh");
		}
	else
		{
					System.out.println("SOORRRY ");
		}

                           
    }

}