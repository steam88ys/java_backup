package test.arr1;

import java.util.Scanner;

public class ScoreTest {

	public static void main(String[] args) {
//		������ ������ �� �ִ� 1���� �迭 ���� �� ��ü����
		int[] scores= new int[5];
		
//		keyboard�κ��� ������ �Է� �ޱ� ���� Scanner ��ü ����
		Scanner s = new Scanner(System.in);	
		
		int sum = 0;
//		�迭�� ���� ��ŭ ���� ������ �Է� �޾Ƽ� �����ϰ� ��ü�հ踦 ���Ѵ�.
		for(int i = 0; i<scores.length; i++) {
			System.out.print((i+1) + "���� ���� �Է�: ");
			scores[i] = s.nextInt();
			sum += scores[i];
		}
		
		System.out.println("���հ� : " + sum);
		double avg = (double) sum / scores.length;
		System.out.printf("���: %.2f\n", avg);
		s.close();
		
	}

}
