package test.score;

import java.util.Scanner;

public class DynamicArrayScore {

	public static void main(String[] args) {
		String[] stuNames = {"김윤서", "배서연", "백지민", "최자윤", "황유솔"};
		Scanner s = new Scanner (System.in);
		System.out.print("학생 수를 입력해주세요 : ");
//		학생 수
		int stuNum = s.nextInt();		
		
		int[][] scores = new int[stuNum][];
		int[] sum = new int [stuNum];
		
//		동적배열의 행(학생 수)에 대한 for문
		for(int i= 0 ; i<scores.length; i++) {
			System.out.print("* "+stuNames[i]+"학생의 과목 수를 입력해주세요 : ");
			int subNum = s.nextInt();
			scores[i] = new int[subNum];
//			동적배열의 열(과목 수)에 대한 for문
			for(int j = 0; j<scores[i].length; j++) {
				System.out.print((j+1)+"과목 성적 입력 : ");
				scores[i][j] = s.nextInt();
				sum[i] += scores[i][j];
			}
		}
		
//		출력
		for(int i=0; i<scores.length; i++) {
			System.out.print(stuNames[i]+"\t");
			for(int j = 0; j<scores[i].length; j++){
				System.out.print(scores[i][j]+" ");
			}
			System.out.print("합계 : "+sum[i]+"\t");
			System.out.printf("평균 : %.1f\n", ((double)sum[i] / scores[i].length));
		}
		
		s.close();

	}

}
