package silver5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.Set;
import java.util.TreeMap;

public class Bj11653Re3 {
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
			//n이 1이 아닐 경우만 출력
			if(n != 1) {
				TreeMap<Integer, Integer> primeMap = new TreeMap<>();
				//2부터 n까지의 수 중에서 소수만 걸러내기
				for(int i=2;i<=n;i++) {
					boolean primeCheck = true;
					for(int j=2;j<i;j++) {
						if(i%j == 0) {//소수가 아닌경우
							primeCheck = false;
							break;
						}
					}
					if(primeCheck == true) {
						//소수일 경우
						primeMap.put(i, 0);
					}
				}

				Set<Integer> keySet = primeMap.keySet();
				boolean putCheck = false;
				label:while(true) {
					for(int key : keySet) {
						if(n/key==1 && n%key==0) {//더이상 나눌 것이 없을 때
							primeMap.replace(key,primeMap.get(key)+1);
							break label;
						}
						if(n%key == 0) {
							n /= key;
							primeMap.replace(key,primeMap.get(key)+1);
							putCheck = true;
							break;
						}
					}
				}
				//n이 소수일 때 
				if(putCheck == false) {
					bw.write(n + "");
				}
				else {
					for(int key : keySet) {
						if(primeMap.get(key) != 0) {
							int circuit = primeMap.get(key);
							for(int k=0;k<circuit;k++) {
								bw.write(key + "\n");
							}
						}
					}
				}
				
//				
			}
			bw.flush();
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}
	}
}
