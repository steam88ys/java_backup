package package01;

public class ValueOfExam {

	public static void main(String[] args) {

		char ch = 'A';	// 문자
		String strData1 = "A";	// 문자열
		String strData2;
		strData2 = String.valueOf(ch);
		// ch가 가지고 있는 데이터를 문자열로 변경한다.
		// valueOf(ch);메소드는 static으로 정의 되어 있어서 클래스 이름으로 호출
		
		if(strData1.equals(strData2))
			System.out.println("같음");
		else
			System.out.println("다름");
		
	}

}
