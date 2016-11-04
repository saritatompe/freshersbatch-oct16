package collection;
import java.util.*;
/*
 * 3.	Create a ArrayList with few elements & print it in backward direction. Use ListIterator.
 */
public class ArrayD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> nameList = new ArrayList<Integer>();
		nameList.add(10);
		nameList.add(20);
		nameList.add(5);
		ListIterator<Integer> itr = nameList.listIterator(nameList.size());	
		
		while(itr.hasPrevious()) {
			System.out.println(itr.previous());
		}
		

	}

}
