package thread06;

import java.util.Iterator;

public class Summing {
	private int sum;
	
	public synchronized void sumTo(int num) {
		sum=0;
		for(int i=1; i<=num; i++) {
			sum+=i;
			System.out.print("������: "+Thread.currentThread().getName());
			System.out.println("�� 1 ~ "+i+"������ ���� "+sum);
			
			try {
				Thread.sleep(500);
			}catch(InterruptedException e) {}
		}
	}
	public int getSum() {return sum;}

}