package package03;

public class ValueOfExam {

	public static void main(String[] args) {

		String stri = "123456";
		String strd = "123.56";
		
		System.out.println(Integer.valueOf(stri));
		// stri�� ����Ű�� ���ڿ��� ������ ���ڷ� ����
		System.out.println(Double.valueOf(strd));
		// strd�� ����Ű�� ���ڿ��� �Ǽ��� ���ڷ� ����
		// ���� valueOf()�޼ҵ�� ���ڿ��� ���ڷ� �����Ѵ�.
		
		System.out.println(Integer.valueOf(stri) + Double.valueOf(strd));
		
	}

}
