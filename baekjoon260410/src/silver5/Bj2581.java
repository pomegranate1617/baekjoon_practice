package silver5;

import java.util.Scanner;

public class Bj2581 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		sc.close();
		
		int sum = 0;
		int min = -1;
		int cnt = 0;//소수의 갯수
		
		for(int i=m;i<=n;i++) {
			for(int j=2;j<=i;j++) {
				if(i%j==0 && m!=n) {
					break;
				}
				if(j==(i-1)) {
					if(min==-1) {
						min = i;
					}
					else {
						if(min>i) {
							min=i;
						}
					}
					sum+=i;
					cnt++;
				}
			}
		}
		if(cnt == 0) {
			System.out.println(-1);
		}
		else {
			System.out.println(sum);
			System.out.println(min);
		}
	}
}
