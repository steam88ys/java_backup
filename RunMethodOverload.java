package test.overload;

import java.util.Scanner;

public class RunMethodOverload {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		MethodOverloadTest ot = new MethodOverloadTest();
		
		System.out.println("------------�� ���� ����------------");
		System.out.print("���� 1 �Է� : ");
		int n1 = s.nextInt();
		System.out.print("���� 2 �Է� : ");
		int n2 = s.nextInt();
		System.out.printf("�� ���� �� >>  %d + %d = %d\n\n", n1, n2, ot.calc(n1, n2));
		
		System.out.println("------------�� ���� ����------------");
		System.out.print("�Ǽ� 1 �Է� : ");
		double n3 = s.nextDouble();
		System.out.print("�Ǽ� 2 �Է� : ");
		double n4 = s.nextDouble();
		System.out.printf("�� ���� �� >>  %.1f * %.1f = %.3f\n", n3, n4, ot.calc(n3, n4));
		
		s.close();
		
	}

}
