package easy;

//292. Nim Game
public class NimGame {
	   public boolean canWinNim(int n) {
		   //找规律，如果是4的倍数，自己总是赢不了
		   return n%4!=0;
	        
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NimGame nimGame = new NimGame();
		System.out.println(nimGame.canWinNim(4));

	}

}
