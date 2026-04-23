package silver5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Bj1085 {
	public static void main(String[] args) {
		InputStream is = System.in;
		InputStreamReader ir = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(ir);
		
		OutputStream os = System.out;
		OutputStreamWriter ow = new OutputStreamWriter(os);
		BufferedWriter bw = new BufferedWriter(ow);
		
		try (br;bw){
			String input = br.readLine();
			String[] arr = input.split(" ");
			
			int x = Integer.parseInt(arr[0]);
			int y = Integer.parseInt(arr[1]);
			int w = Integer.parseInt(arr[2]);
			int h = Integer.parseInt(arr[3]);
			while(w<1 | w>1000 | h<1 | h>1000 | x<1 | x>w-1 | y<1 |y>h-1) {
				input = br.readLine();
			}
			
			int min = x-0;;
			
			int length1 = y-0;
			int length2 = w-x;
			int length3 = h-y;
			if(min>length1) {
				min = length1;
			}
			if(min>length2) {
				min = length2;
			}
			if(min>length3) {
				min = length3;
			}
			bw.write(String.valueOf(min));
			bw.flush();
			bw.close();
			
		}catch(IOException e) {
			
		}
		
		
	}
}
