package silver5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class Bj2869Re3 {
	public static void main(String[] args) {
		InputStream is = System.in;
		InputStreamReader ir = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(ir);
		
		OutputStream os = System.out;
		OutputStreamWriter ow = new OutputStreamWriter(os);
		BufferedWriter bw = new BufferedWriter(ow);
		
		//문제조건
		//v미터인 나무막대 올라감
		//낮a미터 올라가고 밤b미터 떨어짐
		//올라가는데 며칠?
		
		//a*n-(b*(n-1))>=v
		//an-(bn-b)>=v
		//an-bn+b>=v
		//(a-b)n+b>=v
		//(a-b)n>=v-b(v>b이므로 양수)
		//n>=(v-b)/(a-b)
		//만약(v-b)/(a-b)가 실수타입이라면 n은 그걸 올림한 값
		
		try(br;bw){
			String[] input = br.readLine().split(" ");
			int a = Integer.parseInt(input[0]);
			int b = Integer.parseInt(input[1]);
			int v = Integer.parseInt(input[2]);
			//(v-b)%(a-b)의 나머지가 0이면 그 값이 결과값
			//나머지가 0이 아니면 올림한 결과가 결과값
			int day = 0;
			
			if((v-b)%(a-b) == 0) {
				day = (v-b)/(a-b);
			}else {
				day = (int)Math.ceil((v-b)/(double)(a-b));
				//double은 float보다 소수점 아래를 더 많이 표현할 수 있어
                //정확도가 높긴하지만 근본적인 해결 방안이 아님..
			}
			
			bw.write(day + "");
			bw.flush();
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}
	}
}
