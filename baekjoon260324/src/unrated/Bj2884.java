package unrated;

import java.util.Scanner;

public class Bj2884 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h= sc.nextInt();
		int m= sc.nextInt();
		sc.close();
		
		if(m-45<0) {
			if(h==0) {
				System.out.println(23+" "+ (60-(int)(Math.abs(m-45))));
			}
			else {
				System.out.println((h-1)+" "+ (60-(int)(Math.abs(m-45))));
			}
	
		}
		else {
			System.out.println(h +" "+ (m-45));
		}
	}
}
