package silver5;

import java.util.Scanner;

public class Bj2903 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		while(n<1 || n>15) {
			n = sc.nextInt();
		}
		sc.close();
		
		int cnt = 0;
		int sideLength = 1; 
		
		for(int i=0;i<n;i++) {
			sideLength *=2;
		}
		                           //행          //열
		int[][] field = new int [sideLength+1][sideLength+1];
		int max = sideLength+1;
		int min = 0;
		
		for(int i=0;i<field.length;i++) {
			for(int j=0;j<field.length;j++) {
				cnt++;
			}
		}
		System.out.println(cnt);
		
		
	}

}
