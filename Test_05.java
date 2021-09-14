
public class Test_05 {

	public static void main(String[] args) {
			
//		for (int i=1; i<=10; i++) {
//			System.out.println(Math.random());	
//		}
		
		
		for(int i=1; i<=100; i++) {
			int num = (int)(Math.random()*100) + 1;	// 1 ~ 5를 나타내기
			System.out.println(num);
		}
		
	}

}
