package bronze2;

import java.util.Scanner;

public class Bj3003 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String piece = sc.nextLine();
		int[] pieceArr = {1,1,2,2,2,8};
		
		String[] take = piece.split(" ");
		
		for(int i=0;i<pieceArr.length;i++) {
			pieceArr[i] -= Integer.parseInt(take[i]);
		}
		
		for(int i=0;i<pieceArr.length;i++) {
			System.out.print(pieceArr[i] + " ");
		}
	}
}
