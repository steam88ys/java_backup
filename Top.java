package thread05;

public class Top implements Runnable{
	public void run() {
		for(int i=0; i<30; i++) {
			System.out.print(Thread.currentThread().getName()+i+"\t");
		}
	}
}
