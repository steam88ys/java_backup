
public class Test_14 {

	public static void main(String[] args) {
		
		/*
		for(int i=1; i<=5; i++) {
			System.out.println(i);
		}
		
		int j=1;
		while(j<=5) {
			System.out.println(j);
			j++;
		}
		*/
		
		/*
		// while문을 이용해서 1~10사이의 홀수만 출력하기
		int su=0;
		while(true) {
			su++;
			if(su==10) break;
			if(su%2==0) continue;
			System.out.print(su+" ");
		}
		
		System.out.println("반복문 탈출후 su = "+su);
		*/
		
		int w = 10;
		do {
			System.out.println("do while문의 w = "+w);
		}while(w<=5);
		
	}

}
