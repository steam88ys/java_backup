package exception01;

public class NullPointerExam2 {

	public static void main(String[] args) {

		try {
			String str = null;
			System.out.println("���ڿ�: " + str.length());
		}catch(NullPointerException npe) {
			System.out.println(npe.toString());
			// � ���ܰ� �߻��ߴ��� ���
		}finally {
			System.out.println("������ ����");
		}
		
		
	}

}
