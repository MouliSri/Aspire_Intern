package oops;

import oops.Interface1.Interface2;

public class implemted implements Interface1,Interface2 {

	@Override
	public void add() {
		System.out.println("im adding");
		
		
	}

	@Override
	public void multiply() {
System.out.println("im multiply");
	}

	
	public  void sub() {
		Interface1.super.Interface1();
		 Interface1.sub();
	}
	@Override
	public void Interface1() {
		
		
	}
	

	 
	

}
