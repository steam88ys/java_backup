package bytecode;

import java.io.*;

public class FileStreamExam2 {

	public static void main(String[] args) throws IOException {

		byte[] b = new byte[1024];
		FileInputStream fis = new FileInputStream("C:/Temp/tin.txt");
		// ������ C:/Temp/tin.txt
		// fis�� "tin.txt" ������ ����Ű�� ��ü����
		FileOutputStream fos = new FileOutputStream("C:/Temp/tout.txt");
		// fos�� "tout.txt" ������ ����Ű�� ��ü����
		fis.read(b);
		// fis�� ����Ű�� "tin.txt" ���Ͽ��� �����͸� �о �迭 b�� ����
		fos.write(b);
		// �迭 b�� ����Ǿ��ִ� �����͸� fos�� ����Ű�� "tout.txt"���Ͽ� ���
		fos.close();	// ������ �ݾ��ش�. fis��ü������ �� �̻� fin.txt ������ ������� �ʰڴ�.
		fis.close();	// ������ ������ ��ü������ �������� �Ѵ�.
		
	}

}
