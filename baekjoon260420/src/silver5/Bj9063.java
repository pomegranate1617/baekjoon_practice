package silver5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class Bj9063 {
	public static void main(String[] args) {
		
		InputStream is = System.in;
		InputStreamReader ir = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(ir);
		
		OutputStream os = System.out;
		OutputStreamWriter ow = new OutputStreamWriter(os);
		BufferedWriter bw = new BufferedWriter(ow);
		
		try(br;bw){
			int n = Integer.parseInt(br.readLine());
			int[] xPoint = new int[n];
			int[] yPoint = new int[n];
			
			for(int i =0;i<n;i++) {
				String point = br.readLine();
				String[] arr = point.split(" ");
				xPoint[i] = Integer.parseInt(arr[0]);
				yPoint[i] = Integer.parseInt(arr[1]);
			}
			
			int minX = xPoint[0];
			int maxX = xPoint[0];
			
			for(int i =0;i<xPoint.length;i++) {
				if(minX>xPoint[i]) {
					minX = xPoint[i];
				}
				if(maxX<xPoint[i]) {
					maxX = xPoint[i];
				}
			}
			
			int minY = yPoint[0];
			int maxY = yPoint[0];
			
			for(int i =0;i<yPoint.length;i++) {
				if(minY>yPoint[i]) {
					minY = yPoint[i];
				}
				if(maxY<yPoint[i]) {
					maxY = yPoint[i];
				}
			}
			
			int width = maxX - minX;
			int height = maxY - minY;
			String area = (width*height) + "";
			bw.write(area);
			bw.flush();
		}catch(IOException e) {
			
		}
	}
}
