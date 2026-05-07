package silver5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class Bj2292Re2 {
	public static void main(String[] args) {
		//문제 조건
		//중앙은 1이고 그를 육각형 모양으로 여러겹 둘러싸고 있는 벌집
		//중앙에서 n까지의 몇개의 방 지나는지 계산(1포함)
		
		//문제쪼개기
		//n입력
		//1을 둘러싼 각 껍질은 1-6-12-18-24..으로 한 층마다 6칸씩 증가
		//n이 어느 껍질 층에 있는지 확인
		//n은 1에 6*i(i=1,2,3...)를 더해 누적한 값이 처음으로 n보다 커질때
		//해당 i번째 껍질층에 있다.(누적값이 n보다 크면 break)
		
		//데이터 경로
		//n입력
		//n이 어느껍질층에 있는지 확인
		
		InputStream is = System.in;
		InputStreamReader ir = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(ir);
		
		OutputStream os = System.out;
		OutputStreamWriter ow = new OutputStreamWriter(os);
		BufferedWriter bw = new BufferedWriter(ow);
		
		try(br;bw){
			int n = Integer.parseInt(br.readLine());
			
//			if(n == 1) {//불필요한 코드
//				bw.write("1");
//			}
//			else {
				int layerLastNum = 1;//해당 껍질층의 최고 수
				int i =0;//껍질 층수
				while(true) {
					i++;
					layerLastNum += (6*i);
					if(layerLastNum >= n) {
						break;
					}	
				}
				bw.write(i+1+"");//1포함한 거리
//			}
			bw.flush();

		}catch(IOException e) {
			System.out.println(e.getMessage());
		}
		
	}
}
