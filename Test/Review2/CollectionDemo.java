package Review2;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.stream.Collectors;

public class CollectionDemo {

	public static void main(String[] args) {
		Stack<Integer> s=new Stack<Integer>();
		s.push(1);
		s.push(2);
		s.push(3);
		s.push(4);
		s.push(5);
		List<Integer> list=s.stream().collect(Collectors.toList());
		System.out.println(list);
		
		System.out.println(s.pop() + " " + s.peek() + " "+ s.capacity());
		

	}

}
