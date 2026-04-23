package silver5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class Bj2869Re {
	public static void main(String[] args) {
		InputStream is = System.in;
		InputStreamReader ir = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(ir);
		
		OutputStream os = System.out;
		OutputStreamWriter ow = new OutputStreamWriter(os);
		BufferedWriter bw = new BufferedWriter(ow);
		
		int height = 0;
		int day = 0;
		try {
				String text = br.readLine();
				
				String[] num = text.split(" ");
				
				long a =Integer.parseInt(num[0]);
				long b = Integer.parseInt(num[1]);
				long v = Integer.parseInt(num[2]);
				
				while(true) {
					height += a;
					day++;
					if(height >=v) {
						break;
					}
					height -= b;
					if(height<0) {
						height = 0;
					}
					
					
				}	
				bw.write(String.valueOf(day));
				bw.flush();
	
		}catch(Exception e){
			
		}
		finally {
			try {
				br.close();
				bw.close();
			}catch(Exception e) {
				
			}
			
		}
		
	}
}
