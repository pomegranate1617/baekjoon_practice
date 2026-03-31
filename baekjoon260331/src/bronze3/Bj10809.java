package bronze3;

import java.util.Scanner;

public class Bj10809 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String word = sc.nextLine();
		sc.close();
		
		for(int j=97;j<=122;j++) {
			int cnt = 0;
			for(int i=0;i<word.length();i++) {
				char split = word.charAt(i);
				if(cnt == 0 && split == j) {
					cnt++;
					System.out.print(i + " ");
				}
			}
			if(cnt == 0) {
				System.out.print(-1 +" ");
			}
		}
	}
}
