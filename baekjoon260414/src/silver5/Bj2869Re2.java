package silver5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
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
		
		long day = 0;
		try(br;bw) {
				String text = br.readLine();
				
				String[] num = text.split(" ");
				
				long a =Integer.parseInt(num[0]);
				long b = Integer.parseInt(num[1]);
				long v = Integer.parseInt(num[2]);
				
//				if(v/n>=)
					
				
				bw.write(String.valueOf(day));
				bw.flush();
		}
		catch(Exception e) {
			
		}
		
	}
}
