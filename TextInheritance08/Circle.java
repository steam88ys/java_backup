package TextInheritance08;

public class Circle extends Shape {

	private String type = "��";
	
	// �� ���� (Overriding)
	public void draw() {
		System.out.println(type + " �׸���");
	}
	
	// �Ϲ� �޼ҵ�
	public void painting() {
		System.out.println("�� ĥ�ϱ�");
	}
	
}
