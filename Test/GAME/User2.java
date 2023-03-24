package GAME;

import java.util.Scanner;

public class User2 {
     private XOGAME game;
     
	 User2(XOGAME game) {
		this.game=game;
	}
	public void run() {
		Scanner scan=new Scanner(System.in);
		System.out.println("user2 : Enter the cordinates you need-> x and y");
		int x=scan.nextInt();
		int y=scan.nextInt();
		game.setXO(x,y,'O');
		game.showOutput();
		System.out.println(game.check('O'));
	}

}
