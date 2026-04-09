package bronze2;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Bj1152 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String sentence = sc.nextLine();
		sc.close();
		StringTokenizer st = new StringTokenizer(sentence);
		System.out.println(st.countTokens());
	}
}
