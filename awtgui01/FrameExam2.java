package awtgui01;

import java.awt.Frame;

public class FrameExam2 extends Frame{
	public FrameExam2() {
		super("����");
		// �θ�Ŭ���� Frame�� ������ �߿��� ���ڿ��� �޴� ������ ����
		// -> Frame("����");�� �����ϸ鼭 Frame�� Ÿ��Ʋ�� ǥ��
		this.setLocation(500, 200);
		setSize(350, 100);
		setVisible(true);
	}

	public static void main(String[] args) {
		FrameExam2 f = new FrameExam2();
	}

}
