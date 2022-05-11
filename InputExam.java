package bytecode;

import java.io.*;

public class InputExam {
	public static void streamTest(InputStream is) {
		// InputStream is = System.in으로 표현 가능
		// is객체변수는 키보드로부터 입력받는 read()메소드 사용할 수 있음
		try {
			while(true) {
				int i = is.read();	// 키보드로 부터 1개의 문자를 입력
				if(i == -1) break;	// CTRL+Z누르면 break문장 실행
				char c = (char)i;	// 형변환
				System.out.print(c);	// 출력
				// 한글데이터 처리 불가
			}
		}catch(IOException e) {
			System.err.println(e);
		}
	}

	public static void main(String[] args) {
		streamTest(System.in);	// streamTest()메소드 호출
	}

}
