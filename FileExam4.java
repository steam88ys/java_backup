package exception01;

public class FileExam4 {
	public static void main (String[] args) {
		String[] irum = new String[3];
		int jumsu = 99;
		int count = 10;
		int avg = 0;
		
		try {
			avg = jumsu / count;
			// count�� 0 �϶� catch(ArithmeticException ae1)�� ����ȴ�
			for(int i = 0; i<=irum.length; i++)
				System.out.println(irum[i]);
			// irum[3]�Ǿ����� catch (ArrayIndexOutOfBoundsException ae2)
		}catch(ArithmeticException ae1) {
			System.out.println("0���� ������ ���ܹ߻�");
		}catch (ArrayIndexOutOfBoundsException ae2) {
			System.out.println("�迭�� ���� ��� ���ܹ߻�");
		}catch (Exception e) {	// ���� 2������ ���ܰ� �ƴѰ�� �����Ѵ�.
			System.out.println("���ܹ߻�");
		}
	}
	
}
