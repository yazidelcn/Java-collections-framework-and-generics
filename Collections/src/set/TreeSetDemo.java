package set;

import java.util.TreeSet;

class Person implements Comparable<Person>{
	
	String name;
	int age;
	
	Person(String name, int age){
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

	@Override
	public int compareTo(Person p) {
		if (this.age < p.age) {
			return -1;
		}
		else if (this.age> p.age)
			return 1;
		
		return 0;
	}
	
	
	
}

public class TreeSetDemo {
	public static void main(String[] args) {
		
	 Person p1 = new Person("Yazid", 27);
	 Person p2 = new Person("Ramzi", 25);
	 Person p3 = new Person("Connor",22);
	 Person p4 = new Person("Simo", 50);
	 Person p5 = new Person("Anas", 12);
	 
	 TreeSet<Person> persons = new TreeSet<>();
	 persons.add(p1);
	 persons.add(p2);
	 persons.add(p3);
	 persons.add(p4);
	 persons.add(p5);
	 
	 for(Person p: persons) {
		 System.out.println(p);
	 }
	 
		
	}

}
