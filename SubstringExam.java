package package01;

public class SubstringExam {

	public static void main(String[] args) {

		String strData1 = "I Love You";
		String strData3;
		
		strData3 = strData1.substring(7);
		// strData1�� ����Ű�� ���ڿ��� 7��° ������ ���ڿ��� ��ȯ
		// ���ڿ��� ��ġ�� 0���� ���
		System.out.println("strData1.substring(7)==>"+strData3);
		
		strData3 = strData1.substring(2, 5);
		// ���۹�����ġ(2��°) ���ں��� �����ؼ� ������-1(5-1)���� ���ڿ��� ��ȯ
		// 2~4���� ���ڿ�
		System.out.println("strData1.substring(2, 5)==>"+strData3);
		
	}

}
