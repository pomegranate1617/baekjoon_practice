package bronze;

import java.util.Scanner;

public class Bj10871 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int x = sc.nextInt();
		sc.close();
		int[] lower = new int[n];
		for(int i=0;i<lower.length;i++) {
			lower[i] = -1;
		}
		
		for(int i=0;i<n;i++) {
			int a = sc.nextInt();
			if(a<x) {
				lower[i] = a;
			}
		}
		
		for(int i=0;i<lower.length;i++) {
			if(lower[i]>=0) {
				System.out.print(lower[i]+" ");
			}
		}
	}
}
