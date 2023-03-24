package GAME;

public class XOGAME {
	
	char[][] array= {{'s','s','s'},
			{'s','s','s'},
			{'s','s','s'}
			};
	
	void showOutput(){
		System.out.println("The XO Box:");
		for(int i=0;i<array.length;i++) {
			for(int j=0;j<array[0].length;j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	void setXO(int x,int y,char letter) {
		System.out.println("The coordinates are : " + x + " " +y);
		array[x][y]=letter;
	}
	
	boolean check(char letter) {
		int count;
		
		for(int i=0;i<array.length;i++) {
			count=0;
			for(int j=0;j<array.length;j++) {
			if(array[i][j]==letter) {   ///xxx
				count++;
			}
			
			if(count==3) {
				return true;
			}
			}
		}
		return false;
	}

}
