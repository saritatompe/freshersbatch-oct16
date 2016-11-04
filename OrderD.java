package lambda;
/*
 * 2.	Write an application using lambda expressions to print Orders having 2 criteria implemented: 
 * 1) order price more than 10000 2) order status is ACCEPTED or COMPLETED.
 */
public class OrderD {

	public static void main(String[] args) {
	Predicate1<Integer,String> price=(a,b)-> {System.out.println("Price is : "+a +"\t STATUS IS :"+b);
									if ((a>1000)&&b.equals("COMPLETED")||(a>1000)&&b.equals("ACCEPTED"))
										return  true;
									else
										return  false;};
								
	
	
	System.out.println(price.test(60000, "COMPLETED"));
	System.out.println(price.test(900, "ACCEPTED"));
	}
}
