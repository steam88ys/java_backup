package awtgui01;

import java.awt.*;

public class v2 extends Frame{
	public v2() {
		super("��ư");
		Panel p = new Panel();	// Panel ��ü ����
		
		Button b1 = new Button("Ȯ��");
		Button b2 = new Button("���");
		Button b3 = new Button("����");
		
		p.add(b1);
		p.add(b2);
		p.add(b3);
		add(p);
		setSize(400, 100);
		setVisible(true);
	}

	public static void main(String[] args) {
		new v2();	// �͸��� ��ü ����
		// PanelExam p = new PanelExam();
	}

}
