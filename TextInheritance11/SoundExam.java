package TextInheritance11;

public class SoundExam {

	public static void main(String[] args) {

		Sound radio = new Radio();	// UpCasting�� ������
		// radio��ü������ RadioŬ�������� �� ���ǵ� �޼ҵ忡 ����
		Sound tv = new TV();		// UpCasting�� ������
		// tv��ü������ TVŬ�������� �� ���ǵ� �޼ҵ忡 ����
		radio.SoundUp(5);
		tv.SoundUp(5);
		
	}

}
