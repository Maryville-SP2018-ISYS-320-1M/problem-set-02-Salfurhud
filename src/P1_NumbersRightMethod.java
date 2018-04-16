/*
	ISYS 320
	Name(s):AlfurhudSolomon
	Date: Apr15,2018
*/

public class P1_NumbersRightMethod {

	public static void main(String[] args) {
		drawNumberRight(7);
	}
	
	public static void drawNumberRight(int height) {
		
		for(int x = 0; x < height; x ++) {
			
			for (int i = 0; i < height - (x + 1); i++) {
				System.out.print(" ");
			}
			
			for( int i = 0; i < x + 1; i++) {
				System.out.print(x + 1);
			}
			
			System.out.println();
			
		}
		
	}

}
