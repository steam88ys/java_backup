import java.util.Scanner;

public class Test_21 {

	public static void main(String[] args) {

		// 10명의 학생수의 수학점수를 입력받아, 배열에 넣은 후
		// 반복문을 이용하여 전체총점과 평균을 구하고자 한다.
		
		/*int scores[] = new int[10];
		int sum = 0;
		double avg = 0.0;
		Scanner scan = new Scanner (System.in);
		
		for(int i=0; i<scores.length; i++) {
			System.out.print((i+1)+"번 학생의 수학점수 입력 : ");
			scores[i] = scan.nextInt();
			sum += scores[i];
		}
		
		System.out.println();
		System.out.println("전체 총점 : "+sum);
		avg = (double)sum/scores.length;
		System.out.println("전체 평균 : "+avg);*/
		
		int su;
		Scanner scan = new Scanner (System.in);
		System.out.print("학생수를 입력하세요 : ");
		su = scan.nextInt();
		
		String [] name = new String [su];
		int [][] score = new int [su][5];
		
		int total = 0;
		
		for(int i = 0; i<su; i++) {
			System.out.print((i+1)+"번 이름 : ");
			name[i] = scan.next();
			
			System.out.print("국어 : ");
			score[i][0] = scan.nextInt();
			
			System.out.print("영어 : ");
			score[i][1] = scan.nextInt();
			
			System.out.print("수학 : ");
			score[i][2] = scan.nextInt();
			
			score[i][3] = score[i][0] + score[i][1] + score[i][2];
			
			score[i][4] = (int)(score[i][3] / 3);
			
			total += score[i][3];
		}
		
		System.out.println();
		System.out.println("============================================");
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균");
		System.out.println("============================================");
		for(int i=0; i<name.length; i++) {
			System.out.print(name[i] + "\t");
			
			for(int j=0; j<5; j++) {
				System.out.print(score[i][j]+"\t");
			}
			System.out.println();
		}
		
		System.out.println("============================================");
		
		System.out.println("전체 총점 : "+total);
		System.out.println("전체 평균 : "+(double)total/name.length);
		
	}

}
