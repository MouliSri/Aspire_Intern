package oops;

abstract class Abstract {
	abstract void run();
	
	  protected void sleep() {
		System.out.println("im sleeping");
	}
	  
	  
	  abstract void walk();
	  

}


class a1 extends Abstract{

	protected void sleep() {
		System.out.println("im sleeping in extended class");
	}
	
	@Override
	void run() {
	System.out.println("im in a1 class run method");
		
	}

	@Override
	void walk() {
		System.out.println("im in a1 class walk method");
		
	}
	
}