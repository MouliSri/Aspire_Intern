package Review2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.Spliterator;




public class Demo5 {

	public static void main(String[] args) {
	
		
	List<Integer> list1=new ArrayList<Integer>(List.of(1,2,3,0,1,2));
	List<Integer> list5=new ArrayList<Integer>(List.of(9,8,7,6,5,4,3));
	List<Integer> list7=new ArrayList<Integer>(List.of(5,4,3));
	
	List<List<Integer>> lists=new ArrayList<List<Integer>>();
	
	lists.add(list1);
	lists.add(list7);
	lists.add(list5);
	
	System.out.println("the collection of list :");

	//to find of the element in all list
	lists.stream().map(e->e.indexOf(3)).forEach(System.out::println);
	lists.stream().filter(e->e.size()<=6).forEach(System.out::println);
	
	System.out.println("the elements");
	//the elements in the all the list
	lists.stream().map(e->e).forEach(System.out::println);
	
	ListIterator it=list1.listIterator(list1.size());
	
	
// fill all elements as 2:
//	Collections.fill(list1, 2);
	
	///it print the elements in reverse order
    while(it.hasPrevious()) {
    	System.out.println("=>"+it.previous());
    }
    
    
    System.out.println("the sub list is " +list1.subList(0, 2));
     System.out.println("contains the elements are not:" +list1.contains(1));    
    
   Spliterator<Integer> split1 = list1.spliterator();
   Spliterator<Integer> split2=split1.trySplit();
   
   System.out.println("the elements in the split1:");
   split1.forEachRemaining(System.out::println);
   System.out.println("the elements in the split2:");
   split2.forEachRemaining(System.out::println);
   
   
	System.out.println("the last index of the element 1 is : " +list1.lastIndexOf(1));
	
	//reverse order
	list1.sort(Comparator.reverseOrder());
	
	System.out.println("The count is "  + Collections.frequency(list1,0));
	//Ascending order
	list1.sort(Comparator.naturalOrder());
	list1.stream().forEach(System.out::println);
	
	HashMap<Integer,String> map=new HashMap( Map.of(1,"Mouli",2,"ravindhar"));
	 
	 
	 
	 map.merge(3, "hanita", String::concat);
	 
	 
	 map.entrySet().forEach(System.out::println);
	 
	HashSet<Integer> set=new HashSet<Integer>();
	set.add(1);
	set.add(2);
	set.add(3);
	set.add(5);
	
	
	Set<Integer> set1=(Set<Integer>) set.clone();
	
	System.out.println(Collections.disjoint(set, set1));
	
	Object[] array2=set.toArray();
	
	for(Object o:array2) {
		System.out.println(o);
	}
	System.out.println(set.containsAll(Set.of(1,2,3,4,5)));
	
	System.out.println(set1);
	set1.stream().forEach(System.out::println);
	
	List<Integer> list=new ArrayList<Integer>();
	list.addAll(set);
	
	
	//unionAll
	set.addAll(list);
	boolean result = set.remove(1);
  
	System.out.println(result);
	
	
	//Predicate 
    set.removeIf(e-> e>6);
	
	System.out.println(set);
	
	///difference
	set.removeAll(Set.of(1,3));
	
	System.out.println(set);
	
	//it print only the common elements
	set.retainAll(Set.of(1,2,3));
	
	
	
	System.out.println(set);
	
	
	
	

	}

}
