package bronze1;

import java.util.Scanner;

public class Bj11005 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int b = sc.nextInt();
		while(b<2 || b>36) {
			b= sc.nextInt();
		}
		sc.close();
		
		String result= "";
		while(n != 0 ) {
			int mod =  n%b;
			if(mod>=10 && mod<=35) {
				String ch = (char)(mod + 55) + "";
				result += ch;
			}
			else {
				result += (mod + "");
			}
			n = n/b;
		}
		
		String reverse = "";
		for(int i= result.length()-1;i>=0;i--) {
			reverse += result.substring(i,i+1);
		}
		System.out.println(reverse.toUpperCase());
	}
}
