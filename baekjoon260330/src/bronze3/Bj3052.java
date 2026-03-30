package bronze3;

import java.util.Scanner;

public class Bj3052 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] remainder = new int[10];
		
		for(int i=0;i<10;i++) {
			int number = sc.nextInt();
			remainder[i] = number % 42;
		}
		sc.close();
		
		for(int i=0;i<remainder.length;i++) {
			for(int j=0;j<remainder.length;j++) {
				if((i != j) && (i<j) && (remainder[i] == remainder[j])) {
					remainder[j] = -1;
				}
			}
		}
		
		int cnt = 0;
		for(int i=0;i<remainder.length;i++) {
			if(remainder[i] != -1) {
				cnt++;
			}
		}
		System.out.println(cnt);
		
	}
}
