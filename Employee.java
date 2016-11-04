package com.hibernate;
import javax.persistence.*;
import javax.persistence.NamedQueries;



	@NamedQueries({
		@NamedQuery(name="getAllEmployee",
				query="from Employee")
		
	})
	@Entity
	@Table(name="employee_master")
	
	
		public class Employee {

		@Id
		@GeneratedValue	//(strategy=GenerationType.SEQUENCE, generator="my_seq")
		//@SequenceGenerator(name="my_seq", sequenceName="db_seq",allocationSize=10 ,initialValue=0 )
		@Column(name="id")
		private Long id;
		
		@Column(name="name")
		private String name;

		@Column(name="salary")
		private Long salary;
		
		@Column(name="location")
		private String location;
		
		
		public Employee() {
		}
		public Employee(String location,String name,long salary) {
			this.location=location;
			this.name = name;
			this.salary = salary;
			
		}
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public long getPrice() {
			return salary;
		}
		public void setPrice(long salary) {
			this.salary = salary;
		}
		public String getLocation()
		{
			return location;
		}
		public void setLocation(String location)
		{
			this.location=location;
		}
		public String toString() {
			return id + " - " + location + " - " + name+" - "+salary;
		}
	}

