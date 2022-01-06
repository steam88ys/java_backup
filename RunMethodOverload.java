package test.overload;

import java.util.Scanner;

public class RunMethodOverload {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		MethodOverloadTest ot = new MethodOverloadTest();
		
		System.out.println("------------두 수의 덧셈------------");
		System.out.print("정수 1 입력 : ");
		int n1 = s.nextInt();
		System.out.print("정수 2 입력 : ");
		int n2 = s.nextInt();
		System.out.printf("두 수의 합 >>  %d + %d = %d\n\n", n1, n2, ot.calc(n1, n2));
		
		System.out.println("------------두 수의 곱셈------------");
		System.out.print("실수 1 입력 : ");
		double n3 = s.nextDouble();
		System.out.print("실수 2 입력 : ");
		double n4 = s.nextDouble();
		System.out.printf("두 수의 곱 >>  %.1f * %.1f = %.3f\n", n3, n4, ot.calc(n3, n4));
		
		s.close();
		
	}

}
