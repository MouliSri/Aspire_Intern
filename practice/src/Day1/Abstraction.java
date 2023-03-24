package Day1;

abstract class Abstraction {
   abstract void excercise();
   abstract  void Gym();
     public void go() {
    	 System.out.println("im going :)");
     }
    static void detail(){
	   System.out.println("im in Abstraction class");
   }
    static void detail(int val) {
    	System.out.println("im in Abstraction" +val);
    }
}

class show extends Abstraction implements Interface{

	@Override
	void excercise() {
		System.out.println("home workouts");
		
	}

	@Override
	void Gym() {
	System.out.println("im going to gym");
		
	}
	
	
	static void detail() {
		System.out.println("static method can be override");
	}

	@Override
	public void run() {
		System.out.println("im running in the ground");
		
	}
	
	
	

	 
	 
	
}
