package collection;

import java.util.HashMap;
import java.util.Map;



/*
 * 5.	Write a user defined class say Employee that overrides equals() & hashCode() methods.
 *  Equals() always returns true & hashCode() always returns a fixed number.
 *   Make such a class as key of you HashMap.
 *  Observe the behavior while calling put & get methods.
 */
class Employee1 {

	int id;
	Employee1(int id)
	{
	
		this.id=id;
	}
	@Override
	public int hashCode() {
	
		return 1;
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return true;
	}
	public String toString()
	 {
		 return " id :"+id;
	 }
}


public class EmployeeD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Employee1,String> hmap = new HashMap<Employee1, String>();
		hmap.put(new Employee1(22),"ABC");
		hmap.put(new Employee1(95),"QSA");
	System.out.println(hmap);
	}

}
