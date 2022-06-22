package Exception01;
public class ThrowExam {
	public static void arrayMethod() throws ArrayIndexOutOfBoundsException {
		// try~catch문장 안에 있는 arrayMethod()메소드 안에서 예외가 발생되었을때
		// ArrayIndexOutOfBoundsException을 호출한 곳으로 던지라는 의미
		String[] irum = new String[3];
		irum[0] = "이미림";
		irum[1] = "마이스터";
		irum[2] = "뉴미디어소프트웨어";
		irum[3] = "뉴미디어솔루션";
	}

	public static void main(String[] args) {

		ThrowExam ts = new ThrowExam();
		
		try {
			arrayMethod();
		}catch(ArrayIndexOutOfBoundsException ae) {
			System.out.println("배열 예외 발생");
		}
		
	}

}
