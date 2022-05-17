package bytecode;

import java.io.*;

public class BufferedExam {

	public static void main(String[] args) {

		BufferedInputStream bi = new BufferedInputStream(System.in);
		// Ű����� ���� 1����Ʈ�� ���� �� �ְ�, ���۸� ����ϰڴ�.
		// bi��ü������ in��ü�� �޼ҵ���� ����� �� �ִ�.
		
		BufferedOutputStream bo = new BufferedOutputStream(System.out);
		// 1����Ʈ�� ����ϴ� ��ü�ε� ���۸� ����ؼ� ����ϰڴ�.
		// ���۸� ����ϴ� ������ ������ ���� ���� ��쿡 �ӵ��� ��������.
		
		int aa;
		
		try {
			while( (aa = bi.read()) != -1) {
				bo.write(aa);	// bo�� ����Ű�� �ӽñ������� ���ۿ� ����Ѵ�.
			}
			bo.flush();	// ���ۿ� ����Ǿ� �ִ� �����͸� �Ѳ����� ȭ�鿡 ����Ѵ�.
		}catch(IOException e) {}
		
	}

}
