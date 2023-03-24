package Review2;

import java.util.HashMap;
import java.util.Map.Entry;

import javax.sql.rowset.serial.SQLOutputImpl;

public class Main2 {

	public static void main(String[] args) {
		HashMap<Integer,String> map = new HashMap<Integer,String>();
	
		map.put(3,"emmaunauel");
		map.put(2, "hanita");
		map.put(1, "mouli");
		map.put(1, "Rave");
		
		System.out.println(map.get(2));
		
		for(Entry<Integer, String> e:map.entrySet())
	    System.out.println(e.getValue() + " " + e.getKey());	

	}

	

}
