package Review2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.Map.Entry;
import java.util.stream.Collectors;
public class Collection {

	public static void main(String[] args) throws OwnException  {
	
		ArrayList<Integer> list=new ArrayList<Integer>();
		  list.add(1);
		   list.add(8);
		   list.add(2);
		   list.add(3);
		   list.set(1, 5);
		   ArrayList<Integer> list2=new ArrayList<Integer>();
		   list2.add(1);
		   list2.add(8);
		   list2.add(2);
		   list2.add(3);
		  
		   //union
		   list.addAll(list2);
		   
		 
		   
		   //intersection
		  
		   list.sort(Integer::compareTo);
		  // 1 5 2 3  -> 1 2 3 5
		   System.out.println("the third element in the list after sorting "+list.get(3));
		   System.out.println("the hascode is " +list.hashCode());
		   
		 //  iteration of collection 
		   Iterator itr=list.iterator();
		   while(itr.hasNext()) {
			   System.out.println(itr.next());
		   }
		   System.out.println("---");
		 
		   
		  // conversion of list to set using collect terminal
		Set<Integer> list3=list.stream().filter(x-> x>1).collect(Collectors.toSet());
      System.out.println(list3);
      
      System.out.println(list.contains(6));
      
      
      
      HashMap<Integer,String> map = new HashMap<Integer,String>();
  	
		map.put(3,"emmaunauel");
		map.put(2, "hanita");
		map.put(1, "mouli");
		map.put(1, "Rave");
		
		System.out.println(map.get(2));
		
		for(Entry<Integer, String> e:map.entrySet())
	    System.out.println(e.getValue() + " " + e.getKey());
		
		try {
			Scanner scan=new Scanner(System.in);
			int a=scan.nextInt();  //input mismatch unchecked exception
	
			Class.forName("mouli"); //checked Exception
		
		}
		catch(Exception e) {
		    e.printStackTrace();
		    e.getMessage();
		 
			throw new OwnException("due to some errors"); //custom Exception
			
		}
		finally {
		System.out.println("hello");
		}
		
		
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
		
		//->abstract set class //->navigable set interface //sorted set
		//set does not store in the insertion order and sorted way //it is unpredictable
		
	}

}

//class OwnException extends Exception {
//
//	public OwnException(String string) {
//	super(string);
//	}
//
//}

