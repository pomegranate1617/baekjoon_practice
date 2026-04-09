package bronze2;

import java.util.Scanner;

public class Bj2908 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String a = sc.nextLine();
		String b = sc.nextLine();
		sc.close();
		
		StringBuilder transA = new StringBuilder();
		for(int i=a.length()-1;i>=0;i--) {
			String split1 = a.charAt(i) + "";
			transA.append(split1);	  
		}
		int resultA = Integer.parseInt(transA.toString());
		
		
		StringBuilder transB = new StringBuilder();
		for(int j=b.length()-1;j>=0;j--) {
			String split2 = b.charAt(j) + "";
			transB.append(split2);
				  
		}
		int resultB = Integer.parseInt(transB.toString());
		
		
		if(resultA>resultB) {
			System.out.println(resultA);
		}
		else {
			System.out.println(resultB);
		}
	}
}
