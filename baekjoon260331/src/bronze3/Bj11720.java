package bronze3;

import java.util.Scanner;

public class Bj11720 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = 0;
		for(int i=0;i<n;i++) {
			int number = sc.nextInt();
			sum += number;
		}
		sc.close();
		System.out.println(sum);
	}
}
