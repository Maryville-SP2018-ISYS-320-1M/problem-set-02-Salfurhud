import java.util.Scanner;

/*
	ISYS 320
	Name(s):AlfurhudSolomon
	Date: Apr15,2018
*/

public class P4_L337Sp34k3r {

	public static void main(String[] args) {
		
		Scanner console = new Scanner(System.in);
		
		System.out.print("Please enter your 3 words to make L337: ");
		String word1 = console.next();
		String word2 = console.next();
		String word3 = console.next();
		
		System.out.println(word1 + " -> " + makeL337(word1) );
		System.out.println(word2 + " -> " + makeL337(word2) );
		System.out.println(word3 + " -> " + makeL337(word3) );
		
		console.close();
	}
	
	public static String makeL337(String word) {
		
		word = word.replaceAll("a", "7").replaceAll("e", "3").replaceAll("t", "7").replaceAll("o", "()");
		return word.toUpperCase();
	}

}
