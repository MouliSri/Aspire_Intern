package GAME;

public class Main {

	public static void main(String[] args) {
		XOGAME game=new XOGAME();
		User1 user1=new User1(game);
		User2 user2=new User2(game);
		
		
		
		user1.run();
		user2.run();

	}

}
