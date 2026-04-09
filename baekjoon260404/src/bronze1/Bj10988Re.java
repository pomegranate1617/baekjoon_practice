package bronze1;

import java.util.Scanner;

public class Bj10988Re {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String word = sc.nextLine().toLowerCase();
		sc.close();
		int length = word.length();
		int check = -1;
		
		String front = "";
		String back = "";
		for(int i=0;i<length/2;i++) {
			
			front += word.charAt(i) + "";
			back += word.charAt(length-(i+1)) + "";
			
		}
		if(front.equals(back)) {
			check =1;
		}
		else {
			check = 0;
		}
		System.out.println(check);

	}
}
