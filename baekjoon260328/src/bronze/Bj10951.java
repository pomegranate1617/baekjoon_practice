//package bronze;
//
//import java.util.Scanner;
//
//public class Bj10951 {
//	public static void main(String[] args) {
//		
//		Scanner sc = new Scanner(System.in);
//		
//		while(true) {
//			Thread name = Thread.currentThread();
//			try {
//				long start = System.nanoTime();
//				int a = sc.nextInt();
//				int b = sc.nextInt();
//				sc.close();
//				System.out.println(a+b);
//				long end = System.nanoTime();
//				if(end - start>=3000) {
//					name.sleep(2000);
//				}
//			}
//			catch(InterruptedException e) {
//				break;
//			}
//					
//		}
//		
//	}
//}
