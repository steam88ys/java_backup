package CharacterCode;

import java.io.*;

public class InputReaderExam {

	public static void main(String[] args) {

		Reader reader = new InputStreamReader(System.in);
		// reader��ü������ read()�޼ҵ忡 ���� Ű����� ����
		// �����͸� �Է¹��� �� �ִ� ������ ����
		try {
			while(true) {
				int i = reader.read();	// Ű����� ���� �Է¹���
				if( i == -1) break;	// CTRL+Z(-1)
				char c = (char)i;
				System.out.print(c);
			}
		}catch(IOException e) {
			System.out.println(e);
		}
		System.out.println();
		
	}

}
