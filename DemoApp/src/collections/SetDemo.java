package collections;
import java.util.*;
public class SetDemo {
	public static void main(String[] args) {
		
		Set<String> set = new TreeSet(new MyComp());
		set.add("C-DAC");
		set.add("HYD");
		set.add("C-DAC"); // dup
		set.add("DAC");
		set.add("DBDA");
		//set.add(10); // dup
		//set.add(null);
		
		System.out.println(set);
		
		Iterator itr = set.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
	}

}

class MyComp implements Comparator<String>{
	@Override
	public int compare(String o1, String o2) {
		return o2.compareTo(o1);
	}
}
