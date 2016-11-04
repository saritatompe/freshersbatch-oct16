package lambda;
import java.util.*;
import java.util.function.*;
public class StringLambdaDemo {

	public static void main(String[] args) {
			List<String> list=new ArrayList<String>();
			list.add("sarita");
			list.add("Komal");
			list.add("abcd");
			list.add("a");
			System.out.println(list);
	
			Predicate<String> bjn = (String str1) -> str1.length()%2 != 0;
			list.removeIf((str) -> str.length()%2 != 0);
			System.out.println(list);
	}

}
