package package01;

public class Trim {

	public static void main(String[] args) {
		
		String strData1 = "  I Love You  ";	// ���ڿ�
		String strData2;
		strData2 = strData1.trim();
		System.out.println("strData2.trim() ==>"+strData2);
		// strData1�� ����Ű�� ���ڿ����� ��, ���� ������ �����ϴ� �޼ҵ�
		
		if(strData1.equals(strData2))
			System.out.println("����");
		else
			System.out.println("�ٸ�");
		
	}

}
