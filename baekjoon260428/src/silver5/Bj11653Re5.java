package silver5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.HashSet;
import java.util.Set;

public class Bj11653Re5 {
	public static void main(String[] args) {
		InputStream is = System.in;
		InputStreamReader ir = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(ir);
		
		OutputStream os = System.out;
		OutputStreamWriter ow = new OutputStreamWriter(os);
		BufferedWriter bw = new BufferedWriter(ow);
		
		try(br;bw){
			int n = Integer.parseInt(br.readLine());
			if(n != 1) {
				Set<Integer> primeSet = new HashSet<>();
				for(int i=2;i<=n;i++) {
					boolean primeCheck = true;
					for(int j=2;j<i;j++) {
						if(i%j == 0) {
							primeCheck = false;
							break;
						}
					}
					if(primeCheck) {
						primeSet.add(i);
					}
				}
				
				int[] primeFactor = new int[n/2];
				int cnt = 0;
				label:while(true) {
					for(int prime : primeSet) {
						if(n%prime == 0) {
							if(n != prime) {
								primeFactor[cnt] = prime;
								cnt++;
							}else {
								primeFactor[cnt] = prime;
								break label;
							}
						}
					}
					
				}
				
			}
			bw.flush();
		}catch(IOException e) {
			
		}
	}
}
