package silver5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Bj5073Re2 {
	public static void main(String[] args) {
		//문제 조건
		//가장 긴 변<나머지 두변의 길이합
		//가장 긴변,나머지 두 변을 위한 변수3개 필요
		//각 줄에는 1000넘지 않는 양의 정수 3개 입력됨.
		//종료 조건 0 0 0 =>계산 x
		
		//문제 쪼개기
		//우선 한 줄 입력받기 => 0 0 0 이 입력되면 입력종료
		//입력받은 수 파싱
		//가장 긴 변의 길이 찾기
		//나머지 두 변의 길이 합 구하기
		//가장 긴 변<두변의 합 인지 판별
		//길이가 같은 변의 개수 구하기
		//어떤 삼각형인지 판별 후 출력
		
		//데이터 흐름
		//입력 스트림으로 입력 한 줄로 받기 (변수 input사용),IOException예외처리 필요
		//파싱 후 각 숫자가 1000이 넘으면 초기화후 입력 계속 반복
		//while문 반복횟수를 표현할 cnt 필요
		//세 변의 길이를 저장할 배열 sideArr필요(길이 3)
		//변수max = 가장 긴 변
		
		InputStream is = System.in;
		InputStreamReader ir = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(ir);
		
		OutputStream os = System.out;
		OutputStreamWriter ow = new OutputStreamWriter(os);
		BufferedWriter bw = new BufferedWriter(ow);
		try(br;bw){

			while(true) {
				int[] sideArr = new int[3];
				int max = -1;
				int shortSideSum = 0;
				String input = br.readLine();
				
				if(input.equals("0 0 0")) {
					break;
				}
				
				StringTokenizer st = new StringTokenizer(input," ");
				int cnt = 0;
				
				while(st.hasMoreTokens()) {
					int side = Integer.parseInt(st.nextToken());
					
					if(side>1000 || side<=0) {
						break;
					}
					else {
						sideArr[cnt] = side;
						cnt++;
					}
				}
				
				if(cnt<2) {
					continue;
				}
				
				for(int i=0;i<sideArr.length;i++) {
					if(max<sideArr[i]) {
						if(max != -1) {
							shortSideSum += max;
							max = sideArr[i];
						}else {
							max = sideArr[i];
						}
					}
					else {
						shortSideSum += sideArr[i];
					}
				}
				
				if(shortSideSum>max) {
					Set<Integer> set = new HashSet<>();
					for(int i=0;i<sideArr.length;i++) {
						set.add(sideArr[i]);
					}
					if(set.size()>=3) {
						bw.write("Scalene\n");
					}
					else if(set.size()>=2) {
						bw.write("Isosceles\n");
					}
					else {
						bw.write("Equilateral\n");
					}
				}else {
					bw.write("Invalid\n");
				}
				
			}
			bw.flush();
			
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}
		
		
		
		
	}
}
