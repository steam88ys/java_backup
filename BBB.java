package test.t2;

import test.t1.MainTest;

//	MainTest�� �ٸ� ��Ű��
public class BBB {

	public void accessTest() {
		MainTest mt = new MainTest();
//		�ٸ���Ű�������� public�� ����		
		System.out.println(mt.n1);//public
//		System.out.println(mt.n2);//private
//		System.out.println(mt.n3);//protected
//		System.out.println(mt.n4);//default
	}
	
}
