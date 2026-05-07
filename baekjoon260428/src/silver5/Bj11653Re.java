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

public class Bj11653Re {
	public static void main(String[] args) {
		//조건
		//소인수분해한 결과를 오름차순으로 출력
		//n이1이면 아무것도 출력x
		
		//문제쪼개기
		//n을 소수로 계속 나누어 더이상 나누어지지 않을 때까지 나누고
		//나눈 소수들을 그 개수만큼 오름차순으로 출력 정렬
		//만약 n이 소수라면 1을 제외한 n만 출력
		//n이 소수가 아니라면 1과 자기자신을 제외하고 인수분해된 수들만 출력
		InputStream is = System.in;
		InputStreamReader ir = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(ir);
		
		OutputStream os = System.out;
		OutputStreamWriter ow = new OutputStreamWriter(os);
		BufferedWriter bw = new BufferedWriter(ow);
		
		try(br;bw){
			int n = Integer.parseInt(br.readLine());
			Map<Integer,Integer> primeMap = new HashMap<>();

			if(n != 1) {
				//n미만의 소수 구하기
				for(int i=2;i<=n;i++) {
					boolean primeCheck = true;
					for(int j=2;j<i;j++) {
						if(i%j == 0) {
							primeCheck = false;
						}
					}
					if(primeCheck == true) {
						primeMap.put(i,0);
					}
				}
				
				Set<Integer> keySet = primeMap.keySet();
				
				label:while(true) {
					for(int key : keySet) {
						if(n/key == 1) {
							break label;
						}
						if((n%key == 0)) {
							n /= key;
							primeMap.replace(key,primeMap.get(key)+1);
						}
					}
				}
				if(primeMap.size()==0) {//n이 소수인경우
					bw.write(n + "");
				}
				else {
					for(int key : keySet) {
						int value = primeMap.get(key);
						for(int i=0;i<value;i++) {
							bw.write(key + "\n");
						}
					}
				}	
			}
			bw.flush();
		}catch(IOException e) {
			System.out.println(e.getStackTrace());
		}
	}
}
