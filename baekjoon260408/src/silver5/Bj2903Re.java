package silver5;

import java.util.Scanner;

public class Bj2903Re {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		while(n<1 || n>15) {
			n = sc.nextInt();
		}
		sc.close();
		
		int sideLength = 1; 
		
		for(int i=0;i<n;i++) {
			sideLength *=2;
		}
		                           //행          //열
		System.out.println((sideLength+1)*(sideLength+1));
		
	}
}
