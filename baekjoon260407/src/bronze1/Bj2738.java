package bronze1;

import java.util.Scanner;

public class Bj2738 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int[][] a= new int[n][m];
		int[][] b = new int[n][m];
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				int elementA = sc.nextInt();
				a[i][j] = elementA;
			}
		}
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				int elementB = sc.nextInt();
				b[i][j] = elementB;
			}
		}
		sc.close();
		
		int sum = 0;
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				sum = a[i][j] + b[i][j];
				System.out.print(sum + " ");
			}
			System.out.println();
		}
	}
}
