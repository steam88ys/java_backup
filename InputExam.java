package bytecode;

import java.io.*;

public class InputExam {
	public static void streamTest(InputStream is) {
		// InputStream is = System.in���� ǥ�� ����
		// is��ü������ Ű����κ��� �Է¹޴� read()�޼ҵ� ����� �� ����
		try {
			while(true) {
				int i = is.read();	// Ű����� ���� 1���� ���ڸ� �Է�
				if(i == -1) break;	// CTRL+Z������ break���� ����
				char c = (char)i;	// ����ȯ
				System.out.print(c);	// ���
				// �ѱ۵����� ó�� �Ұ�
			}
		}catch(IOException e) {
			System.err.println(e);
		}
	}

	public static void main(String[] args) {
		streamTest(System.in);	// streamTest()�޼ҵ� ȣ��
	}

}
