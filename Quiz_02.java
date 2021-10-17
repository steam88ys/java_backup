
public class Quiz_02 {

	public static void main(String[] args) {
		
		// 1116, 2556, 2880처럼 백의 자리와 십의 자리가 같은 수인 4자리 숫자중에서
		// 9의 배수인 수를 모두 출력하시오.
		// 또한 그 갯수도 세어서 출력하시오.
		// (단, 결과값은 한 줄에 10개씩 출력할 것)
		int h, t, cnt=0;
		for(int i=1000; i<10000; i++) {
			h = (i/100)%10;
			t = (i/10)%10;
			if((h==t) && (i%9==0)) {
				cnt++;
				System.out.print(i+" ");
					
				if(cnt%10==0) {
					System.out.println();
				}
			}	
 		}
		
		System.out.println();
		System.out.println("총 갯수는 "+cnt+"개 입니다.");
		
	}

}
