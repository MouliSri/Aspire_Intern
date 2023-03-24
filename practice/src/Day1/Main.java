package Day1;

public class Main {
    
	
	//static methods can be overloaded can be be override be the class hides the static methods
	public static void main(String[] args) {
	main("mouli");
	Sub sub=new Sub(0);
	sub.operations();  //math operation
	sub.run();
	sub.walk();
	sub.swim();
	
	
	}
	
	
	
	//main method can be overloaded it can be override
	public static void main(String name) {
		System.out.println("welcome :" +name);
	}
	
	

	public void run() {
		System.out.println("im running in the base class");
	}
	
	
	protected void walk() {
		System.out.println("im in super class ");
	}
	
	 Main() {
		System.out.println("Base class");
	}
	 
	 
	 //final methods can be overloaded and it cannot be override
	 final void swim() {
		 System.out.println("im swimming in the base class");
	 }
	 final void swim(String place) {
		 System.out.println("im swimming in the " +place);
	 }
	
	
}

class Sub extends Main {
	private int total;
	
	
	///	public methods can be override
	@Override
    public void run() {
		System.out.println("im running in the derived class");
	}
	
	
	// protected methods can be overloaded and override
	protected void walk() {
		System.out.println("im in sub class");
		
	}
	
	//constructor can be overloaded cannot be override
	Sub(String name){
		System.out.println("Im in sub class " + name);
	}
	Sub(){
		System.out.println("Im in sub class :");
	}
	Sub(int total){
		this.total=total;
	}
	
	public void operations() {
		
		//if we need to access the ->private methods can be only accessed by calling the public methods in sub class 
		System.out.println(addition(3,4));
		System.out.println(addition(1,2,3,4,5,6,7));
	}
	
	
   //private method overloading and it cannot be override
	private int addition(int value1,int value2) {
		return value1 + value2;
	}
	
	
	// VAR args-> number of arguments into an array
	//VAR args in the parameter at last and it only one time we can collect the elements into array
	private int addition(int... value) {
		
		for(int i=0;i<value.length;i++) {
			total+=value[i];
		}
		return total;
	}
	
	
}

//default methods cannot be override (it is not mandatory to override because the body content already provide in the interface )
//we use the method in the class by removing the access modifier default to public inside the class method




//Association
//->Association is a more general term to define a relationship among objects