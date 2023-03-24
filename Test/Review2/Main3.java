package Review2;

import java.util.HashSet;
import java.util.TreeSet;

public class Main3 {
	public static void main(String args[]) {
		HashSet<Integer> set=new HashSet<Integer>();
		set.add(1);
		set.add(1);
		set.add(2);
		set.add(5);
		set.add(3);
		set.add(0);
		set.add(2787);
		System.out.println(set);
		set.stream().forEach(System.out::println);
		
		//->abstractset class //->navigable set inteface //sorted set
		//set does not store in the insertion order and sorted way //it is unpredictable
	}

}
