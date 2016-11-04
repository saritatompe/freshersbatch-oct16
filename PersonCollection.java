package collection;

import java.util.Iterator;
import java.util.Set;
import java.util.*;

class Person{
    
    private String name;
    private int height;
    private int weight;
     
    public Person(String n, int height,int weight){
        this.name = n;
        this.height = height;
        this.weight=weight;
    }
     
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getHeight() {
        return height;
    }
    public void setHeight(int height) {
        this.height = height;
    }
    public int getWeight() {
        return weight;
    }
    public void setweight(int weight) {
        this.weight = weight;
    }
    public String toString(){
        return "Name: "+this.name+"-- height: "+this.height+"----weight :"+this.weight;
    }
}

public class PersonCollection {
	 
    public static void main(String args[]){
        //By using name comparator (String comparison)
    	System.out.println(" NORMAL DATA :\n");
        TreeSet<Person> nameComp = new TreeSet<Person>(new MyNameComp());
        nameComp.add(new Person("abc",3,50));
        nameComp.add(new Person("John",6,60));
        nameComp.add(new Person("kartik",2,90));
        nameComp.add(new Person("Tom",4,25));
        for(Person p:nameComp){
            System.out.println(p);
        }
        System.out.println("\n\nACCORDING TO HEIGHT \n");
        //By using salary comparator (int comparison)
        TreeSet<Person> heightComp = new TreeSet<Person>(new MyHeightComp());
        heightComp.add(new Person("abc",3,50));
        heightComp.add(new Person("John",6,60));
        heightComp.add(new Person("Crish",2,90));
        heightComp.add(new Person("Tom",4,25));
        for(Person p:heightComp){
            System.out.println(p);
        }
        System.out.println("\n\nACCORDING TO HEIGHT \n");
        TreeSet<Person> weightComp = new TreeSet<Person>(new MyWeightComp());
        weightComp.add(new Person("abc",3,50));
        weightComp.add(new Person("John",6,60));
        weightComp.add(new Person("Crish",2,90));
        weightComp.add(new Person("Tom",4,25));
        for(Person p:weightComp){
            System.out.println(p);
    }
}
}
class MyNameComp implements Comparator<Person>{
 
    @Override
    public int compare(Person e1, Person e2) {
        return e1.getName().compareTo(e2.getName());
    }
}   
 
class MyHeightComp implements Comparator<Person>{
 
    @Override
    public int compare(Person e1, Person e2) {
        if(e1.getHeight() > e2.getHeight()){
            return 1;
        } else {
            return -1;
        }
    }
}
    class MyWeightComp implements Comparator<Person>{
    	 
        @Override
        public int compare(Person e1, Person e2) {
            if(e1.getWeight() > e2.getWeight()){
                return 1;
            } else {
                return -1;
            }
        }
}
 

