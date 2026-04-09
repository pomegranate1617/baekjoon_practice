package bronze1;

import java.util.Scanner;

public class Bj2444Re {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int middleStar = 1+2*(n-1);
		int stdLocation = (int)(Math.round(middleStar/(double)2-1));
		
		for(int i=0;i<n;i++) {
			for(int j=stdLocation-i;j>0;j--) {
				System.out.print(" ");
			}
			for(int j=0;j<1+2*i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=0;i<n-1;i++) {
			for(int j=0;j<i+1;j++) {
				System.out.print(" ");
			}
			for(int j=middleStar-2*(i+1);j>0;j--) {
				System.out.print("*");
			}
			System.out.println();
	
		}
		
		
		
	}
}
