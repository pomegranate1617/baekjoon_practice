package silver5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Bj11653Re4 {
	public static void main(String[] args) {
		//조건
		//n이 1인경우 아무것도 출력x
		//소인수분해 결과를 오름차순으로 한줄에 하나씩 출력
		//n이 소수인 경우 자기 자신만 출력
		//n이 소수가 아닌경우 자기자신과 1을 제외한 소인수만 출력
		
		//문제쪼개기
		//n을 소수와 소수가 아닌 자연수로 케이스 나누기
		//소수인 경우 자기 자신만 출력
		//소수가 아닌 경우 1과 자기자신을 제외한 소인수만 출력
		
		//int n받기
		//
		InputStream is = System.in;
		InputStreamReader ir = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(ir);
		
		OutputStream os = System.out;
		OutputStreamWriter ow = new OutputStreamWriter(os);
		BufferedWriter bw = new BufferedWriter(ow);
		
		try(br;bw){
			int n = Integer.parseInt(br.readLine());
			
			
			if(n != 1) {
				//n이 1이 아닐경우
				boolean primeCheck = false;
				for(int i=2;i<n;i++) {
					//1과 자기자신이 아닌 다른 수로 나누어지지 않으면 소수
					if(n%i == 0) {
						primeCheck = true;
						break;
					}
				}
				
				Map<Integer,Integer> primeMap = new HashMap<>();
				if(primeCheck) {
					//n이 소수일 경우
					bw.write(n + "");
				}else {
					//n이 소수가 아닐 경우
					//2부터 n-1까지 수 중에서 소수인 수를 찾기
					for(int i=2;i<n;i++) {
						boolean primeCheck2 = true;
						for(int j=2;j<i;j++) {
							if(i%j == 0) {
								primeCheck2 = false;
								break;
							}
						}
						if(primeCheck2) {
							primeMap.put(i, 0);
						}
					}
					Set<Integer> mapSet = primeMap.keySet();
					label:while(true) {
						for(int prime : mapSet) {
							if(n%prime == 0) {
								if(n==prime) {break label;}
								n /= prime;
								primeMap.replace(prime,primeMap.get(prime));
							}
						}
					}
					
					Set<Map.Entry<Integer, Integer>> entrySet = primeMap.entrySet();
					
					
					
				}
			}
			

		}catch(IOException e) {
			System.out.println(e.getMessage());
		}
	}
}
