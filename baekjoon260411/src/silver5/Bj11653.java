package silver5;

import java.util.Map;
import java.util.NavigableSet;
import java.util.Scanner;
import java.util.TreeMap;

public class Bj11653 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		while(n<1 && n>10000000) {
			n = sc.nextInt();
		}
		sc.close();
		
		if(n==1) {
			System.out.println();
			return;
		}
		
		TreeMap<Integer,String> map = new TreeMap<>();
		int cnt = 0;
		
		while(n>1) {
			int num = 2;
			while((n%num)!=0) {
				num++;
			}
			n /= num;
			if(!map.containsKey(num)) {
				map.put(num, "1");
			}
			else {
				int chageValue = Integer.parseInt(map.get(num))+1;
				map.put(num, String.valueOf(chageValue));
			}
			
		}
		
		NavigableSet<Integer> mapIter = map.navigableKeySet();
		for(NavigableSet<Integer> set : mapIter) {
			
		}
				
		

		
		
	}
}
