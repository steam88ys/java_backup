package thread06;

import java.util.Iterator;

public class Summing {	// 메소드를 동기화
	// 동기화는 스레드 객체가 먼저 실행하는 쪽이 이메소드를
	// 실행종료까지 점유하게 된다.
	private int sum;
	
	public synchronized void sumTo(int num) {
		sum=0;
		for(int i=1; i<=num; i++) {
			sum+=i;
			System.out.print("스레드: "+Thread.currentThread().getName());
			System.out.println("의 1 ~ "+i+"까지의 합은 "+sum);
			
			try {
				Thread.sleep(500);	// 0.5초 실행을 지연
			}catch(InterruptedException e) {}
		}
	}
	public int getSum() {return sum;}

}