package bronze;

import java.util.Scanner;

public class Bj10810 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] basketSet = new int[n+1];
		
		for(int circuit=0;circuit<m;circuit++) {
			int i = sc.nextInt();
			int j = sc.nextInt();
			int k = sc.nextInt();
			for(int start = i;start<=j;start++) {
				basketSet[start] = k;
			}
		}
		sc.close();
		
		for(int a=1;a<basketSet.length;a++) {
			System.out.print(basketSet[a] + " ");
		}
	}
}
