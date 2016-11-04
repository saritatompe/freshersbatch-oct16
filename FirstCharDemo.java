package lambda;
import java.util.*;
import java.util.function.*;
public class FirstCharDemo {
	
		public static void main(String[] args) {
				List<String> list=new ArrayList<String>();
				list.add("sarita");
				list.add("Komal");
				list.add("abcd");
				list.add("a");
				System.out.println(list);
		
	//			Predicate<String> bjn = (String str1) -> str1.length()%2 != 0;
		//		list.removeIf(bjn);
				StringBuilder b=new StringBuilder();
				
			//	Consumer<String> bjn = (String str1) -> b.append(str1.charAt(0));
					list.forEach((str)->b.append(str.charAt(0)));
				System.out.println(b);
		}

}

