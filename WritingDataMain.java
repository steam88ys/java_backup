package prepare;

import java.io.*;

public class WritingDataMain {

	public static void main(String[] args) {

		sungDataExam wd = new sungDataExam();
		try {
			wd.readingData("C:/Temp/sung_read.txt");
			wd.writingData("C:/Temp/sung_write.txt");
		}catch(IOException e) {
			e.printStackTrace();
		}
		
	}

}
