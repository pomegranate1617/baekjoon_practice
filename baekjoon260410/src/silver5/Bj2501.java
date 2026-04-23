package silver5;

import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class Bj2501 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		sc.close();
		
		TreeSet<Integer> tr = new TreeSet<>();
		int i =1;
		while(i<=n) {
			if(n%i == 0) {
				tr.add(i);
			}
			i++;
		}
		if(tr.size()>0 && tr.size()>=k) {
			Iterator<Integer> iter = tr.iterator();
			int cnt=1;
			while(iter.hasNext()) {
				int result = iter.next();
				if(cnt == k) {
					System.out.println(result);
					break;
				}else {
					cnt++;
				}
			}
		}else {
			System.out.println(0);
		}
		
	}
}
