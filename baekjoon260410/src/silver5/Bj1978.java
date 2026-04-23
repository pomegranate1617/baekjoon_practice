package silver5;

import java.util.Scanner;

public class Bj1978 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int n = sc.nextInt();
		if(n>100) {
			n= sc.nextInt();
		}
		int i = 0;
		int cnt = n;
		while(i<n) {
			int number = sc.nextInt();
			if(number == 1) {
				cnt--;
			}
			else {
				int k =2;
				while(k<=number-1) {
					
					if(number%k == 0) {
						cnt--;
						break;
					}
					k++;
				}
			}
			i++;
		}
		sc.close();
		System.out.println(cnt);
	}
}
