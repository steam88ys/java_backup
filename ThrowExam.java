package Exception01;
public class ThrowExam {
	public static void arrayMethod() throws ArrayIndexOutOfBoundsException {
		// try~catch���� �ȿ� �ִ� arrayMethod()�޼ҵ� �ȿ��� ���ܰ� �߻��Ǿ�����
		// ArrayIndexOutOfBoundsException�� ȣ���� ������ ������� �ǹ�
		String[] irum = new String[3];
		irum[0] = "�̸̹�";
		irum[1] = "���̽���";
		irum[2] = "���̵�����Ʈ����";
		irum[3] = "���̵��ַ��";
	}

	public static void main(String[] args) {

		ThrowExam ts = new ThrowExam();
		
		try {
			arrayMethod();
		}catch(ArrayIndexOutOfBoundsException ae) {
			System.out.println("�迭 ���� �߻�");
		}
		
	}

}
