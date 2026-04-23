package silver5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

public class Bj15552Re {
	public static void main(String[] args) throws Exception{
		
		InputStream is = System.in;
		InputStreamReader ir = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(ir);
		
		OutputStream os = System.out;
		OutputStreamWriter ow = new OutputStreamWriter(os);
		BufferedWriter bw = new BufferedWriter(ow);

		
		int t = Integer.parseInt(br.readLine());
		int i = 0;
		while(i<t) {
			String abInputLine = br.readLine();
			String[] arr = abInputLine.split(" ");
			int a = Integer.parseInt(arr[0]);
			int b = Integer.parseInt(arr[1]);
			int sum = a + b;
			bw.write(sum+ "\n");
			i++;
		}
		bw.flush();
		br.close();
		bw.close();
		
		
	}
}
