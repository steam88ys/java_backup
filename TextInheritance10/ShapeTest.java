package TextInheritance10;

public class ShapeTest extends ShapeExam {
// �߻� Ŭ������ ��� �޾ұ� ������ ShapeExamŬ������ �ִ� ��� �߻�޼ҵ带
// ��� �߻�޼ҵ带 ����(ShapeExam)Ŭ������ �����ؾ� �Ѵ�.
	@Override
	public double getArea (double r) {
		return 3.14 * r * r;
	}
	
	@Override
	public double getCircum (double r) {
		return 2 * 3.14 * r;
	}
	
}
