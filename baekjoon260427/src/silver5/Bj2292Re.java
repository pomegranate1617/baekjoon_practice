package silver5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class Bj2292Re {
	public static void main(String[] args) {
		//문제 조건
		//중앙은 1이고 그를 육각형 모양으로 여러겹 둘러싸고 있는 벌집
		//중앙에서 n까지의 몇개의 방 지나는지 계산
		
		//문제쪼개기
		//n입력
		//1을 둘러싼 각 껍질은 1-6-12-18-24..으로 한 층마다 6칸씩 증가
		//n이 어느 껍질 층에 있는지 확인
		//n이 1과 직선거리에 있는 수 중에서 어느만큼 벗어나는지 확인
		//x번째 (1이 있는 층 제외)껍질의 한 변읜 길이는 x+1
		//n은 1에 6*i(i=1,2,3...)를 더해 누적한 값이 처음으로 n보다 커질때
		//해당 i번째 껍질층에 있다.(누적값이 n보다 크면 break)
		//해당 층에서 제일 큰 수와 거기서 x씩 빼서 나오는 수는 그 층의 꼭짓점		
		//x씩 빼서 나온수가 처음으로 n보다 작아지면 그 수와 그 수+x 사이에 n이
		//위치한 것으로 두 꼭지점 중 가까운 거리를 이동한 거리에 +시킨다.
		
		//데이터 경로
		//n입력
		//n이 어느껍질층에 있는지 확인
		//해당 껍질 층의 꼭짓점을 찾아 n이 어느 꼭짓점과 가까운지 확인
		//x번째 껍질층+제일 가까운 꼭짓점과의 거리를 출력
		
		InputStream is = System.in;
		InputStreamReader ir = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(ir);
		
		OutputStream os = System.out;
		OutputStreamWriter ow = new OutputStreamWriter(os);
		BufferedWriter bw = new BufferedWriter(ow);
		
		try(br;bw){
			int n = Integer.parseInt(br.readLine());
			
			if(n == 1) {
				bw.write("0");
			}
			else {
				int layerLastNum = 1;//해당 껍질층의 최고 수
				int i =0;//껍질 층
				while(true) {
					layerLastNum += (6*i);
					i++;
					if(layerLastNum >= n) {
						break;
					}	
				}
				
				int minPoint = -1;//n이 속해있는 변의 최소값(꼭짓점)
				int maxPoint = -1; //n이 속해있는 변의 최대값(꼭짓점)
				while(true) {
					layerLastNum -= i;//해당층의 한변의 길이는 i+1,꼭짓점에서 다음 꼭짓점까지의 거리는 i
					if(layerLastNum <= n) {
						minPoint = layerLastNum;
						maxPoint = layerLastNum+i;
						break;
					}
				}
				
				if(n == maxPoint || n == minPoint) {
					bw.write(i+1+"");
				}else {
					int maxPointLength = maxPoint - n;
					int minPointLength = n - minPoint;
					if(maxPointLength>=minPointLength) {
						bw.write(i+1+"");//1의 층을 포함해서 계산
					}else {
						bw.write(i+1+"");
					}
				}	
			}
			bw.flush();

		}catch(IOException e) {
			System.out.println(e.getMessage());
		}
		
	}
}
