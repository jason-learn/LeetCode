package easy;

//292. Nim Game
public class NimGame {
	   public boolean canWinNim(int n) {
		   //�ҹ��ɣ������4�ı������Լ�����Ӯ����
		   return n%4!=0;
	        
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NimGame nimGame = new NimGame();
		System.out.println(nimGame.canWinNim(4));

	}

}
