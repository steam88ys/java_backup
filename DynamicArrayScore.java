package test.score;

import java.util.Scanner;

public class DynamicArrayScore {

	public static void main(String[] args) {
		String[] stuNames = {"������", "�輭��", "������", "������", "Ȳ����"};
		Scanner s = new Scanner (System.in);
		System.out.print("�л� ���� �Է����ּ��� : ");
//		�л� ��
		int stuNum = s.nextInt();		
		
		int[][] scores = new int[stuNum][];
		int[] sum = new int [stuNum];
		
//		�����迭�� ��(�л� ��)�� ���� for��
		for(int i= 0 ; i<scores.length; i++) {
			System.out.print("* "+stuNames[i]+"�л��� ���� ���� �Է����ּ��� : ");
			int subNum = s.nextInt();
			scores[i] = new int[subNum];
//			�����迭�� ��(���� ��)�� ���� for��
			for(int j = 0; j<scores[i].length; j++) {
				System.out.print((j+1)+"���� ���� �Է� : ");
				scores[i][j] = s.nextInt();
				sum[i] += scores[i][j];
			}
		}
		
//		���
		for(int i=0; i<scores.length; i++) {
			System.out.print(stuNames[i]+"\t");
			for(int j = 0; j<scores[i].length; j++){
				System.out.print(scores[i][j]+" ");
			}
			System.out.print("�հ� : "+sum[i]+"\t");
			System.out.printf("��� : %.1f\n", ((double)sum[i] / scores[i].length));
		}
		
		s.close();

	}

}
