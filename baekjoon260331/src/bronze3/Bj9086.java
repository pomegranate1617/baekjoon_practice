package bronze3;

import java.util.Scanner;

public class Bj9086 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		sc.nextLine();
		
		for(int i=0;i<t;i++) {
			String word = sc.nextLine();
			int length = word.length();
			String first = word.substring(0,1);
			String last = word.substring(length-1);
			System.out.println(first + last);
		}
		sc.close();
		
	}
}
