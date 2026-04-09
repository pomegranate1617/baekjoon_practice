package silver5;

import java.util.Scanner;

public class Bj2720 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
	
		for(int i=0;i<t;i++) {
			
			int c = sc.nextInt();
			if(c>500) {
				c = sc.nextInt();
			}
			
			int Quarter = 0;//25
			int Dime = 0;//10
			int Nickel = 0;//5
			int Penny = 0;//1
			
			while(c!=0) {
				if(c>=25) {
					c -=25;
					Quarter++;
				}
				else if(c>=10) {
					c -= 10;
					Dime++;
				}
				else if(c>=5) {
					c -= 5;
					Nickel++;
				}
				else if(c>=1) {
					c -= 1;
					Penny++;
				}
			}
			System.out.println(Quarter + " " + Dime + " " + Nickel + " " + Penny);
		}
		
	}
}
