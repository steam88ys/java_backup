package bytecode;

import java.io.IOException;

public class Echo1Exam {

	public static void main(String[] args) {

		int bt;
		try {
			bt = System.in.read();	// 1����Ʈ �����͸� �Է�
			// ���ڸ� �Է¹����� ���ϰ��� �ƽ�Ű�ڵ尪(ASCII CODE) 
			// 2����Ʈ �ѱ۵����ʹ� ó�� �Ұ�
			System.out.print((char)bt);
			// bt���� ���ڷ� �� ��ȯ
		}catch(IOException e) {
			System.err.println(e);
		}
		
	}

}
