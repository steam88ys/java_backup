package thread02;

public class DerivedThread extends Thread{	
	// DerivedThread는 Thread 클래스를 반드시 상속 받아야 한다.
	public void run() {
		for(int i=0; i<20; i++) {
			System.out.print(i + "\t");
		}
	}

}
