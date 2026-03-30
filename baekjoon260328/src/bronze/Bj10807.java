package bronze;

import java.util.Scanner;

public class Bj10807 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			int num = sc.nextInt();
			arr[i] = num;
		}
		int v = sc.nextInt();
		sc.close();
		int correct = 0;
		for(int i=0;i<arr.length;i++) {
			if(v == arr[i]) {
				correct++;
			}
		}
		System.out.println(correct);
	}
}
