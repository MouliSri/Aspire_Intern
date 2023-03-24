package Day1;

public interface Interface {
	
	 void run();
	 static void wal() {
		 System.out.println("walking towards north");
	 }
	 default void sle() {
		 System.out.println("im sleeping in home");
	 }

}
