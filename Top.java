package thread03;

public class Top extends Thread{	
	// DerivedThread�� Thread Ŭ������ �ݵ�� ��� �޾ƾ� �Ѵ�.
	public void run() {
		for(int i=0; i<20; i++) {
			System.out.print(i + "\t");
		}
	}

}
