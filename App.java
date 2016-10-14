import java.util.*;


class App {
	public static void main(String args[]) {
		int count=1;
		Scanner reader = new Scanner(System.in);  // Reading from System.in
		System.out.println("Enter a user_id : ");
		String s=reader.next().trim();
		System.out.println("password: ");
		String pass=reader.next();
				
		System.out.println("\n ENTER USERNAME AND PASSWORD TO LOGIN");
	        s=reader.next().trim();
		String pass1=reader.next();		
		do
		{
			if(pass1.equals(pass)) {
			System.out.println("welcome "+" "+s);
			break;
			}
			else
			{
				count++;
				pass1=reader.next();
			}
			if(count==3)
			{
			System.out.println("contact admin....");
			}
		}while(count<3);
		
}
}