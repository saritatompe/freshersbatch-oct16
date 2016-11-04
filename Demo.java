package collection;
import java.util.*;
/*
 * 2.	Prove that HashSet is unordered & LinkedHashSet is ordered.
 */
public class Demo {
	public static void main(String args[])
	{
		System.out.println("\n\nUsing hash set");
		Set<String> hset = new HashSet<String>();
		hset.add("gt");
		hset.add("nn");
		hset.add("cc");
		hset.add("nn");
		Iterator<String> itr = hset.iterator();		
		while(itr.hasNext()) {
			String key = itr.next();
			System.out.println(key);
		}

		System.out.println("\n\nUsing linkedhash set");
		//System.out.println("\n");
		Set<String> hset1 = new LinkedHashSet<String>();
		hset1.add("gt");
		hset1.add("nn");
		hset1.add("cc");
		hset1.add("nn");
		Iterator<String> itr1 = hset1.iterator();		
		while(itr1.hasNext()) {
			String key = itr1.next();
			System.out.println(key);
		}
		System.out.println("\n");
	
	
	}

}
