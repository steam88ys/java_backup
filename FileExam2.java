package exception01;

import java.io.*;

public class FileExam2 {

	public static void main(String[] args) {
		try {
			// ��.��� Ŭ������ ����ó�� ������ �ۼ����� ������
			// ������ �߻��ϵ��� ����Ǿ� ����
			FileReader fr = new FileReader("datarr.txt");
			FileWriter fw = new FileWriter("dataww.txt");
			int c;
			while((c = fr.read()) != -1) {
				fw.write(c);
			}
		} catch (Exception e) {	// ��� ���ܸ� ó���� �ش�.
			System.out.println(e.toString());
		}
		
		
	}

}
