package bronze;

import java.util.Scanner;

public class Bj2562 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[9];
		
		for(int i=0;i<9;i++) {
			int num = sc.nextInt();
			arr[i] = num;
		}
		sc.close();
		int max = arr[0];
		int maxLocation = 1;
		for(int i=0;i<arr.length;i++) {
			if(max<arr[i]) {
				max = arr[i];
				maxLocation = i+1;
			}
		}
		
		System.out.println(max);
		System.out.println(maxLocation);
	}
}
