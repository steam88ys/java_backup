package thread03;

public class Top implements Runnable{	
	// DerivedThread�� Thread Ŭ������ �ݵ�� ��� �޾ƾ� �Ѵ�.
	public void run() {
		for(int i=0; i<20; i++) {
			System.out.print(i + "\t");
		}
	}

}
