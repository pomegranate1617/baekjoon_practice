package bronze;

import java.util.Scanner;

public class Bj10818 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] arr = new int[n];//자바에서 배열의 길이는 int만 가능
		for(int i=0;i<n;i++) {
			int num = sc.nextInt();
			sc.close();
			arr[i] = num;
		}
		int min = arr[0];
		int max = arr[0];
		for(int i=0;i<arr.length;i++) {
			if(min>arr[i]) {
				min = arr[i];
			}
			if(max<arr[i]) {
				max = arr[i];
			}
		}
		System.out.println(min + " " +max);
		
	}
}
