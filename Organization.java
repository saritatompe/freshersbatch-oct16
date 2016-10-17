class Employee {
	 private double salary;
	 

	 Employee(double salary)	 {
	 	
	 	this.salary=salary;
	 }

	 public double getsal() {
	 	return this.salary;
	 }


}
class Labour extends Employee{
	private double overtime;

	Labour(double salary,double overtime)
	{
		super(salary);
		this.overtime=overtime;
	}
	 public double getsal() {
	 return super.getsal()+this.overtime;
	 }
}
class Manager extends Employee{
	private double incentive;

	Manager(double salary,double incentive)
	{
		super(salary);
		this.incentive=incentive;
	}
	 public double getsal() {
	 return super.getsal()+this.incentive;
	 }
}
public class Organization {
	public static void main(String[] args) {
		Employee a[]=new Employee[2];
		Labour l=new Labour(500, 5000);
		Manager m1=new Manager(1000, 1000);
		a[0]=l;
		a[1]=m1;
		int totalSalary = 0;
		for (Employee e : a ) {
			totalSalary += e.getsal();
		}
		System.out.println(totalSalary);
	}
}