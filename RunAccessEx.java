package test.accessmodifier;

public class RunAccessEx {

	public static void main(String[] args) {

		AccessBaseSample a1 = new AccessBaseSample();
		
		a1.n1 = 100;
		a1.setN2(50);
		
		System.out.printf("a1.n1 = %d, a1�� �����ϴ� ��ü�� n2 = %d", a1.n1, a1.getN2());
		
	}

}
