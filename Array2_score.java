package Array;

import java.util.Scanner;

public class Array2_score {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		int hap=0, max=0, win=0, su=0;
		int [][]a=new int [5][3];
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[i].length; j++) {
				if(0<=su && su<=20) {		// 각 항목의 점수는 0-20점 사이의 점수만 입력 받음
					su = scan.nextInt();
					a[i][j]=su;
					hap+=a[i][j];
				}
			}
			if(max<hap) {
				max=hap;
				win=(i+1);
			}
			hap=0;
		}
		System.out.println("최고팀 : "+win+"번째 팀 -> 점수 : "+max);
		
	}

}