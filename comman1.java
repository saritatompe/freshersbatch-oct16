import java.lang.*;
class comman1
{
	public static void main(String args[])
		{
		int num,temp;
		int arr[]=new int[5];
		for(int i=0;i<args.length;i++)
			{
				num = Integer.parseInt(args[i]);
				arr[i]=num;
			}
		
		for(int j=0;j<args.length;j++)
		{
			System.out.println(arr[j]);
		}
		
		for(int i=0;i<args.length;i++)
			{	
				for(int j=0;j<args.length;j++)
				{
				if(arr[i]>arr[j])
					{
						temp=arr[i];
						arr[i]=arr[j];
						arr[j]=temp;
					}
				}
			}
		System.out.println("after sorting.......");

		for(int j=0;j<args.length;j++)
		{
			System.out.println(arr[j]);
		}
		}
}