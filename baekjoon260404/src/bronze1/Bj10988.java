package bronze1;

import java.util.Scanner;

public class Bj10988 {
	public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			String word = sc.nextLine();
			
			int length = word.length();
			int check = -1;
			
			
			for(int i=0;i<length/2;i++) {
				
				String front = word.charAt(i) + "";
				String back = word.charAt(length-(i+1)) + "";
				
				if(front.equals(back)) {
					check =1;
				}
				else {
					check = 0;
					break;
				}
			}
			System.out.println(check);
	
		}
}
