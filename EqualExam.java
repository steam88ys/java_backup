package package01;

public class EqualExam {

	public static void main(String[] args) {

		String str1 = "mirim";
		String str2 = "mirim";
		String str3 = new String("meister");
		String str4 = new String("meister");
		
		if(str1 == str2)	System.out.println("�ּ� ����.");
		else	System.out.println("�ּ� �ٸ���.");
		
		if(str3 == str4)	System.out.println("�ּ� ����.");
		else	System.out.println("�ּ� �ٸ���.");
		
		if(str1.equals(str2))	System.out.println("���� ����.");
		else	System.out.println("���� �ٸ���.");
		// str1�� ����Ű�� ���ڿ��� ����� str2�� ����Ű�� ���ڿ��� ������ ���� ���
		// true���� ��ȯ
		
		if(str3.equals(str4))	System.out.println("���� ����.");
		else	System.out.println("���� �ٸ���.");
		
	}

}
