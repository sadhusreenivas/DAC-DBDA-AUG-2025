package collections;
import java.util.*;
public class TSDemo {
	public static void main(String[] args) {
		
		Set<Student> studSet = new TreeSet<Student>(new MyComp1());
		studSet.add(new Student(100,"ABC","CS",8.9));
		studSet.add(new Student(101,"XYZ","EC",7.8));
		studSet.add(new Student(102,"ASDF","EE",8.2));
		studSet.add(new Student(103,"PQR","CS",8.5));
		studSet.add(new Student(104,"QWERTY","ME",7.9));
		studSet.add(new Student(105,"MVR","EC",6.9));
		studSet.add(new Student(106,"ABCD","EE",7.9));
		
		System.out.println(studSet); 
		
        studSet.stream().forEach(System.out::println);
	}

}


class MyComp1 implements Comparator<Student>{
	@Override
	public int compare(Student s1, Student s2) {
		return s1.getBranch().compareTo(s2.getBranch());
	}
}

