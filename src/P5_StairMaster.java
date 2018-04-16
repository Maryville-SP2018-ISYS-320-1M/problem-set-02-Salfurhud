import java.util.Scanner;

/*
	ISYS 320
	Name(s):AlfurhudSolomon
	Date: Apr15,2018
*/

public class P5_StairMaster {

	public static void main(String[] args) {
		
	Scanner console = new Scanner(System.in);
		
		System.out.print("How many stairs in your staircase? ");
		int stairCount = console.nextInt();
		
		System.out.print("How wide should each stair be?");
		int width = console.nextInt();
		
		drawStairCase(stairCount, width);
		
		console.close();
		
	}
	
	public static void drawStairCase(int stairs, int width) {
		
		System.out.println("Here is your staircase");
	
		for(int x = 0; x < stairs; x++) {
			
			for(int l = 0; l < 2; l++ ) {
				System.out.print("**");
				 
				for(int i = 0; i < x; i++) {
					 
					for(int y = 0; y < width; y++) {
						System.out.print(" ");
					}
					 
				}
				 				
					for(int j = 0; j < width; j++) {
						System.out.print("*");
						 
					}
									 
				System.out.println();
			 
			}
			
		}
		
	}

}
