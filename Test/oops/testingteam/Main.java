package oops.testingteam;


class b extends Main{
	static int value=10;
	
 b( int value) {
		this.value=value;
		System.out.println(value);
	}
 
	
}

class c extends b{
	 c(int val) {
		super(val);
	}
}

public class Main {
	
	

	
	public static void main(String args[]) {
	
		c obj=new c(60);
	}
}
