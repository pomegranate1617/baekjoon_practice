package silver5;

import java.util.Scanner;

public class Bj1193Re2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		sc.close();
		int lineCnt = 0;//줄 번호
		int i = 1;//각 줄의 원소의 갯수
		int location = -1;//해당줄 내부에서의 순서
		
		while(true) {
			lineCnt++;
			if(x-i<0) {
				break;
			}
			else if(x-i == 0){
				location = lineCnt;
				break;
			}
			else {
					location = x - i;
					x = location;
					i++;
				}
		}
		
		int child = 0;
		int parent = 0;
		
		if(lineCnt%2 != 0) {//홀수 줄
			child = lineCnt;
			parent = location;
			for(int j=0;j<location-1;j++) {
				child--;
			}
			System.out.println(child + "/" +parent);
		}
		else {//짝수 줄
			child = location;
			parent = lineCnt;
			for(int j=0;j<location-1;j++) {
				parent --;
			}
			System.out.println(child + "/" + parent);
		}
		
		
	}
}
