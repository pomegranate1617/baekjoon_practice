package silver5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class Bj3009Re {
	public static void main(String[] args) {
		//<조건>
		//3개의 점
		//축에 평행한 직사각형
		//각 좌표는 1이상1000이하의 정수
		//-----------------
		//입력: 세개의 좌표
		//출력: 나머지 하나의 좌표
		
		
		//<문제 쪼개기>
		//입력받기
		//x좌표 또는 y좌표중 같은 값끼리 짝짓고 짝지어지지 않은 x,y값을 얻기
		//결과 출력
		//--------------------
		//정리
		//4번째 좌표까지 찍었을 때 직사각형의 조건에 부합하는가.
		//직사각형의 가로의 길이와 세로의 길이가 같아야 함
		//x좌표또는 y좌표가 각각 짝지어질 수 있어야함.(직각조건유지)
		
		
		//<데이터 흐름>
		//좌표 3개를 입력받음
		//각각 x좌표배열과 y좌표배열로 나뉘어서 저장
		//resultX -> 짝지어지지 않은 x의 좌표
		//resultY -> 짝지어지지 않은 y의 좌표
		//(resultX,resultY)출력
		
		
		InputStream is = System.in;
		InputStreamReader ir = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(ir);
		
		OutputStream os = System.out;
		OutputStreamWriter ow = new OutputStreamWriter(os);
		BufferedWriter bw = new BufferedWriter(ow);
		
		try(br;bw) {
			int[] xArr = new int[3];
			int[] yArr = new int[3];
			for(int i=0;i<3;i++) {
				String[] input = br.readLine().split(" ");
				xArr[i] = Integer.parseInt(input[0]);
				yArr[i] = Integer.parseInt(input[1]);
			}
			//배열에서 중복제거
			if(xArr[0] == xArr[1]) {
				xArr[0] = 0;
				xArr[1] = 0;
			}
			if(xArr[0] == xArr[2]) {
				xArr[0] = 0;
				xArr[2] = 0;
			}
			if(xArr[1] == xArr[2]) {
				xArr[1] = 0;
				xArr[2] = 0;
			}
			
			if(yArr[0] == yArr[1]) {
				yArr[0] = 0;
				yArr[1] = 0;
			}
			if(yArr[0] == yArr[2]) {
				yArr[0] = 0;
				yArr[2] = 0;
			}
			if(yArr[1] == yArr[2]) {
				yArr[1] = 0;
				yArr[2] = 0;
			}
			
			int resultX = 0;
			int resultY = 0;
			for(int i=0;i<xArr.length;i++) {
				if(xArr[i] != 0) {
					resultX = xArr[i];
				}
				if(yArr[i] != 0) {
					resultY = yArr[i];
				}
			}
			bw.write(resultX + " " + resultY );
			bw.flush();
	
		}catch(IOException e) {
			System.out.println(e.getStackTrace());
		}
		
		
	}
}
