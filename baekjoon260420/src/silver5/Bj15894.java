package silver5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class Bj15894 {
	public static void main(String[] args) {
		InputStream is = System.in;
		InputStreamReader ir = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(ir);
		
		OutputStream os = System.out;
		OutputStreamWriter ow = new OutputStreamWriter(os);
		BufferedWriter bw = new BufferedWriter(ow);
		
		try(br;bw) {
			long input = Long.parseLong(br.readLine());
			String result = (input *4) + "";
			bw.write(result);
			bw.flush();
		}catch(IOException e) {
			
		}
	}
}
