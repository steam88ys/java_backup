package CharacterCode;

import java.io.*;

public class BufferedReaderExam {

	public static void main(String[] args) {
		InputStreamReader bi = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(bi);
		
		// BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			String aa = br.readLine();	
			// Ű����� ���� ���� ������ �����͸� �о aa�� ����
			System.out.println(aa);
			br.close();
			bi.close();
		}catch(IOException ie) {}
		
	}

}
