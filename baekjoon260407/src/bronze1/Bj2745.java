package bronze1;

import java.util.Scanner;

public class Bj2745 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String n = sc.next().toUpperCase();
		int b = sc.nextInt();//진수
		
		if(b<2 || b>36) {
			b = sc.nextInt();
		}
		sc.close();
		
		
		int decimal = 0;
		//10진수 미만
		if(b<10) {
			for(int i=0;i<n.length();i++) {//1234
				int split = Integer.parseInt(n.substring(i,i+1));
				int exponent1 = 1;//1
				for(int j=n.length()-(i+1);j>0;j--) {
					exponent1 *= b;
				}
				decimal += exponent1*split;
			}
		}
		//10진수 초과 :문자랑 숫자가 섞임
		else if(b>10){
			int upperA = 'A';
			for(int i=0;i<n.length();i++) {
				
				char split = n.charAt(i);
				
				
				if(split<upperA) {
					//숫자
					int exponent1 = 1;
					for(int j=n.length()-(i+1);j>0;j--) {
						exponent1 *= b;
					}
					int changeNum = Integer.parseInt(split + "");
					decimal += (exponent1*changeNum);
					
				}
				else {
					//문자
					int exponent2 = 1;
					for(int j=n.length()-(i+1);j>0;j--) {
						exponent2 *= b;
					}
					int changeNum = split- upperA + 10;
					decimal += exponent2*changeNum;
//					System.out.println(exponent2 + " "+ changeNum);
				}//a=10,b=11,...
			}
			
		}
		else {
			decimal = Integer.parseInt(n);
		}
		System.out.println(decimal);

	}
}
