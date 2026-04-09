package bronze1;

import java.util.Scanner;

public class Bj2563 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int paperNum = sc.nextInt();
		
		int[][] bigPaper = new int[100][100];
		
		for(int i=0;i<paperNum;i++) {
			int horizontal = sc.nextInt();//색종이 시작 좌표(horizontal,vertical)
			int vertical = sc.nextInt();
			//좌표 배열에 1이 들어갈 때,
			//가로.세로 모두 마지막 좌표의 숫자보다-1적게 들어가도록 
			for(int j=horizontal;j<horizontal+10;j++) {
				for(int k=vertical;k<vertical+10;k++) {
					if(bigPaper[j][k] !=1) {
						bigPaper[j][k] = 1;
					}
				}
			}
		}
		sc.close();
		int cnt = 0;
		for(int i=0;i<100;i++) {
			for(int j=0;j<100;j++) {
				if(bigPaper[i][j] == 1) {
					cnt++;
				}
			}
		}
		
		System.out.println(cnt);
	}
}
