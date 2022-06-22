package exception01;

public class NullPointerExam2 {

	public static void main(String[] args) {

		try {
			String str = null;
			System.out.println("문자열: " + str.length());
		}catch(NullPointerException npe) {
			System.out.println(npe.toString());
			// 어떤 예외가 발생했는지 출력
		}finally {
			System.out.println("무조건 실행");
		}
		
		
	}

}
