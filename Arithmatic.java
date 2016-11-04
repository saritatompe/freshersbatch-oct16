package lambda;


public class Arithmatic {

	public static void main(String[] args) {
		System.out.println("Addition is :");
		MathOperation<Integer,Integer> addition = ( a,b) -> { System.out.println("numbers are :"+a+" "+b);
															return a+b; };
		System.out.println(addition.Operation(3, 4));
		System.out.println("Subhastraction is :");
		MathOperation<Integer,Integer> substraction = ( a,b) -> {System.out.println("numbers are :"+a+" "+b);
																return a-b; };
		System.out.println(substraction.Operation(8, 4));
		System.out.println("Divisoin is :");
		MathOperation<Integer,Integer> Div = ( a,b) -> {System.out.println("numbers are :"+a+" "+b);
														return a/b; };
		System.out.println(Div.Operation(16, 4));
		System.out.println("Multiplication is:");
		MathOperation<Integer,Integer> Multi = ( a,b) -> {System.out.println("numbers are :"+a+" "+b);
															return a*b; };
		System.out.println(Multi.Operation(3, 4));
	}

}
