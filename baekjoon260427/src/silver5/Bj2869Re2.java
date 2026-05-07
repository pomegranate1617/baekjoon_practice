package silver5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class Bj2869Re2 {
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
		//(a-b)n>=v-b(v>b이므로로 양수)
		//n>=(v-b)/(a-b)
		//만약(v-b)/(a-b)가 실수타입이라면 n은 그걸 반올림한 값
		try(br;bw){
			String[] input = br.readLine().split(" ");
			int a = Integer.parseInt(input[0]);
			int b = Integer.parseInt(input[1]);
			int v = Integer.parseInt(input[2]);
			
			int day = (int)Math.ceil((v-b)/(float)(a-b));
			//왜 100 99 1000000000값을 넣을때만 이상하게 나오지?
			//0이 너무 많아서 부동소수점때문에 이상해지나?
			//float의 정밀도는 소수점 7자리까지..
			//double을 쓰면 상황은 해결되지만 근본적인 해결방법은 아님>>여전히 부동소수점 방식이기 때문
			
			bw.write(day + "");
			bw.flush();
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}
	}
}
