
public class Test_19 {

	public static void main(String[] args) {

		int ballArr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		int ball3[] = new int[3];
		
		for(int x = 1; x<=10; x++) {
			
			int i = (int)(Math.random()*9);	// i = 0 ~ 9
			int j = (int)(Math.random()*9);	// j = 0 ~ 9
			
			//System.out.println("i = "+i+", j = "+j);
			
			int temp = 0;
			temp = ballArr[i];
			ballArr[i] = ballArr[j];
			ballArr[j]= temp;
			
		}
		
		// 중간값 확인
		/*for(int i=0; i<ballArr.length; i++) {
			System.out.print(ballArr[i]+" ");
		}*/
		
		/*for(int i=0; i<ball3.length; i++) {
			ball3[i] = ballArr[i];
		}*/
		
		// 방법3
		System.arraycopy(ballArr, 0, ball3, 0, 3);
		
		
		//System.out.println(ball3[0]+" "+ball3[1]+" "+ball3[2]);
		
		for(int i=0; i<ball3.length; i++) {
			System.out.print(ball3[i]+" ");
		}
		
		
		
	}

}
