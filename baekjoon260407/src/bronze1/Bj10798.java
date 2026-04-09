package bronze1;

import java.util.Scanner;

public class Bj10798 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[] arr = new String[5];
		int maxLength = 0;
		
		for(int i=0;i<5;i++) {
			
			String word = sc.nextLine();
			
			while(word.length()>15) {
				word = sc.nextLine();
			}
			
			arr[i] = word;
			
			if(maxLength<= word.length()) {
				maxLength = word.length();
			}
		}
		sc.close();
		
		String[][] split = new String[5][maxLength];
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length();j++) {
				split[i][j] = arr[i].charAt(j) + "";
			}
		}
		
		//00 10 20 10 11 12
		for(int i=0;i<maxLength;i++) {
			for(int j=0;j<5;j++) {
				if(split[j][i] == null) {
					System.out.print("");
				}
				else {
					System.out.print(split[j][i]);
				}
			}
		}
	}
}
