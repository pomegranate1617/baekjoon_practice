package bronze3;

import java.util.Scanner;

public class Bj5597 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] student = new int[30];
		
		for(int i=0;i<28;i++) {
			int number = sc.nextInt();
			student[number-1] = number; 
		}
		
		sc.close();
		
		for(int j=0;j<student.length;j++) {
			if(student[j] == 0) {
				System.out.println(j+1);
			}
		}
	}
}
