package bronze2;

import java.util.Scanner;

public class Bj2675Re4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t =sc.nextInt();
		sc.nextLine();
		
		for(int i=0;i<t;i++) {
			
			String rNWord = sc.nextLine();
			String[] arr = rNWord.split(" ");
			int r = Integer.parseInt(arr[0]);
			
			for(int j=0;j<arr[1].length();j++) {
				String split = arr[1].charAt(j)+"";
				for(int k =0;k<r;k++) {
					System.out.print(split);
				}
			}

			System.out.println();
		}
		sc.close();
	}
}
