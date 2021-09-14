package Array;

import java.util.Scanner;

public class Weaksu {

	public static void main(String[] args) {
		Scanner scan=new Scanner (System.in);
		int su;
		int cnt=0;
		int [] r_cnt=new int [10];
		
		System.out.print("약수를 구할 수 입력 : ");
		su=scan.nextInt();
		
		for(int i=1; i<=su; i++) {
			if(su%i==0) {
				r_cnt[cnt]=i;
				cnt++; 
			}
		}
		for(int i=0; i<cnt; i++) {
			System.out.println("약수 : "+r_cnt[i]);
		}
		
		
		
	}

}

//약순지 물어보고 배열에 넣어서 출력
