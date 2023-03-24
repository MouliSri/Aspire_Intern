package Review2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;



public class Main {

	public static void main(String[] args) {
	     ArrayList<Integer> list=new ArrayList<Integer>();
		  list.add(1);
		   list.add(8);
		   list.add(2);
		   list.add(3);
		   list.set(1, 5);
		   
		   // 1 5 2 3  -> 1 2 3 5
		   list.sort(Integer::compareTo);
		   System.out.println(list.get(3).hashCode());
		   Iterator itr=list.iterator();
		   while(itr.hasNext()) {
			   System.out.println(itr.next());
		   }
		Set<Integer> list2=list.stream().filter(x-> x>1).collect(Collectors.toSet());
        System.out.println(list2);
          if(list.contains(6)) {
        	  System.out.println("true");
          }
      
	}

}
