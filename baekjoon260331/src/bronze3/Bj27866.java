package bronze3;

import java.util.Scanner;

public class Bj27866 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int i = sc.nextInt();
		sc.close();
		String split = s.substring(i-1,i); 
		System.out.println(split);
	}
}