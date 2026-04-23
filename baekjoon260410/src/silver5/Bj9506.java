package silver5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bj9506 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		
		List<Integer> list = new ArrayList<>();
		
		while(true) {
			int n = sc.nextInt();
			
			if(n == -1) {
				break;
			}
			int i = 1;
			while(i<n) {
				if(n%i==0) {
					list.add(i);
				}
				i++;
			}
			
			int sum = 0;
			for(int j=0;j<list.size();j++) {
				sum += list.get(j);
			}
			
			if(n == sum) {
				StringBuilder sb = new StringBuilder(n + " =");
				for(int j=0;j<list.size();j++) {
					sb.append(" " + list.get(j));
					if(j != list.size()-1) {
						sb.append(" +");
					}
				}
				sb.toString();
				System.out.println(sb);
			}
			else {
				System.out.println(n + " is NOT perfect.");
			}
			list.clear();
		}
		sc.close();
		
	}
}
