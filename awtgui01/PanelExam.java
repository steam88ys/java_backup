package awtgui01;

import java.awt.*;

public class PanelExam extends Frame{
	public PanelExam() {
		super("Panel");
		Panel p = new Panel();	// Panel ��ü ����
		p.setBackground(Color.blue);	// Panel�� ������ �Ķ������� ����
		add(p);	// ���� Frame�� Panel�� ����
		setSize(300, 80);
		setVisible(true);
	}

	public static void main(String[] args) {
		new PanelExam();	// �͸��� ��ü ����
		// PanelExam p = new PanelExam();
	}

}
