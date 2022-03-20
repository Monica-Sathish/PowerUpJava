package prgs;
import java.util.*;
class Student implements Comparable<Student>{
	String name;
	int marks;
	int age;
	Student(String name, int marks, int age){
		this.name=name;
		this.marks=marks;
		this.age=age;
	}
	public int compareTo(Student st) {
		//return this.marks-st.marks;
		//return this.age-st.age;
		return(this.name).compareTo(st.name);
	}
}
public class compareto {
	public static void main(String[] args) {
		ArrayList<Student> a1 = new ArrayList<Student>();
		a1.add(new Student("Ram", 99, 16));
		a1.add(new Student("Meena", 67, 15));
		a1.add(new Student("Sam", 78, 17));
		a1.add(new Student("Aarthi", 89, 16));
		a1.add(new Student("Moni", 55, 19));
		Collections.sort(a1);
		System.out.println("ASCENDING ORDER OF NAME");
		ListIterator <Student> it = a1.listIterator();
		while(it.hasNext()) {
			Student st = it.next();
			System.out.println(st.name+" "+st.marks+" "+st.age);
		}
		System.out.println();
		System.out.println("DESCENDING ORDER OF NAME");
		while(it.hasPrevious()) {
			Student st = it.previous();
			System.out.println(st.name+" "+st.marks+" "+st.age);
		}
	}
}
/*for(Student st:a1) {
System.out.println(st.name+" "+st.marks+" "+st.age);
}*/