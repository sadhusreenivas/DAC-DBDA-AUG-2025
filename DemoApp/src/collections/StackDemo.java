package collections;
import java.util.*;

public class StackDemo {

	public static void main(String[] args) {
		
		Stack s = new Stack();
		System.out.println(s.capacity());
		
	      s.add(10);
	      s.push(20);
	      s.push("C_DAC");
	      s.push(null);
	      s.push(3.14);
	      s.push(true);
	      System.out.println(s);
	      System.out.println(s.pop()); // true
	      System.out.println(s.pop());// 3.14
	      System.out.println(s.peek()); // null
	      System.out.println(s);
	      
	      Iterator itr = s.iterator();
	      while(itr.hasNext()) {
	    	  System.out.println(itr.next());
	      }
	      
	      Enumeration enumeration = s.elements();
	      while(enumeration.hasMoreElements()) {
	    	  System.out.println(enumeration.nextElement());
	      }

	}

}
