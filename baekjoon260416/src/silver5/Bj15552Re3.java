package silver5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Bj15552Re3 {
	public static void main(String[] args) throws IOException{
		InputStream is = System.in;
		InputStreamReader ir = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(ir);
		
		OutputStream os = System.out;
		OutputStreamWriter ow = new OutputStreamWriter(os);
		BufferedWriter bw = new BufferedWriter(ow);
		
		String input = br.readLine();
		
		int[] arr = new int[3];
		int cnt = 0;
		StringTokenizer st = new StringTokenizer(input," ");
		while(st.hasMoreTokens()) {
			arr[cnt] = Integer.parseInt(st.nextToken());
			cnt++;
		}
		
		int v = arr[2];
		int a = arr[0];
		int b = arr[1];
		
		int height = 0;
		int days = 0;
		
		while(height<v) {
			days++;
			height += a;
			if(v<=height) {
				break;
			}
			if(b>height) {
				height = 0;
				continue;
			}
			else {
				height -= b;
			}	
		}
		bw.write(String.valueOf(days));
		bw.flush();
		br.close();
		bw.close();
		
	}
}
