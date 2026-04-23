package silver5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class Bj3009 {
	public static void main(String[] args) {
		InputStream is = System.in;
		InputStreamReader ir = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(ir);
		
		OutputStream os = System.out;
		OutputStreamWriter ow = new OutputStreamWriter(os);
		BufferedWriter bw = new BufferedWriter(ow);
		
		
		try (br;bw){
			int i = 0;
			int[] xArr = new int[3];
			int[] yArr = new int[3];
			
			while(i<3) {
				String input = br.readLine();
				String[] arr = input.split(" ");
				int x = Integer.parseInt(arr[0]);
				int y = Integer.parseInt(arr[1]);
				xArr[i] = x;
				yArr[i] = y;
				i++;
			}
			
			int minX = xArr[0];
			int maxX = xArr[0];
			int minY = yArr[0];
			int maxY = yArr[0];
			for(int j=1;j<3;j++) {
				if(minX>xArr[j]) {
					minX = xArr[j];
				}
				if(maxX<xArr[j]) {
					maxX = xArr[j];
				}
				if(minY>yArr[j]) {
					minY = yArr[j];
				}
				if(maxY<yArr[j]) {
					maxY = yArr[j];
				}
			}
			
			for(int j=1;j<3;j++) {
				
			}
			
		}catch(IOException e) {
			
		}
		
		
	}
}

