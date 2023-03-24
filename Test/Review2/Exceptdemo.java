package Review2;

public class Exceptdemo {

	public static void main(String[] args) {
		try {
			try {
				int i=0;
				int j=1;
				System.out.println(i/j);
			}
			catch(Exception e) {
				
				System.out.println("hello ");
			}
		}
		catch(Exception e) {
			e.getMessage();
			System.err.println(e);
		}

	}

}
