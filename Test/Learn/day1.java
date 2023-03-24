package Learn;

import java.io.IOException;
import java.util.Arrays;
import java.util.Optional;
import java.util.Scanner;
import java.util.Stack;
import java.util.StringTokenizer;
import java.util.stream.IntStream;
import java.math.*;

public class day1 {
	public static void main(String args[]) throws IOException {
	    double z = 28;    
        double y = 4.7;    
          
        // return the maximum of two numbers  
        System.out.println("Maximum number of x and y is: " +Math.max(z,y)); 
        System.out.println(Math.ceil(y));
        System.out.println(Math.floor(y));
		int[] array=new int[5];
		int a=5;
		String result="";
		try (Scanner scan = new Scanner(System.in)) {
			for(int i=0;i<array.length;i++) {
				array[i]=scan.nextInt();
			}
		}
		
		try {
		 
		int value=Arrays.stream(array).parallel().sum();
		System.out.println(value);
		IntStream array1=Arrays.stream(array).filter(x->x>2);
		int[] array2=array1.toArray();
		Arrays.stream(array2).forEach(System.out::println);
		
		
		
		StringTokenizer st=new StringTokenizer("im , mouli here");
		Stack<String> stack=new Stack<String>();
	   System.out.println(st.countTokens());
	   while(st.hasMoreTokens()) {
		   String word=(String) st.nextElement();
		   System.out.println(word);
		   stack.add(word);
	   }
	   Optional<String> answer=stack.stream().reduce((word1, word2)-> word1+=word2);
	   System.out.println(answer.get());
	   while(stack.size()!=0) {
		    result+=stack.pop(); 
	   }
	   System.out.println(result);
		}
	   
	   catch(Exception e) {
			System.err.println(e.getMessage());
		}
	   finally {
		   System.out.println("bye bye");
	   }
	 
		
	}

}
