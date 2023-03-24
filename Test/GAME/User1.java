package GAME;
import java.util.Scanner;

public class User1 {
   private XOGAME game;

   User1(XOGAME game) {
		this.game=game;
	}

public void run() {
	game.showOutput();
	Scanner scan=new Scanner(System.in);
	System.out.println("user1 : Enter the cordinates you need-> x and y");
	int x=scan.nextInt();
	int y=scan.nextInt();
	game.setXO(x,y,'X');
	System.out.println(game.check('X'));
	
}




}
