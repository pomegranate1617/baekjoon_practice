package silver5;

import java.util.Scanner;

public class Bj1193 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		sc.close();
		
		int i = 1;//각 줄의 인자의 갯수
		int cnt = 1;//줄 수
		int numberOfLine = 0;//해당 줄에서의 순서
		
		while(true) {
			if((x-i)>0) {//양수일 경우 다시 루프
				numberOfLine = x-i;
				cnt++;
			}else if((x-i)==0){//해당 줄의 마지막 숫자
				numberOfLine = cnt;//3
				break;
			}
			else {//x-i가 음수일 때 => 해당줄의 첫글자~중간글자
				numberOfLine = x;//1,2
				break;
			}
		}
		
		int child = 0;
		int parent = 0;
		
		if(cnt%2 !=0) {//해당 줄이 홀수줄 일 때
			for(int j=cnt;j>numberOfLine;j--) {
				child = cnt;
				child --;
			}
			for(int j =1;j<=cnt;j++) {
				parent = 1;
				parent++;
			}
			System.out.println(child + "/" + parent);
		}else {//해당 줄이 짝수줄 일 때
			for(int j=1;j<=cnt;j++) {
				child = 1;
				child++;
			}             
			for(int j=cnt;j>numberOfLine;j++) {
				parent = cnt;
				parent--;
			}
			System.out.println(child + "/" + parent);
		}
		
		
	}
}
