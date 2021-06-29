package set;

import java.util.Comparator;
import java.util.TreeSet;

class Person implements Comparable<Person> {

	String name;
	int age;
	double salary;

	Person(String name, int age, double salary) {
		this.name = name;
		this.age = age;
		this.salary = salary;

	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", salary=" + salary + "]";
	}

	@Override
	public int compareTo(Person p) {
		if (this.age < p.age) {
			return -1;
		} else if (this.age > p.age)
			return 1;

		return 0;
	}

}

public class TreeSetDemo {
	public static void main(String[] args) {

		Person p1 = new Person("Yazid", 27, 10000);
		Person p2 = new Person("Ramzi", 29, 10000);
		Person p3 = new Person("Connor", 22, 5000);
		Person p4 = new Person("Simo", 50, 20000);
		Person p5 = new Person("Anas", 12, 1500);

		TreeSet<Person> persons = new TreeSet<>();
		persons.add(p1);
		persons.add(p2);
		persons.add(p3);
		persons.add(p4);
		persons.add(p5);

		for (Person p : persons) {
			System.out.println(p);
		}

		Comparator<Person> comparator = new Comparator<>() {
			@Override
			public int compare(Person p1, Person p2) {
				if (p1.salary < p2.salary) {
					return -1;
				} else if (p1.salary > p2.salary) {
					return 1;
				}
				return p1.compareTo(p2);
			}
		};

		System.out.println("/************Comparator***************");

		TreeSet<Person> set = new TreeSet<>(comparator);
		set.add(p1);
		set.add(p2);
		set.add(p3);
		set.add(p4);
		set.add(p5);
		
		for (Person p : set) {
			System.out.println(p);
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}
