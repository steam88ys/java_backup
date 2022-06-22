package exception01;

import java.io.*;

public class FileExam7 {

	public static void main(String[] args) {

		try {
			FileReader file = new FileReader("c:/Temp/test123.java");
		} catch(FileNotFoundException fe) {	// 파일을 찾을 수 없을때 발생하는 예외
			System.out.println(fe.toString());
		}
		
	}

}
