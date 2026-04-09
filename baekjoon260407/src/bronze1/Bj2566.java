package bronze1;

import java.util.Scanner;

public class Bj2566 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] matrix = new int[9][9]; 
		
		int row = 0;
		int column = 0;
		int max = 0;
		for(int i=0;i<9;i++) {
			for(int j=0;j<9;j++) {
				
				if(i==0 && j==0) {
					max = matrix[i][j];
				}
				
				matrix[i][j] = sc.nextInt();
				if(max<= matrix[i][j]) {
					max = matrix[i][j];
					row = i+1;
					column = j+1;
				}
			}
		}
		
		System.out.println(max);
		System.out.println(row + " " +column );
		
		
	}
}
