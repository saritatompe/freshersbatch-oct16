package collection;
import java.util.*;
class Date
{
	int day,month,year;
	 Date(int day,int month,int year)
	 {
		 this.day=day;
		 this.month=month;
		 this.year=year;
	 }
	 
	 @Override
	public int hashCode() {
		// TODO Auto-generated method stub
		 
		  return this.day*this.month;
	}
	 @Override
	 public boolean equals(Object obj) {
	
		 if(((Date)obj).day==this.day&&((Date)obj).month==this.month)
			 return true;
		 else
			 return false;
	}
	 public String toString()
	 {
		 return " "+day+"/"+month+"/"+year;
	 }
}
public class Employee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Date, String> hmap = new HashMap<Date, String>();
		hmap.put(new Date(12,7,1994),"ABC");
		hmap.put(new Date(12,7,1995),"QSA");
	System.out.println(hmap);
	}
}
