package silver5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class Bj2581Re {
	public static void main(String[] args) {
		//조건
		//m이상 n이하 자연수 중 소수인것들 찾기
		//그 소수들의 합 구하기
		//그 소수들 중 최솟값 구하기
		//소수 없을 경우 첫째줄에 -1출력
		
		//문제 쪼개기
		//1과 자기자신 이외로 나누어지는 수는 제외
		//1은 소수가 아님
		//소수인 수들 중 최소값primeMin찾기
		//소수들의 합 primeNumSum구하기
		
		
		InputStream is = System.in;
		InputStreamReader ir = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(ir);
		
		OutputStream os = System.out;
		OutputStreamWriter ow = new OutputStreamWriter(os);
		BufferedWriter bw = new BufferedWriter(ow);
		
		try(br;bw){
			int m = Integer.parseInt(br.readLine());
			int n = Integer.parseInt(br.readLine());
			
			int primeMin = 0;
			int primeNumSum = 0;
			for(int i=m;i<=n;i++) {
				if(i == 1) {
					continue;
				}
				boolean primeCheck = true;
				for(int j=2;j<=i-1;j++) {
					if(i%j==0) {
						primeCheck = false;
						break;
					}
				}
				if(primeCheck == true) {
					if(primeMin == 0) {
						primeMin = i;
					}
					primeNumSum += i;
				}
			}
			if(primeNumSum == 0) {
				bw.write("-1");
			}else {
				bw.write(primeNumSum + "\n");
				bw.write(primeMin + "");
			}
			bw.flush();
		}catch(IOException e) {
			System.out.println(e.getStackTrace());
		}
		
	}
}
