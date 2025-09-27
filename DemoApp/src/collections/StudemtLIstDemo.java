package collections;
import java.util.*;
public class StudemtLIstDemo {

	public static void main(String[] args) {
	
		List<Student> studList = new ArrayList<Student>();
		studList.add(new Student(100,"ABC","CS",8.9));
		studList.add(new Student(101,"XYZ","EC",7.8));
		studList.add(new Student(102,"ASDF","EE",8.2));
		studList.add(new Student(103,"PQR","CS",8.5));
		studList.add(new Student(104,"QWERTY","ME",7.9));
		studList.add(new Student(105,"MVR","EC",6.9));
		studList.add(new Student(106,"ABCD","EE",7.9));
		
		System.out.println(studList);
		studList.forEach(System.out::println);//
		System.out.println("\nStudents sorted based on Name:");
		
		Collections.sort(studList, new Comparator<Student>() {
			@Override
			public int compare(Student s1, Student s2) {
				return s1.getName().compareTo(s2.getName());
			}
		}); 
		studList.forEach(System.out::println);//
		
		System.out.println("\nStudents sorted based on Name - DESC:");
		Collections.sort(studList, (s1,s2) -> s2.getName().compareTo(s1.getName()));
		studList.forEach(System.out::println);//
		
		System.out.println("\nStudents sorted based on length of name - DESC:");
		Collections.sort(studList, (s1,s2) -> s2.getName().length() - s1.getName().length());
		studList.forEach(System.out::println);//
		
		// Only CS students and count
		int cscount = 0;
		for(Student s:studList) {
			if(s.getBranch().equals("CS")){
				cscount++;
				System.err.println(s);
			}
		}
		System.out.println("Count of Students: "+cscount);

		
	}

}
