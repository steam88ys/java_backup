package TextInheritance03;

public class Student {
	
	// �������
	String name;
	String hakbun;
	String phone;
	String juso;
	String major;
	
	// ������
	public Student() {}
	public Student(String name, String hakbun) {
		this.name = name;
		this.hakbun = hakbun;
	}
	
	// �޼ҵ� �ۼ�
		void study() {
			System.out.println("�����ϴ�.");
		}
		void eat() {
			System.out.println("�Ļ��ϴ�.");
		}
		void test() {
			System.out.println("���躸��.");
		}
		void extra_act() {
			System.out.println("���Ƹ� Ȱ���ϴ�.");
		}
	
}
