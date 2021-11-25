
public class Test_18 {

	public static void main(String[] args) {

		int score[] = {79, 88, 91, 33, 100, 55, 95};
		
		//반복물을 한번 이용하여 max에 최대값, min에 최소값을 넣어 출력하시오.
		int max = score[0], min = score[0];
		
		for(int i=1; i<score.length; i++ ) {
			if(score[i]>max) max = score[i];
			if(score[i]<min) min = score[i];
		}
		
		System.out.println("최대값 : "+max+"\n최소값 : "+min);
		
		
	}

}
